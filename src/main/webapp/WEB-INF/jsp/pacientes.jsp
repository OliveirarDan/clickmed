<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pt">
<head>

</head>
<body>

	<h1>Selecione um Paciente:</h1>

	<form class="row contact_form" action="selecionaPaciente" method="post"
		id="cadastro-paciente">


		<c:forEach items="${pacientes}" var="p">
			<label class="radio-inline" for="radios-0"> <input
				type="radio" name="id" id="radios-0" value="${p.id}">
				${p.nome} <br>
		</c:forEach>

		<div class="col-md-12 text-center">
			<button type="submit" name="selecionaPaciente"
				value="selecionaPaciente" class="primary-btn text-uppercase">Selecionar</button>
		</div>

	</form>
</body>

</html>