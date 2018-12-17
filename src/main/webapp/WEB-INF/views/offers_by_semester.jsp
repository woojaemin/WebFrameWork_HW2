<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
.e {
	width: 440px;
	height: 220px;
	border: 5px ridge #ff5722;
}
</style>
<meta charset="UTF-8">
<title>By Semester</title>
</head>
<body>
	<center>
		<br>
		<div class="e">
			<h2>학기별 이수 학점 조회</h2>

			<table align="center" border="1" color="blue">
				<tr>
					<td>수강년도</td>
					<td>학기</td>
					<td>이수학점</td>
					<td>상세보기</td>
				</tr>
				<c:forEach var="offer" items="${offers}">
					<tr>
						<td><c:out value="${offer.year}"></c:out></td>
						<td><c:out value="${offer.semester}"></c:out></td>
						<td><c:out value="${offer.score}"></c:out></td>
						<td><a
							href="${pageContext.request.contextPath}/offers_detail?year=${offer.year}&semester=${offer.semester}"> 이동 </a></td>
					</tr>
				</c:forEach>
			</table>
			<br /> <a href="${pageContext.request.contextPath}/"> 메인페이지 </a>
		</div>
	</center>
</body>
</html>