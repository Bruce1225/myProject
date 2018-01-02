<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>搜了个这!</title>
    <style>
    	*{
            margin: 0;
            padding: 0;
        }
        .content{
            display: inline;
            width: 100%;
            height: 400px;
            margin: 0;
            padding: 0;
        }
        input{
            display: inline-block;
            width: 800px;
            height: 100px;
            margin: 50px 50% 40px;
            position: relative;
            left: -400px;
            font-size: 50px;
            outline: none;
            border: 3px solid #823384;
            text-indent: 10px;
        }
        .engine{
            background-color: #ea6f5a;
            width: 100%;
            height: 400px;
            font-size: 0;
            position: relative;
        }
        .baidu{
            position: absolute;
            top:0;
            left:0;
            width: 50%;
            height: 600px;
            background-color: #0c8ac5;
            display: inline-block;
        }
        .san60{
            position: absolute;
            top:0;
            left:50%;
            width: 50%;
            height: 600px;
            background-color: #509839;
            display: inline-block;
        }
        .small_title{
            padding: 20px 0 5px 0;
            font-size: 70px;
            text-align: center;
            color: white;
            line-height: 80px;
            width: 100%;
            height:80px;
            overflow: auto;
        }
        .s_content{
            font-size: 30px;
            color: white;
            line-height: 60px;
            text-align: left;
            width:100%;
        }
        ul li{
            list-style-type: none;
            text-indent: 2em;
        }
        .clearfix:before, .clearfix:after{
            content: "";
            display: table;
        }
        .clearfix:after{
            clear:both;
        }
        /*适配非主流浏览器(IE浏览器)*/
        .clearfix{
            zoom:1;
        }
    </style>
    <script src="../assets/js/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            // 声明局变量,实时更新的 输入框内容
            var my_data;
            // 获取输入框元素
            var $my_input = $("input");
            // 输入框绑定响应函数
            $my_input.bind("input", get_val);
            // 函数负责获取实时输入的值,将值传递给负责请求的函数bd_ajax,执行 负责请求的函数
            function get_val() {
                // 获取输入框元素的值
                my_data = $my_input.val();
                // 执行查询百度智能提示的函数
                bd_ajax(my_data);
                // 执行查询360智能提示的函数
                san60_ajax(my_data);
            }
            //查百度
            function bd_ajax(my_data) {
                console.log("查询百度:"+my_data);
                // 使用ajax对实时输入的信息进行处理
                $.ajax({
                    //百度主页查看到的请求格式(aj) https://sp0.baidu.com/5a1Fazu8AA54nxGko9WTAnF6hhy/su?wd=aj&json=1&p=3&sid=1462_21092_20691_20718&req=2&csor=2&pwd=a&cb=jQuery11020040650310167581916_1506154185044&_=1506154185048

                    //将 问号以前的 截取出来,作为请求的地址
                    url:"https://sp0.baidu.com/5a1Fazu8AA54nxGko9WTAnF6hhy/su",
                    // 使用get方法进行请求
                    type:"get",
                    // 因为ajax默认不支持跨域请求,这里使用jsonp, 如果请求不跨域可以用 json
                    dataType:"jsonp",
                    // 相当于在 请求的地址后 加了wb=当前你输入的数据
                    data:{"wd":my_data},
                    // 百度返回的json数据与cb关联,通过jsonp 关联cb 就可以找到被关联的json数据(360搜索直接返回了json数据,所以360可以不写这一条)
                    jsonp:"cb"
                    //请求成功   执行的函数
                }).done(function (data) {
                    // 获取标签
                    var $con = $(".baidu .s_content ul");
                    // 将上次的内容清空
                    $con.html("");
                    // 通过循环将数据插入到页面
                    for (var i=0; i< data.s.length; i++){
                        li = data.s[i];
                        $con.append("<li>"+li+"</li>")
                    }
                    // 请求失败   执行的函数
                }).fail(function () {
                    console.log("请求失败")
                })
            }

            //查360
            function san60_ajax(my_data) {
                console.log("查询360:"+my_data);
                $.ajax({
                    //https://sug.so.360.cn/suggest?callback=suggest_so&encodein=utf-8&encodeout=utf-8&format=json&fields=word&word=zhao
                    url:"https://sug.so.360.cn/suggest",
                    type:"get",
                    dataType:"jsonp",
                    data:{"word":my_data}
                }).done(function (data) {
                    console.log("得到返回的数据为"+JSON.stringify(data.s));
                    var $con = $(".san60 .s_content ul");
                    console.log($con);
                    $con.html("");
                    for (var i=0; i< data.s.length; i++){
                        li = data.s[i];
                        $con.append("<li>"+li+"</li>")
                    }
                }).fail(function () {
                    console.log("请求失败")
                })
            }
        })
    </script>
</head>
<body>
	<div class="find_input">
	    <input type="text">
	</div>
	<div class="content clearfix">
	    <div class="engine clearfix">
	        <div class="baidu clearfix">
	            <div class="small_title clearfix">百度一下
	            </div>
	            <div class="s_content">
	                <ul>
	                </ul>
	            </div>
	        </div>
	        <div class="san60">
	            <div class="small_title">360
	            </div>
	            <div class="s_content">
	                <ul>
	                </ul>
	            </div>
	        </div>
	    </div>
	</div>
</body>
</html>