<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
.e {
	width: 480px;
	height: 390px;
	border: 5px ridge #ff5722;
}
</style>
<meta charset="UTF-8">
<title>Offers_Detail</title>
</head>
<body>
	<center>
	<br>
		<div class="e">
			<h2>학기별 이수 학점 조회 상세보기</h2>

			<table border="1">
				<tr>
					<td>수강년도</td>
					<td>학기</td>
					<td>교과코드</td>
					<td>교과목명</td>
					<td>구분</td>
					<td>학점</td>
				</tr>
				<c:forEach var="offer" items="${offers}">
					<tr>
						<td><c:out value="${offer.year}"></c:out></td>
						<td><c:out value="${offer.semester}"></c:out></td>
						<td><c:out value="${offer.code}"></c:out></td>
						<td><c:out value="${offer.name}"></c:out></td>
						<td><c:out value="${offer.devision}"></c:out></td>
						<td><c:out value="${offer.score}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
			<br /> <a href="${pageContext.request.contextPath}/"> 메인페이지 </a>
		</div>
	</center>
</body>
</html>