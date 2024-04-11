<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<c:set var="fpath" value="<%=request.getContextPath() %>" />
<hr>    
<footer>
	<div class="ft_wrap">
		<nav id="fnb">
			<ul>
				<li><a href="${hpath }/member/terms.jsp">회원약관</a></li>
				<li><a href="${hpath }/member/policy.jsp">개인정보처리방침</a></li>
			</ul>
		</nav>
		<div id="loc">
			<select name="sel" id="sel" onchange="locate()">
				<option value="">해당 관광서</option>
				<option value="https://www.geumcheon.go.kr/portal/contents.do?key=651">가산동주민센터</option>
				<option value="https://www.smpa.go.kr/user/nd19306.do">가산파출소</option>
				<option value="https://www.life114.co.kr/html/board/view.asp?M_SEQ=1877802#google_vignette">서울가산디지털우체국</option>
			</select>
		</div>
		<script>
		function locate(){
			var sel = document.getElementById("sel");
			if(sel.value!=""){
				window.open(sel.value);
			}
		}
		</script>
		<br><br>
		<div id="copyright">
			<p class="addr">(우)08611 서울특별시 금천구 시흥대로73길 70 금천구 가산동 소개, 대표전화 : 02-2627-2114(120 다산콜센터로연결)</p>
			<p class="copy">COPYRIGHT(C) SEOUL GASAN INTRO. ALL RIGHTS RESERVED.</p>
		</div>
	</div> 
</footer>