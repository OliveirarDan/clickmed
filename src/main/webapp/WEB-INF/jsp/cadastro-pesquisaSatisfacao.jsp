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
				<div class="">
					<div class="">
						<span>
							<h2>Avalie seu atendimento</h2>
						</span>
					</div>
				</div>
				</br>


				<!--================Fim da Paginação Cadastro =================-->
				<!--================Início dos campos de Cadastro =================-->
				<div class="">
					<form class="row contact_form" action="cadastraAvaliacao"
						method="post" id="cadastro-medico" autocomplete="off">

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
									<br>
									<h3>Nome: ${pesquisaSatisfacao.medico.nome} ${pesquisaSatisfacao.medico.sobrenome}</h3>
									<h3>CRM: ${pesquisaSatisfacao.medico.crm}</h3>
									<h3>Especialidades:</h3>
									<c:forEach items="${pesquisaSatisfacao.medico.especialidades}" var="e">
										<span>${e.nome}</span>
										<br>
									</c:forEach>
									<!-- Treche necessário para resgatar medico e paciente -->
									<input type="hidden" id="teste" name="medico.id" value="${pesquisaSatisfacao.medico.id}" /><label
											class="full" for="star5"></label> 
											
									<input type="hidden" id="teste" name="paciente.id" value="${pesquisaSatisfacao.paciente.id}" /><label
											class="full" for="star5"></label> 
								</div>
							</div>
							<hr class="line">
							<div class="row">
								<div class="col-md-6">
									<span>
										<h4 class="title">Como você avalia sua consulta? *</h4>
									</span>
								</div>
								<div class="col-md-6">
									<span>
										<h4 class="title">Qual a data da sua consulta?*</h4>
									</span>
								</div>

							</div>
							<div class="row">
								<div class="col-md-6">
									<fieldset class="rating">
										<input type="radio" id="star5" name="pergunta1" value="5" /><label
											class="full" for="star5"></label> <input type="radio"
											id="star4half" name="pergunta1" value="4.5" /><label
											class="half"></label> <input type="radio" id="star4"
											name="pergunta1" value="4" /><label class="full" for="star4"></label>
										<input type="radio" id="star3half" name="pergunta1"
											value="3.5" /><label class="half"></label> <input
											type="radio" id="star3" name="pergunta1" value="3" /><label
											class="full" for="star3"></label> <input type="radio"
											id="star2half" name="pergunta1" value="2.5" /><label
											class="half"></label> <input type="radio" id="star2"
											name="pergunta1" value="2" /><label class="full" for="star2"></label>
										<input type="radio" id="star1half" name="pergunta1"
											value="1.5" /><label class="half"></label> <input
											type="radio" id="star1" name="pergunta1" value="1" /><label
											class="full" for="star1"></label> <input type="radio"
											id="starhalf" name="pergunta1" value="0.5" /><label
											class="half" for="starhalf"></label>
									</fieldset>
								</div>
								<div class="col-md-6">
									<div class="form-group col-md-8">
										<input type="date" class="single-input" id="descricao"
											name="descricao" placeholder="Data da consulta"
											required />
											</div>
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-md-12">
									<h4 class="title">Quais foram os pontos fortes da
										consulta?</h4>
									<div class="control-group">
										<input type="text" id="tagsAvaliacao" name="avaliacao"
											class="tags_aval" autocomplete="off"
											placeholder="Escolha até 3 opções" value="" required />
									</div>
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-md-12">
									<h4 class="title">Gostaria de fazer mais alguma
										observação?</h4>
									<div class="form-group">
										<textarea class="avaliacao-obs" id="experienciaProfissional"
											name="comentario" rows="5" maxlength="300"> </textarea>
									</div>
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-md-12 text-center">
									<button type="submit" name="cadastraMedico1"
										value="/cadastraAvaliacao" class="primary-btn text-uppercase">Salvar
										avaliação</button>
								</div>
							</div>
						</div>
					</form>
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