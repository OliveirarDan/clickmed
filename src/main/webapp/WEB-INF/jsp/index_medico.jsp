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
							<div class="card__padding">
								<!-- O IF PARA REPETIR A PERGUNTA QUANDO TIVER PERGUNTAS PENDENTES DEVE INICIAR ANTES DESSA DIV -->
								<c:forEach items="${pesquisaSatisfacao}" var="p">
								<form class="col-md-12" method="get">
									<div class="row">
										<div class="col-md-8">
											<br>
											<h4>
												O paciente <b>${p.paciente.nome} ${p.paciente.sobrenome}</b> foi
												atendido por você no dia ${p.descricao}?
											</h4>
										</div>
										
										<input type="hidden"
											class="single-input" id="id" name="id" placeholder="id" value="${p.id}"
											required />
										
										<div class="col-md-2 text-center">
											<button type="submit" name="statusAvaliacao" formaction="/validaAvaliacao"
												value="/validaAvaliacao" class="primary-btn text-uppercase">SIM</button>
										</div>
										<div class="col-md-2 text-center">
											<button type="submit" name="statusAvaliacao" formaction="/rejeitaAvaliacao"
												value="/rejeitaAvaliacao" class="primary-btn text-uppercase">NÃO</button>
										</div>
									</div>
								</form>
								</c:forEach>
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