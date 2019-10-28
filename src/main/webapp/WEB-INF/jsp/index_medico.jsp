<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="pt">

<head>
<!-- Include de todos os imports e meta tags -->
<jsp:include page="includes/imports.jsp" />
<title>ClickMed</title>
</head>

<body>
	<!--================ Header Area =================-->

	<header>
		<!--================ Include do Menu =================-->
		<jsp:include page="includes/menu.jsp" />
		<!--================ Header Menu Area =================-->
		<section class="simple-header">
			<div class="container">
				<div class="row">
					<div class="col-md-12 col-lg-12 col-12 header-right">
						<span class="header-title"><h2>Minhas avaliações</h2></span>
					</div>
				</div>
			</div>
		</section>

	</header>
	<!--================ Final Header Area =================-->
	<!--================Início do Container principal =================-->
	<section class="contact_area section_gap">
		<div class="container">
			<div class="row">
				<div class="wrapper1">
					<div class="card1 radius shadowDepth1">
						<div class="row card-line card__padding">
							<div class="row">
								<div class="col-md-5">
									<div class="border-tlr-radius">
										<img src="img/person.jpg" alt="image"
											class="border-tlr-radius foto-card-circle">
									</div>
								</div>
								<div class="col-md-7">
									<div class="card-head-title">
										<h4>Nome do paciente:${paciente.nome} ${paciente.sobrenome}</h4>
									</div>
								</div>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-12">
								<div class="container">
									<div class="jumbotron jumbo">
										<p></p>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<div class="container">
									<h4 class="title">Resposta</h4>
									<div class="form-group">
										<textarea class="resposta" id="experienciaProfissional"
											name="comentario" rows="2" maxlength="400"> </textarea>
									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12 text-center">
								<button type="submit" name="cadastraMedico1"
									value="/cadastraAvaliacao" class="primary-btn text-uppercase">Ignorar</button>
								<button type="submit" name="cadastraMedico1"
									value="/cadastraAvaliacao" class="primary-btn text-uppercase">Responder</button>
							</div>
						</div>
						<br>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================ Começo Area Rodapé  =================-->
	<!--================ Includes de Footer e Modal de Login =================-->
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/login.jsp" />
	<jsp:include page="includes/opcoes.jsp" />
</body>
</html>