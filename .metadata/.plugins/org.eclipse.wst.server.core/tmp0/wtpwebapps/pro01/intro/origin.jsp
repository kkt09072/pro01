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
.page { clear:both; min-height:100vh; margin:0; padding:0; }
#page1 { background-color:#ececec; min-height:calc(100vh - 158px); }
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
		<div style="width:1400px;margin:15px auto">
			<nav aria-label="breadcrumb d-flex justify-content-between">
			  <ol class="breadcrumb">
			    <li class="breadcrumb-item"><a href="#">Home</a></li>
			    <li class="breadcrumb-item"><a href="#">지역소개</a></li>
			    <li class="breadcrumb-item active" aria-current="page">지명유래</li>
			  </ol>
			</nav>
			<hr>
			<div id="tab1">
			<ul class="nav nav-tabs">
			  <li class="nav-item">
			    <a class="nav-link active" href="${path0 }/intro/origin.jsp">지명유래</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link" href="${path0 }/intro/facility.jsp">지역 특징 및 시설안내</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link" href="${path0 }/intro/history.jsp">연혁</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link" href="${path0 }/intro/map.jsp">오시는 길</a>
			  </li>
			</ul>
			</div>
			<hr>
			<h3 class="page_title">지명 유래</h3>
			<div class="jumbotron">
				<p>
					가산동은 원래 가리봉동의 일부 지역이었다.<br> 
					1995년 3월 1일 금천구가 구로구에서 분리되면서 가리봉동의 일부는 구로구 관할로, 
					또 일부는 금천구 관할로 나뉘어서 금천구 관할지역의 가리봉동 명칭을 가산동으로 바꾸었다. 
					가산동이라 부르게 된 이유는 1963년 1월 1일 시흥군 동면 시흥리, 독산리, 가리봉리, 신림리, 
					봉천리를 서울특별시 영등포구로 편입하여 관악출장소 관할 아래 두면서 ‘가리봉리’와 ‘독산리’를 
					합쳐 ‘가리봉리’의 ‘가’자와 ‘독산리’의 ‘산’자를 따서 행정동 명칭을 가산동이라 했다.
					1970년 5월 18일 관할구역 변경조례에 의하여 ‘가산동’은 ‘가리봉동’으로 변경(법정동은 가리봉동, 독산동)했다. 
					그 후 1975년 10월 1일 관할구역 변경시 가리봉동, 독산동으로 분리하여 각각 법정동명과 행정동명을 변경시켰다. 
					1995년 3월 1일 구로구에서 금천구가 분구되고, ′1963년도부터 ′1970년도까지의 행정동명을 따서 가산동이라 하였다.
				</p>
			</div>
			<br>
		</div>	
	</section>
	<section class="page" id="page1">
		<div style="width:1400px;margin:15px auto">
			<h3 class="page_title">행정구역 및 인구 현황</h3>
			<div class="">
				<table class="table">
					<thead>
						<tr>
							<th>행정동</th><th>인구</th><th>세대수</th>
							<th>면적</th><th>주택</th><th>법정동</th>
							<th>통수</th><th>반수</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>가산동</td><td>23,185명</td><td>16,140세대</td>
							<td>2.52㎢(구의 19.4%)</td><td>-</td><td>가산동</td>
							<td>33</td><td>254</td>
						</tr>
					</tbody>
				</table>
			</div>
			<figure class="map_data">
				<img src="${path0 }/images/geumcheon.png" alt="금천구 지도">
			</figure>	
		</div>
	</section>	
</div>
<div id="footer">
	<%@ include file="/footer.jsp" %>
</div>
</body>
</html>