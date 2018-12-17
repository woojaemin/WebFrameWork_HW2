<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<style>
.e {
	width: 500px;
	height: 400px;
	border: 5px ridge #ff5722;
}
</style>
<meta charset="UTF-8">
<title>Create Offer</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>
	<center>
		<div class="e">
			<h2>2019년 1학기 수강신청하기</h2>
			<sf:form method="post"
				action="${pageContext.request.contextPath}/docreate"
				modelAttribute="offer">
				<table>
					<tr>
						<td class="lable">코드:</td>
						<td><sf:input class="control" type="text" path="code" /><br />
							<sf:errors path="code" class="error" /></td>
					</tr>
					<tr>
						<td class="lable">과목명:</td>
						<td><sf:input class="control" type="text" path="name" /><br />
							<sf:errors path="name" class="error" /></td>
					</tr>
					<tr>
						<td class="lable">구분:</td>
						<td><sf:input class="control" type="text" path="devision" /><br />
							<sf:errors path="devision" class="error" /></td>
					</tr>
					<tr>
						<td class="lable">학점:</td>
						<td><sf:input class="control" type="text" path="score" /><br />
							<sf:errors path="score" class="error" /></td>
					</tr>
					<tr>
						<td class="lable"></td>
						<td><input class="control" type="submit" name="submit"
							value="등록" /></td>
					</tr>
				</table>
			</sf:form>
			<br><br>
			<a href="${pageContext.request.contextPath}/"> 메인페이지 </a>
		</div>
	</center>
</body>
</html>