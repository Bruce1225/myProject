<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<html>
<head>
	<title>《Bootstrap + jsp开发案例》</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width; inital-scale=1">
	<script type="text/javascript" src="../assets/js/jquery-1.10.2.min.js"></script>
	<script type="text/javascript" src="../assets/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="../assets/js/login.js"></script>
	<link type="text/css" href="../assets/css/bootstrap.min.css" rel="stylesheet">
	
</head>
<body>
	Hello World!!
	<%
		String mid = request.getParameter("mid");
		String password = request.getParameter("password");
	%>
	<%!
		public static final String Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		public static final String url="jdbc:sqlserver://localhost:1433;DatabaseName=CMS_IDME";
		public static final String username="sa";
		public static final String PASSWORD="123456";
	%>
	<%
		boolean flag = false;
		Class.forName(Driver);
		Connection conn = DriverManager.getConnection(url,username,PASSWORD);
/* 		Statement stat = conn.createStatement();
		String sql = " select * from sysuser where username = '" + mid + "' and password = '" + password + "'";
		ResultSet rs = stat.executeQuery(sql);
*/
		String sql = " select * from sysuser where username = ? and password = ? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, mid);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){ 
			if(rs.getInt(1) > 0){
				flag = true;
			}
		}
		conn.close();
	%>
	<%
		if(flag){
	%>
			<h1>用户登录成功</h1>
	<%
		} else{
	%>
		<h1>登录失败，重新<a href="login.jsp"> 登录</a></h1>
	<%		
		}
	%>
	
</body>
</html>