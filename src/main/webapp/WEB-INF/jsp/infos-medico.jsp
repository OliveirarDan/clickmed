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
			<!--================Primeira linha=================-->
			<div class="row">
				<div class="col-md-8"> <!-- Primeiro card da primeira linha -->
					<div class="card_infos">
						<div class="row">
							<div class="col-md-4">
								<div class="center">
									</br>
										<div class="foto-info">
											<!-- User Profile Image -->
											<img class="profile-pic" src="img/person.jpg">
											
											<!-- Default Image -->
											<i class="fa fa-user fa-5x"></i>
										</div>
								</div>
							</div>
							<div class="col-md-8">
								</br>
								<h3><label class="aval" id="nome" name="nome" value="${medico.nome}">Nome</label></h3>
								<h3><label class="aval" id="crm" name="crm" value="${medico.crm}">CRM</label></h3>
								</br>
								<hr class="line">
							</div>

						</div>
						<div class="row">
							<div class="col-md-4">
								<div class="center">
									<h4><label id="espec">Especialidades</label></h4>	
									<ul>
										<li id="experiencia">Teste</li>
										<li id="experiencia">Teste</li>
									</ul>
								</div>
							</div>
							<div class="col-md-8">
								<div class="center">
									<h4><label id="conv">Convênios atendidos</label></h4>	
									<ul>
										<li id="experiencia">Teste</li>
										<li id="experiencia">Teste</li>
									</ul>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-4">
								<div class="center">
									<h4><label id="local">Localização</label></h4>	
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-12">
									<label class="aval" id="endereco"><span class="glyphicon glyphicon-map-marker"></span>Rua nicolina fernandes Rua nicolina fernandes</label>									
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4"> <!-- Segundo card da primeira linha -->
				<div class="row">
						<div class="center">
							<div class="circle">
								<div class="nota">
									<h1	 id="nota">4,57</h1>
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
			</br>
			<!--================Inicio da segunda linha=================-->
			<div class="row">
				<div class="col-md-6"> <!-- Primeiro card da primeira linha -->
					<div class="cards">
						<div class="row">
							<div class="col-md-12">
								<h3 class="title">Experiência Profissional</h3>
								<hr class="line">
							</div>							
						</div>
						<div class="row">
							<ul>
								<li class="li" id="experiencia">Teste</li>
								<li class="li" id="experiencia">Teste</li>
								<li class="li" id="experiencia">Teste</li>
								<li class="li" id="experiencia">Teste</li>
								<li class="li" id="experiencia">Teste</li>
								<li class="li" id="experiencia">Teste</li>
								<li class="li" id="experiencia">Teste</li>
								<li class="li" id="experiencia">Teste</li>
								<li class="li" id="experiencia">Teste</li>
								<li class="li" id="experiencia">Teste</li>
								<li class="li" id="experiencia">Teste</li>
								<li class="li" id="experiencia">Teste</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-md-6"> <!-- Segundo card da primeira linha -->
					<div class="cards">
						<div class="row">
							<div class="col-md-12">
								<h3 class="title">Formação Acadêmica</h3>
								<hr class="line">
							</div>							
						</div>
						<div class="row">
							<ul>
								<li class="li" id="experiencia">Teste</li>
								<li class="li" id="experiencia">Teste</li>
							</ul>
						</div>
					</div>
				</div>				
			</div>
			<!--================Fim da segunda linha=================-->
			</br>
			<!--================Inicio da terceira linha=================-->
			<div class="row">
				<div class="col-md-12">
					<div class="cards">
						<h3 class="title">Opinião dos pacientes</h3>
						<hr class="line">
						<h5 class="aval">Nome</h5> 
						<p class="aval" id="comentario">TESTE TESTE TESTE TESTE</p>  
					</div>	
				</div>
			</div>
			
			<!--================Fim da terceira linha=================-->


		</div>
	</section>
	<!--================ Começo Area Rodapé  =================-->
	<footer class="footer-bottom">
		<div class="container">
			<div
				class="d-flex justify-content-between align-items-center flex-wrap">
				<p class="footer-text">
					Copyright ClickMed &copy;
					<script>
						document.write(new Date().getFullYear());
					</script>
					Todos os direitos reservados.
				<div class="footer-social d-flex align-items-center">
					<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
						class="fa fa-twitter"></i></a>
				</div>
			</div>
		</div>
	</footer>
</body>
</html>