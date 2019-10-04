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
						<span class="header-title"><h2>Avaliação</h2></span>
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
			</br>


			<!--================Fim da Paginação Cadastro =================-->
			<!--================Início dos campos de Cadastro =================-->
			<div class="row">
				<form class="row contact_form" action="cadastraMedico" method="post"
							id="cadastro-medico" autocomplete="off">
							</form>
					<div class="col-md-8">
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
									<h4>CRM: ${medico.crm}</h5>	
									<h4>Especialidades</h4>	
										<c:forEach items="${medico.especialidades}" var="e">
											<span>${e.nome}</span>
											<br>
										</c:forEach>						
								</div>
							</div>
							<hr class="line">
							<div class="row">
								<div class="col-md-12">
									<span>
										<h4 class="title">Como você avalia sua consulta no geral? *</h4>
									</span>
								</div>
								
							</div>	
							<div class="row">
								<div class="col-md-12">
									<fieldset class="rating">
    									<input type="radio" id="star5" name="rating" value="5" /><label class = "full" for="star5"></label>
    									<input type="radio" id="star4half" name="rating" value="4 and a half" /><label class="half"></label>
    									<input type="radio" id="star4" name="rating" value="4" /><label class = "full" for="star4"></label>
    									<input type="radio" id="star3half" name="rating" value="3 and a half" /><label class="half"></label>
    									<input type="radio" id="star3" name="rating" value="3" /><label class = "full" for="star3"></label>
    									<input type="radio" id="star2half" name="rating" value="2 and a half" /><label class="half"></label>
    									<input type="radio" id="star2" name="rating" value="2" /><label class = "full" for="star2"></label>
    									<input type="radio" id="star1half" name="rating" value="1 and a half" /><label class="half"></label>
    									<input type="radio" id="star1" name="rating" value="1" /><label class = "full" for="star1"></label>
    									<input type="radio" id="starhalf" name="rating" value="half" /><label class="half" for="starhalf"></label>
									</fieldset>
								</div>
							</div>
							<br>
							<br>
							<div class="row">
								<div class="col-md-12">
									<h4 class="title">Quais foram os pontos fortes da consulta?</h4>
									<div class="control-group">
										<input type="text" id="tagsAvaliacao"
											name="diasAtendimento" class="tags_aval" autocomplete="off"
											placeholder="Escolha até 3 opções" value=""
											required />
									</div>	
								</div>
							</div>
							<br>
							<br>
							<div class="row">
								<div class="col-md-12">
									<h4 class="title">Gostaria de fazer mais alguma observação?</h4>
									<div class="form-group">
										<textarea class="avaliacao-obs" id="experienciaProfissional"
											name="experienciaProfissional" rows="5" maxlength="250"> </textarea>
									</div>	
								</div>
							</div>
							<div class="row">
								<div class="col-md-12 text-center">
									<button type="submit" name="cadastraMedico1"
										value="cadastraMedico" class="primary-btn text-uppercase">Salvar avaliação</button>
								</div>
							</div>
					</div>
					<div class="col-md-4">
					<!-- Segundo card da primeira linha -->
						<div class="row">
							<div class="card_avaliacao">
								<h5> Como sua avaliação pode nos ajudar?</h5>
									<ul>
										<li class="li">Pontos que podem ajudar</li>
										<li class="li">Pontos que podem ajudar</li>
									</ul>
									<br>
								<h5> Como sua avaliação pode ajudar demais pacientes? </h5>	
									<ul>
										<li class="li">Pontos que podem ajudar</li>
										<li class="li">Pontos que podem ajudar</li>
									</ul>
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

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         