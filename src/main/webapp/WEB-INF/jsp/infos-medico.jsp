<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<section class="simple-header">
			<div class="container">
				<div class="row">
					<div class="col-md-4 col-lg-4 col-4 header-left">
						<a href="javascript:void(0)"
							onClick="history.go(-1); return false;"> <i
							class="fa fa-menu fa-chevron-left"></i>
						</a>
					</div>
					<div class="col-md-8 col-lg-8 col-8 header-right">
						<span class="header-title"><h2>${medico.nome}
								${medico.sobrenome}</h2></span>
					</div>
				</div>
			</div>
		</section>
	</header>
	<!--================ Final Header Area =================-->



	<!--================Início do Cadastro =================-->
	<section class="contact_area section_gap">
		<div class="container">
			<!--================Primeira linha=================-->
			<div class="row">
				<div class="col-md-8">
					<!-- Primeiro card da primeira linha -->
					<div class="card_infos">
						<div class="row">
							<div class="col-md-4">
								<div class="center">
									<div class="foto-info">
										<c:if test="${not empty medico.foto}">
											<img class="profile-pic" src="${medico.foto}">
										</c:if>
										<c:if test="${empty medico.foto}">
											<img src="img/person.jpg" alt="image" class="profile-pic">
										</c:if>




										<!-- 	<!-- User Profile Image 
										<img class="profile-pic" src="img/person.jpg">

										<!-- Default Image 
										<i class="fa fa-user fa-5x"></i>-->
									</div>
								</div>
							</div>
							<div class="col-md-8">
								<h3>Nome: ${medico.nome} ${medico.sobrenome}</h3>
								<h5>CRM: ${medico.crm}</h5>

								<c:forEach items="${medico.clinicas}" var="c">
									<input type=hidden class="single-input" id="rua" name="name"
										value="${c.rua}" />
									<input type=hidden class="single-input" id="numero" name="name"
										value="${c.numero}" />
									<input type=hidden class="single-input" id="cidade" name="name"
										value="${c.cidade}" />
									<input type=hidden class="single-input" id="estado" name="name"
										value="${c.estado}" />
								</c:forEach>
							</div>
						</div>
						<!--================ Inicio Area de avaliacao  =================-->

						<!--================ Final Area de avaliacao =================-->



						<hr class="line">
						<div class="row">
							<div class="col-md-6">
								<h4>Especialidades</h4>
								<c:forEach items="${medico.especialidades}" var="e">
									<span>${e.nome}</span>
									<br>
								</c:forEach>
							</div>
							<div class="col-md-6">
								<h4>Convênios atendidos</h4>
								<c:forEach items="${medico.convenios}" var="c">
									<span>${c.nome}</span>
									<br>
								</c:forEach>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-4">
								<h4>
									<label>Localização</label>
								</h4>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<i class="fa glyphicon glyphicon-map-marker"></i>
								<c:forEach items="${medico.clinicas}" var="c">
									<span>${c.nomeFantasia} - ${c.rua}, ${c.numero}
										${c.cidade} ${c.estado}</span>
								</c:forEach>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<!-- Segundo card da primeira linha -->
					<div class="row">
						<div class="col-md-12">
							<div class="center">
								<center>Média de Atendimento:</center>
								<div class="circle">
									<div class="nota">
										<c:if test="${empty media}">
											<h4 id="nota">
												Nenhuma <br> avaliação
											</h4>
										</c:if>
										<c:if test="${not empty media}">
											<h1 id="nota">${media}/5</h1>
										</c:if>
									</div>
								</div>
								<center>
								<c:choose>
									<c:when test="${media <= 0.2}">
										<img src="img/star0.png" id="s1">
										<img src="img/star0.png" id="s2">
										<img src="img/star0.png" id="s3">
										<img src="img/star0.png" id="s4">
										<img src="img/star0.png" id="s5"> 
										<br />
									</c:when>    
									<c:when test="${media <= 0.7}">
										<img src="img/star1e0.png" id="s1">
										<img src="img/star0.png" id="s2">
										<img src="img/star0.png" id="s3">
										<img src="img/star0.png" id="s4">
										<img src="img/star0.png" id="s5"> 
										<br />
									</c:when>
									<c:when test="${media <= 1.2}">
										<img src="img/star1.png" id="s1">
										<img src="img/star0.png" id="s2">
										<img src="img/star0.png" id="s3">
										<img src="img/star0.png" id="s4">
										<img src="img/star0.png" id="s5"> 
										<br />
									</c:when>    
									<c:when test="${media <= 1.7}">
										<img src="img/star1.png" id="s1">
										<img src="img/star1e0.png" id="s2">
										<img src="img/star0.png" id="s3">
										<img src="img/star0.png" id="s4">
										<img src="img/star0.png" id="s5"> 
										<br />
									</c:when>
									<c:when test="${media <= 2.2}">
										<img src="img/star1.png" id="s1">
										<img src="img/star1.png" id="s2">
										<img src="img/star0.png" id="s3">
										<img src="img/star0.png" id="s4">
										<img src="img/star0.png" id="s5"> 
										<br />
									</c:when>  
									<c:when test="${media <= 2.7}">
										<img src="img/star1.png" id="s1">
										<img src="img/star1.png" id="s2">
										<img src="img/star1e0.png" id="s3">
										<img src="img/star0.png" id="s4">
										<img src="img/star0.png" id="s5"> 
										<br />
									</c:when>
									<c:when test="${media <= 3.2}">
										<img src="img/star1.png" id="s1">
										<img src="img/star1.png" id="s2">
										<img src="img/star1.png" id="s3">
										<img src="img/star0.png" id="s4">
										<img src="img/star0.png" id="s5"> 
										<br />
									</c:when>  
									<c:when test="${media <= 3.7}">
										<img src="img/star1.png" id="s1">
										<img src="img/star1.png" id="s2">
										<img src="img/star1.png" id="s3">
										<img src="img/star1e0.png" id="s4">
										<img src="img/star0.png" id="s5"> 
										<br />
									</c:when>
									<c:when test="${media <= 4.2}">
										<img src="img/star1.png" id="s1">
										<img src="img/star1.png" id="s2">
										<img src="img/star1.png" id="s3">
										<img src="img/star1.png" id="s4">
										<img src="img/star0.png" id="s5"> 
										<br />
									</c:when>  
									<c:when test="${media <= 4.7}">
										<img src="img/star1.png" id="s1">
										<img src="img/star1.png" id="s2">
										<img src="img/star1.png" id="s3">
										<img src="img/star1.png" id="s4">
										<img src="img/star1e0.png" id="s5"> 
										<br />
									</c:when>
									<c:when test="${media > 4.8}">
										<img src="img/star1.png" id="s1">
										<img src="img/star1.png" id="s2">
										<img src="img/star1.png" id="s3">
										<img src="img/star1.png" id="s4">
										<img src="img/star1.png" id="s5"> 
										<br />
									</c:when>  
									 
									
									<c:otherwise>
										
										<br />
									</c:otherwise>
								</c:choose>
								</center>
							</div>
						</div>
					</div>
					<br>
					<div class="row">

						<div class="center">
							<c:if test="${not empty usuarioAutenticado}">
								<c:if test="${not empty paciente}">
									<form class="row contact_form" action="/novaAvaliacao"
										method="get" id="cadastro-paciente">
										<br> <input type="hidden" id="id" name="id"
											value="${medico.id}" />

										<div class="col-md-12 text-center">
											<button type="submit" name="selecionaPaciente"
												value="/novaAvaliacao" class="primary-btn text-uppercase">Avaliar
												Médico</button>
										</div>
									</form>
								</c:if>
							</c:if>
						</div>

					</div>
				</div>
			</div>
			<!--================Fim da primeira linha =================-->
			<!--================Inicio da segunda linha=================-->
			<div class="row">
				<div class="col-md-6">
					<!-- Primeiro card da primeira linha -->
					<div class="card_infos" style="max-height: 250px; overflow: auto;">
						<div class="row">
							<div class="col-md-12">
								<h3 class="title">Experiência Profissional</h3>
								<hr class="line">
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<p>${medico.experienciaProfissional}</p>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-6">
					<!-- Segundo card da primeira linha -->
					<div class="card_infos" style="max-height: 250px; overflow: auto;">
						<div class="row">
							<div class="col-md-12">
								<h3 class="title">Formação Acadêmica</h3>
								<hr class="line">
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<p>${medico.formacaoAcademica}</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--================Fim da segunda linha=================-->
			<!--================Inicio da terceira linha=================-->
			<div class="row">
				<div class="col-md-12">


					<div class="cards_new">
						<div class="row">
							<div class="col-md-12">
								<h3 class="title">Opiniões dos pacientes</h3>
								<hr class="line">

							</div>
						</div>
						<div class="row">



							<c:forEach items="${avaliacoes}" var="a">
								<div class="col-md-12">
									<div class="balloon">
										<h5>
											<b>Paciente:</b> ${a.paciente.nome}
										</h5>
										<p style="line-height: 90%">
											<b>Nota:</b> ${a.pergunta1}/5
										</p>
										<p style="line-height: 90%">
											<b>Comentário:</b> ${a.comentario}
										</p>
										<p style="line-height: 90%">
											<b>Características:</b> ${a.avaliacao}
										</p>
									</div>
								</div>
							</c:forEach>

							<c:if test="${empty avaliacoes}">
								<div class="col-md-12">
									<h3 style="text-align: center">Não há avaliações no
										momento.</h3>
								</div>
							</c:if>

						</div>
					</div>

				</div>
			</div>
			<!--================Fim da terceira linha=================-->
			<!--================Inicio da terceira linha=================-->
			<!--================Inicio da terceira linha=================-->
			<div class="row">
				<div class="col-md-12">
					<div class="card_infos">
						<h5>Localização</h5>
						<div id="mapa" style="width: 100%; height: 250px;"></div>

						<script
							src="https://maps.googleapis.com/maps/api/js?key=CHAVEAQUI&callback=initialize"></script>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================ Includes de Footer e Modal de Login =================-->
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/login.jsp" />
	<jsp:include page="includes/opcoes.jsp" />
</body>
</html>