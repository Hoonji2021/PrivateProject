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
<h2>게시판 수정하기</h2>
	<div class="container" style="margin: 5% auto;">
		<form action="pconsultUpdatePro" method="post">
		<div class="row" style="margin: 3% auto;">
			작성자 : <input type="text" name="id" readonly="readonly" value="${pconsult.id }">
		</div>
		<div class="row" style="margin: 3% auto;">
			제목 : <input type="text" name="ptitle" value="${pconsult.ptitle }">
		</div>
		<div class="row" style="margin: 3% auto;">
			내용 : <textarea rows="5px" cols="100%" name="pcontent">${pconsult.pcontent }</textarea>
		</div>
		<div class="row" style="margin: 3% auto;">
			비밀번호 : <input type="password" name="pw" value="${pconsult.pw }" maxlength="4">
			<input type="hidden" name="pnum" value="${pconsult.pnum }">
		</div>
		<div class="row" style="margin: 0% auto; text-align: right;">
			<input type="submit" value="수정완료" class="btn btn-sm btn-primary">
			<input type="button" value="작성취소" class="btn btn-sm btn-primary" onclick="history.go(-1)">
		</div>
		</form>
	</div>
<%@include file="footer.jsp" %>

</body>
</html>