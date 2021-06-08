<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link href="css/loginCss.css" rel="stylesheet" type="text/css">
	</head>
	<body>
		<form action="/test3" method="post" class="LoginForm">
			<h1>Login</h1>
			<input type="text" name="id" placeholder="ID" id="input_id"><br/>
			<input type="password" name="password" placeholder="PW" id="input_pw"><br/>
			<input type="submit" value="Login" id="login">
		</form>
	</body>
</html>