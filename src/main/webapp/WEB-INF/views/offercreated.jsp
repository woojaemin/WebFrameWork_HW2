<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<body>

	${offer.name} 과목이 추가되었습니다.<br/>
	
	<a href="${pageContext.request.contextPath}/"> 처음화면으로</a>

</body>
</html>