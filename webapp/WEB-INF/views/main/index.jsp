<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<!-- "webapp/WEB-INF/views/main/index.jsp" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JBlog</title>
<link rel="stylesheet" href="/jblog/assets/css/theme.css">
</head>
<body>
	<h1 class="s-logo">jBlog</h1>
		<table class="main-tbl">
			<tr>
				<td height="30">				
				<c:choose>
					<c:when test="${empty authUser}">
						<a href="/jblog/main/loginform"><strong>로그인</strong></a>
           				&nbsp;&nbsp;
           			</c:when>
					<c:otherwise>
						<a href="/jblog/main/logout"><strong>로그아웃</strong></a> 
						&nbsp;&nbsp;
						<a href="/jblog/blog/list?userNo=${vo.userNo }"><strong>내 블로그 가기</strong></a> 
						&nbsp;&nbsp;
						<c:if test="${vo.role == 'Admin'}">
							<a href="/jblog/main/userlistform"><strong>관리자</strong></a>&nbsp;&nbsp;
						</c:if>
					</c:otherwise>
				</c:choose>
				</td>
			</tr>
			<tr>
				<td height="20"><input type="text" name="searchKeyword"
					size="50"> <input type="submit" value="검색"></td>
			</tr>
			<tr>
				<td height="20" class="tdcontent">
				<input type="radio"
					name="searchCondition" checked>블로그 제목 &nbsp;&nbsp; <input
					type="radio" name="searchCondition">태그 &nbsp;&nbsp; <input
					type="radio" name="searchCondition">블로거</td>
			</tr>
		</table>
</body>
</html>