<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JBlog - J2EE 이야기</title>
<Link rel="stylesheet" href="/jblog/assets/css/theme.css">
</head>
<body class="jblog">
	<div class="continer">
		<div class="head">
			<h1 class="blogtitle">J2EE 이야기</h1>
			<p class="blogtag">자바, 컨퍼런스, java</p>
			<ul>
				<li><a href="">로그아웃</a></li>
				<li><a href="/jblog/blog/list">내 블로그 가기</a></li>
			</ul>
		</div>
		<table class="content">
			<tr>
				<td height="10" colspan="10">&nbsp;</td>
			</tr>
			<tr>
				<td height="10" width="20">&nbsp;</td>
				<td width="530" valign="top" class="tdcontent">
					<!-- 메뉴 시작 --> <a class="title" href="/jblog/blog/basicform">기본설정</a>
					&nbsp;&nbsp; <strong>카테고리</strong> &nbsp;&nbsp; <a class="title"
					href="/jblog/blog/writeform">글작성</a> &nbsp;&nbsp; <!-- 메뉴 끝 -->
				</td>
			</tr>
			<tr>
				<td height="5">&nbsp;</td>
			</tr>
			<tr>
				<td height="10">&nbsp;</td>
				<td>
					<!-- 작업 화면  시작 -->
					<table class="tbl-category">
						<tr>
							<td>번호</td>
							<td>카테고리명</td>
							<td>보이기</td>
							<td>포스트 수</td>
							<td>설명</td>
							<td>삭제</td>
						</tr>
						<c:forEach items='${list }' var='vo' varStatus="status">
						<tr>
							
								<td>${vo.categoryNo }</td>
								<td>${vo.categoryName }</td>
								<td>${vo.displayType }</td>
								<td>${vo.cntDisplayPost }</td>
								<td>${vo.description }</td>
								<td>&nbsp;<img height="9"
									src="/jblog/assets/images/delete.jpg"></td>
						</tr>
						</c:forEach>
					</table>
					 
					<form action="/jblog/blog/categoryinsert" method="post">
					<c:forEach items="${list }" var="vo" varStatus="status">
					<input type="hidden" name="blogNo" value="${vo.blogNo }">
					<input type="hidden" name="categoryNo" value="${vo.categoryNo }">
					</c:forEach>
						<table>
							<tr>
								<td height="5">&nbsp;</td>
							</tr>
							<tr>
								<td height="5">&nbsp;</td>
							</tr>
							<tr>
								<td class="tdcontent" height="5"><b>새로운 카테고리 추가</b></td>
							</tr>
							<tr>
								<td height="5">&nbsp;</td>
							</tr>
							<tr>
								<td width="150" class="inputlabel">카테고 리명 :</td>
								<td><input class="inputtext" type="text" size="40"
									name="categoryName"></td>
							</tr>
							<tr>
								<td width="150" class="inputlabel">보이기 유형 :</td>
								<td class="tdcontent">
								<input type="radio" name="displayType" value="title" checked="checked">타이틀&nbsp;&nbsp; 
								<input type="radio" name="displayType" value="text">텍스트&nbsp;&nbsp;</td>
							</tr>
							<tr>
								<td width="150" class="inputlabel">설명 :</td>
								<td><input class="inputtext" type="text" size="50"
									name="description"></td>
							</tr>
							<tr>
								<td height="5">&nbsp;</td>
							</tr>
							<tr>
								<td colspan="10" align="center">&nbsp;<input type="submit"
									value="카테고리 추가"></td>
							</tr>
						</table>
					</form> 
					
					<!-- 작업 화면  끝 -->

				</td>
			</tr>
			<tr>
				<td height="10" colspan="10">&nbsp;</td>
			</tr>
		</table>
		<div class="blogfooter">J2EE 이야기 is powered by JBlog</div>
	</div>
</body>
</html>