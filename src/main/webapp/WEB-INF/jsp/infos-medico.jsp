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
						<a href="javascript:void(0)" onClick="history.go(-1); return false;"> <i class="fa fa-menu fa-chevron-left"></i>
						</a>
					</div>
					<div class="col-md-8 col-lg-8 col-8 header-right">
						<span class="header-title"><h2>${medico.nome} ${medico.sobrenome}</h2></span>
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
										<!-- User Profile Image -->
										<img class="profile-pic" src="img/person.jpg">

										<!-- Default Image -->
										<i class="fa fa-user fa-5x"></i>
									</div>
								</div>
							</div>
							<div class="col-md-8">
								<h3>Nome: ${medico.nome} ${medico.sobrenome}</h3>
								<h5>CRM: ${medico.crm}</h5>
								
								<c:forEach items="${medico.clinicas}" var="c"> 
									<input type=hidden class="single-input" id="rua" name="name" value="${c.rua}" />
									<input type=hidden class="single-input" id="numero" name="name" value="${c.numero}" />
									<input type=hidden class="single-input" id="cidade" name="name" value="${c.cidade}" />
									<input type=hidden class="single-input" id="estado" name="name" value="${c.estado}" />
								</c:forEach>									
							</div>
						</div>
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
									<span>${c.nomeFantasia} - ${c.rua}, ${c.numero} ${c.cidade} ${c.estado}</span>
								</c:forEach>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<!-- Segundo card da primeira linha -->
					<div class="row">
						<div class="center">
							<div class="circle">
								<div class="nota">
									<h1 id="nota">4,57</h1>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="center">
							<h4>Média das avaliações</h4>
						</div>
					</div>
				</div>
			</div>
			<!--================Fim da primeira linha =================-->
			<!--================Inicio da segunda linha=================-->
			<div class="row">
				<div class="col-md-6">
					<!-- Primeiro card da primeira linha -->
					<div class="card_infos">
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
					<div class="card_infos">
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
					<div class="card_infos">
						<div class="row">
							<div class="col-md-12">
								<h3 class="title">Opiniões dos pacientes</h3>
								<hr class="line">
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<h5>Nome do usuário:</h5>
								<p>Comentário do usuário:</p>
								<!-- Ajustar quando a parte dos comentários estiver pronto -->
								<c:forEach items="" var="o">
									<h5>Nome do usuário:</h5>
									<p>Comentário do usuário:</p>
									<hr class="line">
								</c:forEach>
							</div>
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
						<div id="mapa" style="width:100%;height:250px;"></div>
						
						<script src="https://maps.googleapis.com/maps/api/js?key=CHAVEAQUI&callback=initialize"></script>
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