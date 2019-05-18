<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pt">
<head>

</head>
<body>

	<h1>Veja todas as avaliações do médico ${medico.id} - Nome:
		${medico.nome}</h1>



	<c:forEach items="${PSs}" var="ps">
		<hr>
		${ps.paciente.nome} || ${ps.avaliacao} || Média: ${ps.pergunta4} || Profissionalismo: ${ps.pergunta1} || Clareza nas informações: ${ps.pergunta2} || Educação: ${ps.pergunta3}  <br>
	</c:forEach>


	<br>



</body>

</html>