<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pt">
<head>

</head>
<body>

	<h1>Selecione um Médico:</h1>

	<form class="row contact_form" 
		method="post" id="avalia-medico">

		<input type="hidden" class="single-input" id="idPaciente"
			name="idPaciente" value="${paciente.id}" required />


		<c:forEach items="${medicos}" var="m">
			<label class="radio-inline" for="radios-0"> <input
				type="radio" name="id" id="radios-0" value="${m.id}"> ID:
				${m.id} || Nome: ${m.nome} <br>
		</c:forEach>
		<br>
		<div class="col-md-12 text-center">
		
			<button formaction="inicia" type="submit" name="inicia"
				value="inicia" class="primary-btn text-uppercase">Inicia Pesquisa</button>

			<button formaction="listaPesquisaSatisfacaoPorMedico"  type="submit" name="listaPesquisaSatisfacaoPorMedico" 
				value="listaPesquisaSatisfacaoPorMedico" class="primary-btn text-uppercase">Lista Pesquisas</button>
		</div>

	</form>
</body>

</html>