import matplotlib.pyplot as plt
from wordcloud import WordCloud
import jieba
from os import path
from scipy.misc import imread
 
text_from_file = open('./meeting_cms.txt','rb').read().decode('utf-8')
 
wordlist_after_jieba = jieba.cut(text_from_file, cut_all = True)
wl_space_split = " ".join(wordlist_after_jieba)

# 获取当前文件路径
# __file__ 为当前文件, 在ide中运行此行会报错,可改为
#d = path.dirname('.')
d = path.dirname(__file__)

# 设置背景图片
back_coloring = imread(path.join(d, "./image/love.jpg"))
wc = WordCloud(
        font_path='C:\Windows\Fonts\simfang.ttf',#设置字体
        background_color="black", #背景颜色
        max_words=2000,# 词云显示的最大词数
        mask=back_coloring,#设置背景图片
        #max_font_size=100, #字体最大值
        random_state=42,
    ).generate(wl_space_split)		# 生成词云, 可以用generate输入全部文本(中文不好分词),也可以我们计算好词频后使用generate_from_frequencies函数

plt.imshow(wc)
plt.axis("off")
plt.show()
# 保存图片  路径print(path.join(d, "名称.png"))
wc.to_file(path.join(d, "10line.png"))
