<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<style>
.e {
	width: 450px;
	height: 270px;
	border: 5px ridge #ff5722;
}
</style>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<center>
		<br>
		<br>
		<div class="e">
		<h2> MainPage </h2>
			<p>
				<a href="${pageContext.request.contextPath}/offers">전체 학기 이수 학점
					조회</a>
			</p>

			<p>
				<a href="${pageContext.request.contextPath}/offers_by_semester">학기별
					이수 학점 조회</a>
			</p>
			<p>
				<a href="${pageContext.request.contextPath}/createoffer">수강 신청
					하기</a>
			</p>
			<p>
				<a href="${pageContext.request.contextPath}/offercreated2019">수강
					신청 조회</a>
			</p>

			<c:if test="${pageContext.request.userPrincipal.name != null}">
				<a href="javascript:document.getElementById('logout').submit()">Logout</a>
			</c:if>

			<form id="logout" action="<c:url value="/logout" />" method="post">
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>
		</div>
	</center>


</body>
</html>
