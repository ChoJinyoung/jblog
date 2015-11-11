<%@ page language="java" contentType="text/html; charset=UTF-8"
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
			<h1 class="blogtitle">${vo.title }</h1>
			<p class="blogtag">
				${vo.tag}
			</p>
			<ul>
		      <li><a href="">로그아웃</a></li>
		      <li><a href="/jblog/blog/list">내 블로그 가기</a></li>
		    </ul>  
		</div>
	    <table class="content">
	      <tr><td height="10" colspan="10">&nbsp;</td></tr>
	      <tr>
	      	<td height="10" width="20">&nbsp;</td>
	      	<td width="530" valign="top" class="tdcontent">
		      	<!-- 메뉴 시작 -->     
		      	<strong>기본설정</strong>
		      	&nbsp;&nbsp; 
	    	  <a class="title" href="/jblog/blog/categoryform?blogNo=${vo.blogNo }">카테고리</a>
	    	  	&nbsp;&nbsp;
	      		<a class="title" href="/jblog/blog/writeform">글작성</a>
	      		&nbsp;&nbsp;
	      		<!-- 메뉴 끝 -->           	
	      	</td> 
	      </tr>
	      <tr><td height="5">&nbsp;</td></tr>
	      <tr>
	      	<td height="10">&nbsp;</td>
	      	<td>
	      	
	      	<!-- 작업 화면  시작 -->    
	      	<form id="basic-form" method="post" action="/jblog/blog/basic"> 
	      	<input type="hidden" name="userNo" value="${vo.userNo}">  
			<input type="hidden" name="blogNo" value="${vo.blogNo}">	
	      	<table>
	      		<tr>
	      			<td width="150" class="inputlabel">블로그 제목 :</td>
	      			<td><input placeholder="${vo.title}" class="inputtext" type="text" size="40" name="title"></td>
	      		</tr>
	      		<tr>
	      			<td width="150" class="inputlabel">블로그 태그 :</td>
	      			<td><input placeholder="${vo.tag}" class="inputtext" type="text" size="50" name="tag"></td>
	      		</tr>
	      		<tr>
	      			<td width="150" class="inputlabel">메인페이지 포스트  :</td>
	      			<td><input placeholder="${vo.cntDisplayPost}" class="inputtext" type="text" size="4" name="cntDisplayPost"></td>      			
	      		</tr>
	      		<tr>
	      			<td width="150" class="inputlabel">로고이미지  :</td>
	      			<td>&nbsp;<img height="80" src="/jblog/assets/images/j2eelogo.jpg" border="0"></td>      			
	      		</tr>      		
	      		<tr>
	      			<td width="150" class="inputlabel">&nbsp;</td>
	      			<td><input placeholder="${vo.fileName}" class="inputtext" type="text" size="40" name="fileName">
	      			<input type="submit" value="찾아보기"></td>      			
	      		</tr>           		
	      	</table>
	      	<input class="modifybutton" type="submit" value="완료">
	      	</form>
	      	<!-- 작업 화면  끝 -->  
	      	         	      	
	      	</td>
	      </tr>
	      <tr>
	      	<td height="10" colspan="10">&nbsp;</td>
	      </tr>
	    </table>
	    <div class="blogfooter">
      		J2EE 이야기 is powered by JBlog
		</div>
	</div>
   	
</body>
</html>