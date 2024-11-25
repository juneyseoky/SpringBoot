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
		<jsp:include page="../ind/header.jsp"/>
		<form action="/goodsRegister" id="regForm">
			<label>
				<span>상품명</span>
				<input type="text" name="goodsName">
			</label>
			<label>
				<span>상품코드</span>
				<input type="text" name="goodsCode">
			</label>
			<label>
				<span>가격</span>
				<input type="text" name="price">
			</label>
			<label>
				<span>재고</span>
				<input type="text" name="cnt">
			</label>
			<div id="btnArea" class="dFlex">
				<span>( * 필수) </span>
				<button >등록</button>
				<button type="reset">초기화</button>
			</div>
		</form>
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    