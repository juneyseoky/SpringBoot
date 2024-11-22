<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
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
		<div id="tableHeader">
			<span><input type="checkbox" id="all"></span>
			<span>번호</span>
			<span>상품명</span>
			<span>상품코드</span>
			<span>가격</span>
			<span>재고</span>
			<span>등록시간</span>
		</div>
		<c:forEach var="goods" items="${goodsList}">
			<div class="goodsBody">
				<span><input type="checkbox" name="num" value="${goods.num }"></span>
				<span>${goods.num }</span>
				<span>${goods.goodsCode }</span>
				<span>${goods.goodsName }</span>
				<span>${goods.price }</span>
				<span>${goods.cnt }</span>
				<span>${goods.regTM}</span>
			</div>
		</c:forEach>
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>    