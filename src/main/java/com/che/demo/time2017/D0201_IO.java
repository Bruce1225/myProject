package com.che.demo.time2017;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//http://blog.csdn.net/wenzhi20102321/article/details/52582705
public class D0201_IO {
	public static void main(String[] args) throws IOException {
/*		
		File file = new File("D:/myFolder");
		
		if(!file.exists() || file.isFile()){
			file.mkdir();
		}
		file = new File("D:/myFolder/IOTest/file01");
		file.mkdirs();
		file = new File("D:/myFolder/hello.txt");
		file.createNewFile();
*/
//		写入数据
//		FileOutputStream ops = new FileOutputStream(file);
//		ops.write("hello".getBytes());
//		ops.flush();
//		ops.close();
		
		String s1 = "D:\\myFolder\\IOTest\\file01\\sql.txt";
		String s2 = "D:\\myFolder\\IOTest\\file02\\sql_副本3.txt";
/*		
		File file = new File(s1);
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(s2);
		int l;
		byte[] b = new byte[1024];
		long start = System.currentTimeMillis();
		while((l = fis.read(b)) != -1){
			fos.write(b, 0, l);
		}
		long end = System.currentTimeMillis();
		System.out.println("用时：" + (end - start));
		fos.close();
		fis.close();
*/	
/*		
		File file = new File("D:\\myFolder\\IOTest\\file01\\sql.txt");
		FileInputStream fis = new FileInputStream(s1);
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream(s2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int l;
		byte[] b = new byte[1024];
		long start = System.currentTimeMillis();
		while((l = bis.read(b)) != -1){
			bos.write(b, 0, l);
		}
		long end = System.currentTimeMillis();
		System.out.println("用时：" + (end - start));
		bis.close();
		bos.close();
//		fis.close();
//		fos.close();
*/
		InputStream is = new FileInputStream(s1);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		OutputStream os = new FileOutputStream(s2);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		int l;
		String s;
		byte[] b = new byte[1024];
		long start = System.currentTimeMillis();
		while((s = br.readLine()) != null){
			bw.write(s);
		}
		long end = System.currentTimeMillis();
		System.out.println("用时：" + (end - start));
		br.close();
		bw.close();
	}

}
