<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pt">
<head>

</head>
<body>

	<h1>Hello Wolrd Teste</h1>


	
	<!-- ${pcs} -->

	<c:forEach items="${tes}" var="p">
		<tr>
			<td>${p.idteste}</td>
			<td>${p.texto}</td>
		</tr>
		<br />
	</c:forEach>


</body>

</html>