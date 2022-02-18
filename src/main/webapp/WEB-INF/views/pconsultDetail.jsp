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

	<div class="container" style="margin: 5% auto;">
	<h2>게시판 상세페이지</h2>
	<hr style="border: solid 2px lightgray;">
		<div class="row">
			<div class="col">
				작성자 : ${pdetail.id }
			</div>
		</div>
		<div class="row">
			<div class="col">
				제목 : ${pdetail.ptitle }
			</div>
		</div>
		<div class="row">
			<div class="col">
				내용 : ${pdetail.pcontent }
			</div>
		</div>
		<!--수정하기, 목록으로 버튼  -->
		<div class="row" style="margin: 0% auto; text-align: right;">
			<div class="col" >
				<form action="pconsultUpdateForm" method="post">
				<input type="hidden" name="pnum" value="${pdetail.pnum }">
				<input type="hidden" name="id" value="${pdetail.id }">
				<input type="hidden" name="ptitle" value="${pdetail.ptitle }">
				<input type="hidden" name="pcontent" value="${pdetail.pcontent }">
				<input type="hidden" name="pw" value="${pdetail.pw }">
				<c:if test="${varSessionId == pdetail.id }">
				<input type="submit" value="수정하기" class="btn btn-sm btn-primary">
				</c:if>
				<input type="button" value="목록으로" class="btn btn-sm btn-primary" onclick="history.go(-1)">
				</form>
			</div>
	    </div>
		
	</div>
<%@include file="footer.jsp" %>
</body>
</html>