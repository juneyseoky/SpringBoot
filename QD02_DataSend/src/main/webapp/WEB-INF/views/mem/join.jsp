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
		<h1>Sign up</h1>
		<form action="/joinProc">
			<label>
				<span>Email</span>
				<input type="text" name="email">
			</label>
			<label>
				<span>Password</span>
				<input type="password" name="pass">
			</label>
			<input type="checkbox" name="checkVal">
			<span>Email me with news and updates</span>
			<button>Sign up for free</button>
		</form>
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    