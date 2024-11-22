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
		<h1>개발자 지원서</h1>
		<hr>
		<form action="/askProc">
			<h4>개인정보</h4>
			<label> <span>이름</span> <input type="text" name="name"
				placeholder="공백없이 입력하세요">
			</label>
			<label>
				<span>연락처</span>
				<input type="text" name="phone">
			</label>
			<h4>지원분야</h4>
			<input type="radio" name="job" value="java">
			<span>자바</span>
			<input type="radio" name="job" value="android">
			<span>안드로이드</span>
			<input type="radio" name="job" value="react">
			<span>리액트</span>
			
			<h4>지원동기</h4>
			<textarea name="motivation" cols="30" rows="10" placeholder="지원동기 기재란"></textarea>
			<button>접수하기</button>
			<button type="reset">다시쓰기</button>
			
		</form>
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>
