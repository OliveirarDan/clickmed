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
						<span class="header-title"><h2>Área do Médico</h2></span>
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
						<h3 style="padding-top: 0.5em; padding-bottom: 0.5em">Novas
							Requisições</h3>
						<div class="card_resposta"
							style="box-shadow: 0 1px 3px rgba(0, 0, 0, 0.24)">
							<div class="card__padding"> <!-- O IF PARA REPETIR A PERGUNTA QUANDO TIVER PERGUNTAS PENDENTES DEVE INICIAR ANTES DESSA DIV -->
								<div class="row">
									<div class="col-md-8">
										<br>
										<h4>
											O paciente <b>${paciente.nome} ${paciente.sobrenome}</b> teve
											uma consulta com você?
										</h4>
									</div>
									<div class="col-md-2 text-center">
										<button type="submit" name="cadastraMedico1"
											value="/cadastraAvaliacao" class="primary-btn text-uppercase">SIM</button>
									</div>
									<div class="col-md-2 text-center">
										<button type="submit" name="cadastraMedico1"
											value="/cadastraAvaliacao" class="primary-btn text-uppercase">NÃO</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<br>
			<!-- INICIO DAS RESPOSTAS DE AVALIAÇÃO -->
			<div class="row">
				<div class="wrapper1">
					<div class="card1 radius shadowDepth1">
						<h3 style="padding-top: 0.5em; padding-bottom: 0.5em">Novas
							avaliações</h3>
						<div class="card_resposta"
							style="box-shadow: 0 1px 3px rgba(0, 0, 0, 0.24)">
							<!-- O IF PRECISA INICIAR AQUI PARA ELE REPETIR O BOXSHADOW -->
							<div class="card-line card__padding">
								<div class="row">
									<div class="col-md-2">
										<div class="border-tlr-radius" style="text-align: center">
											<img src="img/person.jpg" alt="image"
												class="border-tlr-radius foto-card-circle">
										</div>
									</div>
									<div class="col-md-10">
										<div class="card-head-title">
											<br>
											<h4>Nome do paciente:${paciente.nome}
												${paciente.sobrenome}</h4>
										</div>
									</div>
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-12">
									<div class="container">
										<div class="form-group">
											<textarea class="resposta" id="experienciaProfissional"
												name="comentario" rows="3" readonly
												style="background-color: ligth-gray">
											</textarea>
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
												name="comentario" rows="2" maxlength="250"> </textarea>
										</div>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12 text-center">
									<button type="submit" name="cadastraMedico1"
										value="/cadastraAvaliacao" class="primary-btn text-uppercase">Responder</button>
								</div>
							</div>
						</div>

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