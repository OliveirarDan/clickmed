<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pt">
<head>

</head>
<body>

	<h1>Selecione um Médico:</h1>

	<form class="row contact_form" action="selecionaMedico" method="post"
		id="cadastro-paciente">


		<c:forEach items="${medicos}" var="m">
			<label class="radio-inline" for="radios-0"> <input
				type="radio" name="id" id="radios-0" value="${m.id}">
				ID: ${m.id} || Nome: ${m.nome} <br>
		</c:forEach>
		<br>
		<div class="col-md-12 text-center">
			<button type="submit" name="selecionaPaciente"
				value="selecionaPaciente" class="primary-btn text-uppercase">Selecionar</button>
		</div>

	</form>
</body>

</html>