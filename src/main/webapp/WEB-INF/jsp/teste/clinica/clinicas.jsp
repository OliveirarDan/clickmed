<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pt">
<head>

</head>
<body>

	<h1>Selecione uma Clínica:</h1>

	<form class="row contact_form" action="selecionaClinica" method="post"
		id="cadastro-paciente">


		<c:forEach items="${clinicas}" var="c">
			<label class="radio-inline" for="radios-0"> <input
				type="radio" name="id" id="radios-0" value="${c.id}"> ID:
				${c.id} || ${c.nomeFantasia} || ${c.cnpj} <br>
		</c:forEach>


		<br>
		<div class="col-md-12 text-center">
			<button type="submit" name="selecionaPaciente"
				value="selecionaClinica" class="primary-btn text-uppercase">Selecionar</button>
		</div>

	</form>
</body>

</html>