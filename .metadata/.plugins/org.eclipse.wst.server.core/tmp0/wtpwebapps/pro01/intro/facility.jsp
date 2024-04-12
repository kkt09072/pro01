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
		<div style="width:1400px;margin:15px auto">
			<nav aria-label="breadcrumb" style="text-align:right">
			  <ol class="breadcrumb">
			    <li class="breadcrumb-item"><a href="#">Home</a></li>
			    <li class="breadcrumb-item"><a href="#">지역소개</a></li>
			    <li class="breadcrumb-item active" aria-current="page">지역 특징 및 시설안내</li>
			  </ol>
			</nav>
			<hr>
			<div id="tab1">
			<ul class="nav nav-tabs">
			  <li class="nav-item">
			    <a class="nav-link" href="${path0 }/intro/origin.jsp">지명유래</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link active" href="${path0 }/intro/facility.jsp">지역 특징 및 시설안내</a>
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
			<h3 class="page_title">지역 특징 및 시설안내</h3>
			<div class="jumbotron">
				<p>
					서울특별시 금천구에 있는 동이다. 서울디지털산업단지로 대표되는 서울의 제조업 및 상업 중심지이다. 면적으로는 금천구 최대의 동이자, 
					지역총생산액으로는 옆동네 구로동과 함께 서울시 최대 수준이다.
				</p>
				<p>	
					본래 한국수출산업국가산업단지로 조성된 행정구역인 만큼 서울시는 2030년을 목표로 국가기간산업으로 부상중인 
					지식기반산업 인력의 고용을 창출하기 위해 정보통신업체의 입주를 장려할 전망이다. 
					특히 남부순환로와 시흥대로 사이에 위치한 가산동 북동부는 일반주거지역과 준공업지역이 혼재되어있어 
					직장인들을 위한 주거지 건축사업이 확대될 전망이다.
				</p>
				<p>	
					서울시는 도시계획에 따라 가산디지털 산업단지, 마곡지역을 중심으로 디지털 콘텐츠 산업단지 발전을 지원하고, 
					디지털 콘텐츠 전시장 및 체험관 등 디지털 문화기반을 구축할 예정이다.
				</p>
				<p>
					가산동은 가산디지털단지가 위치한 곳이며, 실제로 동의 상당 면적을 가산디지털단지가 차지하고 있다.
					가산디지털단지가 있다보니 우리가 알 만한 회사의 본사들이 꽤 많이 여기에 위치해 있다.
				</p>
			</div>
			<div class="">
			</div>
		</div>	
	</section>
</div>
<div id="footer">
	<%@ include file="/footer.jsp" %>
</div>
</body>
</html>