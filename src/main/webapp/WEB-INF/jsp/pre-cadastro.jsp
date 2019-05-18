<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!doctype html>
<html lang="pt">

<head>
<!-- Include de todos os imports e meta tags -->
<jsp:include page="includes/imports.jsp" />
<title>Cadastre-se</title>

</head>

<body>
	<header>
	</header>
	<!--================Início do Cadastro =================-->
	<section class="page-register">
		<div class="container">
			<div class="row">
				<div class="col-md-12 register-buttons">
					<h2 class="horizontal-center">Como deseja se cadastrar?</h2>
					<a href="novoPaciente"><button name="clinica" class="col-md-6 offset-3 register-btn text-uppercase">Paciente</button></a>
					<a href="novoMedico"><button name="paciente" class="col-md-6 offset-3 register-btn text-uppercase">Médico</button></a>
					<a href="novaClinica"><button name="medico" class="col-md-6 offset-3 register-btn text-uppercase">Clínica</button></a>
				</div>
			</div>		
		</div>
	</section>
	<!--================Fim do Cadastro =================-->
</body>
</html>