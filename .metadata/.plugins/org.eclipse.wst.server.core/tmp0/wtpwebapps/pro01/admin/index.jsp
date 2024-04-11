<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<c:set var="path0" value="<%=request.getContextPath() %>" />    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title }</title>
<%@ include file="/head.jsp" %>
<style>
.container { width:1400px; }
.page { clear:both; height:100vh; }
#page1 { background-color:#ececec; }
#page2 { background-color:#42bcf5; }
.page_title { font-size:36px; padding-top:2em; text-align:center; }
</style>
</head>
<body>
<div id="header">
	<%@ include file="/header.jsp" %>
</div>
<div id="contents">
	<h2 class="title">관리자 페이지</h2>
	<div class="row">
		<aside id="lnb" class="col-3">
			<nav>
				<ul>
					<li><a href="${path0 }/MemberList.do">회원관리</a></li>
					<li><a href="${path0 }/NotiList.do">게시판 관리</a></li>
				</ul>
			</nav>
		</aside>
		<section class="page col-9" id="page1">
			<div style="width:100%; margin:0 auto;">
				<h3 class="page_title">${msg }</h3>
			</div>
		</section>
	</div>
</div>
<div id="footer">
	<%@ include file="/footer.jsp" %>
</div>
</body>
</html>