<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원목록</title>
<link rel="stylesheet" href="/jblog/assets/css/theme.css">
</head>
<body>
	<a href="/jblog/main"><h1 class="s-logo">jBlog</h1></a>
	<ul class="menu">
		<li>회원목록</li>
		<li><a href="/jblog/main/registerform">회원등록</a></li>
		<li><a href="/jblog/main">로그아웃</a></li>
	</ul>
	<div class="user-list">
		<h2>블로그 사용자 수 : 2명</h2>
		<table>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>가입일</th>
			</tr>
			<c:forEach items='${list }' var='vo' varStatus='status'>
				<tr>
					<td>${vo.userId }</td>
					<td>${vo.userName }</td>
					<td>${vo.createdDate }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>