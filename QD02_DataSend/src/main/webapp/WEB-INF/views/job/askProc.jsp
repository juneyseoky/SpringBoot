<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<link rel="stylesheet" href="/style/style.css?v">
</head>
<body>
	<div id="wrap">
		<h1>수신데이터</h1>
		<hr>
		<p>이름 : ${bean.name}</p>
		<p>연락처 : ${bean.phone}</p>
		<p>지원분야 : ${bean.job}</p>
		<p>지원동기 : ${bean.motivation}</p>
		<br>
		<p>- End</p>
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    