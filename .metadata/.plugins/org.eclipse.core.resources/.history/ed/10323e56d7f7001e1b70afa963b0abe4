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
#page1 { background-color:#ececec; height:calc(100vh - 158px); }
#page2 { background-color:#ffffff; }
#page3 { background-color:#ececec; }
#page4 { background-color:#ffffff; }
.page_title { font-size:36px; padding-top:2em; text-align:center; }
th.item1 { width:8%; }
th.item2 { width:60%; }
th.item3 { width:20%; }
</style>
</head>
<body>
<div id="header">
	<%@ include file="/header.jsp" %>
</div>
<div id="contents">
	<section class="page" id="page1">
		<figure id="vs">
			<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
			  <div class="carousel-inner">
			    <div class="carousel-item active">
			      <img src="${path0 }/images/vs4.png" class="d-block w-100" alt="...">
			    </div>
			    <div class="carousel-item">
			      <img src="${path0 }/images/vs5.png" class="d-block w-100" alt="...">
			    </div>
			    <div class="carousel-item">
			      <img src="${path0 }/images/vs6.png" class="d-block w-100" alt="...">
			    </div>
			  </div>
			 <button class="carousel-control-prev" type="button" data-target="#carouselExampleControls" data-slide="prev">
			    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
			    <span class="sr-only">Previous</span>
			  </button>
			  <button class="carousel-control-next" type="button" data-target="#carouselExampleControls" data-slide="next">
			    <span class="carousel-control-next-icon" aria-hidden="true"></span>
			    <span class="sr-only">Next</span>
			  </button>
			</div>
		</figure>
		<h3 class="page_title"></h3>
	</section>
	<section class="page" id="page2">
		<div style="width:1400px; margin:0 auto;">	
			<h3 class="page_title">Hot Place(핫 플레이스)</h3>
			
		</div>		
	</section>
	<section class="page" id="page3">
		<div style="width:1400px; margin:0 auto;">	
			<h3 class="page_title">최신 묻고 답하기</h3>
			
		</div>	
	</section>
	<section class="page" id="page4">
		<div style="width:1400px; margin:0 auto;">	
			<h3 class="page_title">최근 공지사항</h3>
			<div class="right_item" style="text-align:right;padding-bottom:12px;">
				<a href="${hpath }/NotiList.do" title="더보기" class="more">
					<i class="fas fa-plus fa-fw"></i> 더보기
				</a>
			</div>
			<table class="table" id="tb3">
				<thead>
					<tr>
						<th class="item1">번호</th>
						<th class="item2">제목</th>
						<th class="item3">작성일</th>
						<th class="item4">조회수</th>
					</tr>
				</thead>
				<tbody>
					<c:if test="${not empty latestNotiList }">
						<c:forEach var="dto" items="${latestNotiList }">
						<tr>
							<td>${dto.no }</td>
							<td>
								<c:if test="${empty sid }">
								<strong>${dto.title }</strong>
								</c:if>
								<c:if test="${not empty sid }">
								<a href="${path0 }/GetNotice.do?no=${dto.no }">${dto.title }</a>
								</c:if>
							</td>
							<td>${dto.resdate }</td><td>${dto.visited }</td>
						</tr>
						</c:forEach>
					</c:if>
					<c:if test="${empty latestNotiList }">
						<tr>
							<td colspan="4"><strong>공지사항이 존재하지 않습니다.</strong></td>
						</tr>
					</c:if>
				</tbody>
			</table>
		</div>
	</section>
</div>
<div id="footer">
	<%@ include file="/footer.jsp" %>
</div>
</body>
</html>