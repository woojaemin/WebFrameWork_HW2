<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<style>
.e {
	width: 400px;
	height: 200px;
	border: 5px ridge #ff5722;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body onload='document.f.username.focus();'>
	<center>
		<br>
	<div class="e">

		<h3>로그인페이지</h3>
		<form name='f' action="<c:url value="/login"/>" method='POST'>

			<c:if test="${not empty errorMsg }">
				<div style="color: #ff0000">
					<h3>${errorMsg}</h3>
				</div>
			</c:if>

			<c:if test="${not empty logoutMsg }">
				<div style="color: #0000ff">
					<h3>${logoutMsg}</h3>
				</div>
			</c:if>

			<table>
				<tr>
					<td>UserName:</td>
					<td><input type='text' name='username' value=''></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='password' name='password' /></td>
				</tr>
				<tr>
					<td colspan='3'><input name="submit" type="submit"
						value="Login" /></td>
				</tr>
				<!-- csrf라는 보안 공격에 대비하는 코드 -->
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</table>
		</form>
		</div>
	</center>
</body>
</html>