<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pt">
<head>

</head>
<body>

	<h1>Selecione uma Especialidade:</h1>

	<form class="row contact_form" action="selecionaEspecialidade" method="post"
		id="cadastro-paciente">


		<c:forEach items="${especialidades}" var="e">
			<label class="radio-inline" for="radios-0"> <input
				type="radio" name="id" id="radios-0" value="${e.id}"> ID:
				${e.id} || ${e.nome}  <br>
		</c:forEach>


		<br>
		<div class="col-md-12 text-center">
			<button type="submit" name="selecionaPaciente"
				value="selecionaConvenio" class="primary-btn text-uppercase">Selecionar</button>
		</div>

	</form>
</body>

</html>