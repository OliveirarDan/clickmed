<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pt">
<head>

</head>
<body>

	<h1>Veja todas as avalia��es do m�dico ${medico.id} - Nome:
		${medico.nome}</h1>



	<c:forEach items="${PSs}" var="ps">
		<hr>
		${ps.paciente.nome} || ${ps.avaliacao} || M�dia: ${ps.pergunta4} || Profissionalismo: ${ps.pergunta1} || Clareza nas informa��es: ${ps.pergunta2} || Educa��o: ${ps.pergunta3}  <br>
	</c:forEach>


	<br>



</body>

</html>