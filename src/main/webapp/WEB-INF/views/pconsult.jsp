<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/board.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/maicons.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet"href="vendor/owl-carousel/css/owl.carousel.css">
<link rel="stylesheet" href="vendor/animate/animate.css">
<link rel="stylesheet" href="css/theme.css">
<script src="js/jquery-3.5.1.min.js"></script>
<script src="js/bootstrap.bundle.min.js"></script>
<script src="vendor/owl-carousel/js/owl.carousel.min.js"></script>
<script src="vendor/wow/wow.min.js"></script>
<script src="js/theme.js"></script>
<script src="https://use.fontawesome.com/e23eda4ad0.js"></script>
<style type="text/css">

@font-face {
    font-family: 'MaruBuri-Regular';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-10-21@1.0/MaruBuri-Regular.woff') format('woff');
    font-weight: normal;
    font-style: normal;
}
@font-face {
 font-family: 'NanumBarunGothic';
 font-style: normal;
 font-weight: 400;
 src: url('//cdn.jsdelivr.net/font-nanumlight/1.0/NanumBarunGothicWeb.eot');
 src: url('//cdn.jsdelivr.net/font-nanumlight/1.0/NanumBarunGothicWeb.eot?#iefix') format('embedded-opentype'), url('//cdn.jsdelivr.net/font-nanumlight/1.0/NanumBarunGothicWeb.woff') format('woff'), url('//cdn.jsdelivr.net/font-nanumlight/1.0/NanumBarunGothicWeb.ttf') format('truetype');
}
body{
	font-family: 'MaruBuri-Regular';
}
.hidden{
	display: none;
}
</style>

  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
  <meta name="copyright" content="MACode ID, https://macodeid.com/">

</head>
<body>
<%@include file="header.jsp" %>
<table style="width: 68%; margin: 0 auto; margin-bottom: 1%">
	<thead>
	 <tr>
		<th>번호</th><th>작성자</th><th>제목</th><th>날짜</th><th>조회수</th>
	 </tr>
	</thead>
	<tbody>
	 
	 <c:forEach items="${pList}" var="plist">
	 <fmt:formatDate value="${plist.pdate }" var="pdate" pattern="yy-MM-dd"/>
	 <tr>
	 	<td>${plist.pnum}</td>
	 	<td>${plist.id}</td>
	 	<td><a href="pconsultDetail?${plist.pnum }">${plist.ptitle}</a></td>
	 	<td>${pdate}</td>
	 	<td>${plist.pcount}</td>
	 </tr>
	 </c:forEach>
	 
	 
	</tbody>
	<!-- paging -->
</table>
	<div style=" margin: 0 auto; text-align: center;">
		<c:forEach var="i" begin="${pg.startPage}" end="${pg.endPage }">
			<a href="pconsult?currentPage=${i}">${i}</a>
		</c:forEach>
	</div>
	
<%@include file="footer.jsp" %>
</body>
</html>