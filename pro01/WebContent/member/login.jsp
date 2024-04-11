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
	<section class="page" id="page1">
		<c:if test="${not empty msg}">
		<div style="width:1400px; margin:0 auto;">${msg }</div>
		</c:if>
		<div style="width:1400px; margin:0 auto;">
			<h3 class="page_title"><i class="fas fa-walking fa-fw"></i>로그인</h3>
			<form action="${path0 }/LogInPro.do" method="post">
				<table class="table">
					<tbody>
						<tr>
							<th><label for="id">아이디</label></th>
							<td>
								<input type="text" name="id" id="id" class="form-control" required>
							</td>
						</tr>
						<tr>
							<th><label for="pw">비밀번호</label></th>
							<td>
								<input type="password" name="pw" id="pw" class="form-control" required>
							</td>
						</tr>
					</tbody>
				</table>
				<hr>
				<div class="btn-group">
				  <button type="submit" class="btn btn-secondary">로그인</button>
				  <button type="reset" class="btn btn-secondary">취소</button>
				</div>
			</form>
		</div>
	</section>	
</div>
<div id="footer">
	<%@ include file="/footer.jsp" %>
</div>
</body>
</html>