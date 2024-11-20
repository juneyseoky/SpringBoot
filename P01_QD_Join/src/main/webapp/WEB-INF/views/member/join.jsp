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
		<div id="imgArea">
			<img src="/images/Naver_Logo.png" alt="">
		</div>
		<div id="idArea">
			<p>아이디</p>
			<div class="inputArea">
				<input type="text" >
				<div id="domainName">@naver.com</div>
			</div>
		</div>
		<div id="pwArea">
			<p>비밀번호</p>
			<div class="inputArea">
				<input type="password" >
				<div id="">
					<img src="/images/pw_01.png" alt="">
				</div>
			</div>
		</div>
		<div id="rePwArea">
			<p>비밀번호 재확인</p>
			<div class="inputArea">
				<input type="password" >
				<div id="">
					<img src="/images/pw_02.png" alt="">
				</div>
			</div>
		</div>
		<div id="nameArea">
			<p>이름</p>
			<div class="inputArea" >
				<input type="text" >
				<div id=""></div>
			</div>
		</div>
		<div id="btnArea">
			<button>가입하기</button>
		</div>
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>
