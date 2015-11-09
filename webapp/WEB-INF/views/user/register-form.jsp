<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원등록</title>
<Link rel="stylesheet" href="/jblog/assets/css/theme.css">
</head>
<body>
	<h1 class="s-logo">jBlog</h1>
	<ul class="menu">
		<li><a href="/jblog/main/userlistform">회원목록</a></li>
		<li>회원등록</li>
		<li><a href="/jblog/main">로그아웃</a></li>
	</ul>
	<form class="form-r-user" method="post" action="/jblog/main/register">
		<label>아이디</label>
		<input type="text" name="userId" value="">
		<label>비밀번호</label>
		<input type="text" name="password" value="">
		<label>이름</label>
		<input type="text" name="userName" value="">
		<input type="submit" value="등록">
	</form>
</body>
</html>