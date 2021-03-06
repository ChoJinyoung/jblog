<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page 
language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JBlog - J2EE 이야기</title>
<link rel="stylesheet" href="/jblog/assets/css/theme.css">
</head>
<body class="jblog">
	<div class="continer">
		<div class="head">
			<h1 class="blogtitle">J2EE 이야기</h1>
			<p class="blogtag">
				자바, 컨퍼런스, java
			</p>
		</div>
	    <table class="content">
			<tr><td height="10px">&nbsp;</td></tr>
			<tr>
		      	<td width="20px">&nbsp;</td>
		      	<td width="530px" valign="top">
			      	<!-- 포스트 시작 -->
			      	<table class="singlepost">
			      	<c:forEach items='${list }' var='vo' varStatus="status">
			      		<tr><td class="posttitle"><a href="/jblog/blog/maindetail"> ${vo.title } </a></td></tr>
			      		<tr><td class="postdate"> ${vo.modifiedDate } , 덧글 1</td></tr>
			      	</c:forEach>
			      	</table>
			      	<!-- 포스트 끝-->      	
		      	</td>
		      	<td width="20px">&nbsp;</td>
		      	<td width="190px" valign="top">
		      	<!-- 로그인, 관리자 메뉴, 로고, 카테고리 시작 -->
		      	<table>
		      		<tr>
		      			<td>
				      		<a href="/toLogin">로그인</a>&nbsp;&nbsp;
				      		<a href="/logout">로그아웃</a>&nbsp;&nbsp;
				      		<c:forEach items='${list }' var='vo' varStatus="status">
		   						<a href="/jblog/blog/basicform?userNo=${vo.userNo }&&blogNo=${vo.blogNo}">블로그 관리</a>
		   					</c:forEach>
			      		</td>
			      	</tr>
		      		<tr><td height="5px">&nbsp;</td></tr>
		      		
		      		<tr><td><img height="80px" src="/jblog/assets/images/j2eelogo.jpg"></td></tr>
		      		<tr><td height="5px">&nbsp;</td></tr>
		      		<tr><td class="categorytitle">카테고리</td></tr>
		      		<tr><td class="categoryitem"><a class="title" href="#">프로그래밍</a></td></tr>
	    	  		<tr><td class="categoryitem"><a class="title" href="#">여행</a></td></tr>
	      			<tr><td class="categoryitem"><a class="title" href="#">사진</a></td></tr>	      		
		      	</table>
		      	<!-- 로그인, 관리자 메뉴, 로고, 카테고리 끝 -->
		      	</td>
		      </tr>
	    </table>
	    
	    <div class="blogfooter">
      		J2EE 이야기 is powered by JBlog
		</div>
	</div>
</body>
</html>