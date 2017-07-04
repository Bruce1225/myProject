package com.che.demo.time2017;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class D103_MyServlet extends HttpServlet {


	public static final String Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static final String url="jdbc:sqlserver://localhost:1433;DatabaseName=CMS_IDME";
	public static final String username="sa";
	public static final String password="123456";
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		boolean flag = false;
		Connection conn = null;
		try{
			Class.forName(Driver);
			conn = DriverManager.getConnection(url,username,password);
			Statement stat = conn.createStatement();
			String sql = " select * from sysuser where username = '123' and password = '123'";
			ResultSet rs = stat.executeQuery(sql);
			if(rs.next()){
				if(rs.getInt(1) > 0){
					System.out.println(rs.getInt(1));
					flag = true;
				}
			}
		} catch(Exception e){
			System.out.println(e.toString());
		} finally{
			try {
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		PrintWriter out = res.getWriter();
		out.println("PrintWriter hello doGet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res){

		System.out.println("hello doPost");
	}
	
}
