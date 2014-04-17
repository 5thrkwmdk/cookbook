<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${recipe.recipeName} 조리법</h1>
<h2>재료</h2>
	<%-- 게터가 없으니 메소드 호출 --%>
	<c:forEach var="ingredient" items="${recipe.ingredients()}">
		<ul>
			<li>${ingredient}</li>
		</ul>
	</c:forEach>
------------------------------------------------
	<c:forEach var="step" items="${recipe.recipe()}">
		<ul>
			<li>${step}</li>
		</ul>
	</c:forEach>
</body>
</html>