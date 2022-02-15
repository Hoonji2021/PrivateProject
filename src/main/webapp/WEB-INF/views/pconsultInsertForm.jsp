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
	<h2>온라인 상담 글 쓰기</h2>
	<hr style="border: solid 2px lightgray;">
	
	<form action="pconsultInsertPro" method="post" style="margin-top: 50px;">
	  <div class="row" style="margin: 3% auto;">
		<div class="col" >
			<h5>작성자 : </h5>
			<input type="text" name="id" value="${varSessionId}" readonly="readonly" style="width: 85%" >
			<input type="hidden" name="pnum" value="1"> 
		</div>
	  </div>
	  <div class="row" style="margin: 3% auto;">
		<div class="col" >
			<h5>제목 : </h5><input type="text" name="ptitle" placeholder="제목을 입력하세요" style="width: 85%">
		</div>
	  </div>
	  <div class="row" style="margin: 3% auto;">
		<div class="col" >
			<h5>내용 : </h5><textarea rows="5px" cols="100%" name="pcontent" placeholder="내용을 입력하세요"></textarea>
		</div>
	  </div>	
	  <div class="row" style="margin: 3% auto;">
		<div class="col" >
			<h5>비밀번호 : </h5><input type="password" name="pw" placeholder="비밀번호를 입력하세요" maxlength="4">
		</div>
	  </div>
	  <!-- 작성버튼 -->
	  <div class="row" style="margin: 0% auto; text-align: right;">
		<div class="col" >
			<input type="submit" value="작성완료" class="btn btn-sm btn-primary">
			<input type="button" value="작성취소" class="btn btn-sm btn-primary" onclick="history.go(-1)">
		</div>
	  </div>
	  	
	</form>
</div>
<%@include file="footer.jsp" %>
</body>
</html>