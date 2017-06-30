<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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
	<div class="container">
		<form id="loginForm" action="check.jsp" method="post" class="form-horizontal">
			<fieldset>
				<legend><label><span class="glyphicon glyphicon-user"> 用户登录</span></label></legend>
				
				<div class="form-group" id="midDiv">
					<label class="col-md-3 control-label" for="mid">用户名：</label>
					<div class="col-md-5">
						<input type="text" id="mid" name="mid" class="for-contral" placeholder="请输入登录名">
					</div>
					<div class="col-md-4" id="midSpan"></div>
				</div>
				<div class="form-group" id="passwordDiv">
					<label class="col-md-3 control-label" for="mid">密码：</label>
					<div class="col-md-5">
						<input type="password" id="password" name="password" class="for-contral" placeholder="请输入密码">
					</div>
					<div class="col-md-4" id="passwordSpan"></div>
				</div>
				<div class="form-group" id="butDiv">
					<div class="col-md-5 col-md-offset-3">
						<button type="submit" id="submit" class="btn btn-xs btn-primary">登录</button>
						<button type="reset" id="reset" class="btn btn-xs btn-warning">重置</button>
					</div>
				</div>
			</fieldset>
		</form>
	</div>
</body>
</html>