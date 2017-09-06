package com.che.demo.time2017;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//http://blog.csdn.net/wenzhi20102321/article/details/52582705
public class D0201_IO {
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:/myFolder");
		
		if(!file.exists() || file.isFile()){
			file.mkdir();
		}
		file = new File("D:/myFolder/IOTest/file01");
		file.mkdirs();
		file = new File("D:/myFolder/hello.txt");
		file.createNewFile();

//		写入数据
//		FileOutputStream ops = new FileOutputStream(file);
//		ops.write("hello".getBytes());
//		ops.flush();
//		ops.close();
		
		
		
	}

}
