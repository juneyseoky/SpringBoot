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
		<h1>BBS 목록보기(MyBatis_Param)</h1>
		<hr>
		<table>
			<tbody>
				<tr>
					<th style="width:80px">번호</th>
					<th>제목</th>
					<th style="width:100px">작성자</th>
					<th style="width: 40px">삭제</th>
				</tr>
				<c:forEach var="boardList" items="${boardList}">
					<tr>
						<td>${boardList.num }</td>
						<td>
						<a href="/boardView?num=${boardList.num }">${boardList.title }</a>
						</td>
						<td>${boardList.writer }</td>
						<td id="${boardList.num}">x</td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="4" style="text-align: right">
					<button type="button" onclick="location.href='writeForm'">글쓰기</button>
					</td>
				</tr>
			</tfoot>
		</table>
	</div>
	<!-- div#wrap -->
	<script src="/script/jquery-3.7.1.min.js"></script>
	<script src="/script/script.js"></script>
</body>
</html>
