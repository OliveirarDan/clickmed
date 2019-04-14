<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pt">
<head>

</head>
<body>

	<h1>Selecione um Convênio:</h1>

	<form class="row contact_form" action="selecionaConvenio" method="post"
		id="cadastro-paciente">


		<c:forEach items="${convenios}" var="c">
			<label class="radio-inline" for="radios-0"> <input
				type="radio" name="id" id="radios-0" value="${c.id}"> ID:
				${c.id} || ${c.nome} || ${c.codConvenio} <br>
		</c:forEach>


		<br>
		<div class="col-md-12 text-center">
			<button type="submit" name="selecionaPaciente"
				value="selecionaConvenio" class="primary-btn text-uppercase">Selecionar</button>
		</div>

	</form>
</body>

</html>