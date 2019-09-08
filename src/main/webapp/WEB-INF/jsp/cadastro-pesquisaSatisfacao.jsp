<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
						<a href="/"> <i class="fa fa-menu fa-chevron-left"></i>
						</a>
					</div>
					<div class="col-md-8 col-lg-8 col-8 header-right">
						<span class="header-title"><h2>Cadastro</h2></span>
					</div>
				</div>
			</div>
		</section>
	</header>
	<!--================ Final Header Area =================-->
	<!--================Início do Cadastro =================-->
	<section class="contact_area section_gap">
		<div class="container">
		<div class="page-content">
			<!--================Início da Paginação de Cadastro =================-->
			<div class="row">
				<div class="col-md-12">	
					<span>
						<h3>Colocar um titulo aqui</h3>
					</span>
				</div>
			</div>


			<!--================Fim da Paginação Cadastro =================-->
			<!--================Início dos campos de Cadastro =================-->
			<div class="row">
				<form class="row contact_form" action="cadastraMedico" method="post"
							id="cadastro-medico" autocomplete="off">
							</form>
					<div class="col-md-12">
						<!-- Primeiro card da primeira linha -->
							<div class="row">
								<div class="col-md-4">
									<div class="center">
										<div class="foto-aval">
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
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================Fim do Cadastro =================-->

	<!--================ Includes de Footer e Modal de Login =================-->
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/login.jsp" />
	<jsp:include page="includes/opcoes.jsp" />
</body>
</html>