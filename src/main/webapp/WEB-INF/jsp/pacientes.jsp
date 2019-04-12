<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pt">
<head>

</head>
<body>

	<h1>Hello Wolrd</h1>
	<!-- ${pcs} -->
	
	<c:forEach items="${pacientes}" var="p">
	    <tr>  
	    
	       
	        <td>${p}</td>
	        <hr>
	    </tr>
	    <br />
	</c:forEach>

</body>

</html>