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
						<h3>Cadastre a sua clínica</h3>
					</span>
				</div>
			</div>


			<!--================Fim da Paginação Cadastro =================-->
			<!--================Início dos campos de Cadastro =================-->
			<div class="row">
				<div class="col-lg-12">
					<form class="row contact_form" action="cadastraClinica"
						method="post" id="cadastro-clinica">
						<div class="col-md-8">
							<div class="row">
								<div class="form-group col-md-12 col-12">
									<input type="text" class="single-input" id="fantasia"
										name="nomeFantasia" placeholder="Nome Fantasia" required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-12 col-12">
									<input type="text" class="single-input" id="razao"
										name="razaoSocial" placeholder="Razão Social" required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6 col-12">
									<input type="text" class="single-input cnpj" id="cnpj"
										name="cnpj" placeholder="CNPJ" required />
								</div>
								<div class="form-group col-md-6 col-12">
									<input type="email" class="single-input" id="email"
										name="email" placeholder="E-mail de atendimento" required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-6 col-12">
									<input type="tel" class="single-input tel1" id="telresidencial"
										name="telefone1" placeholder="Telefone principal" required />
								</div>
								<div class="form-group col-md-6 col-12">
									<input type="tel" class="single-input tel1" id="telcelular"
										name="telefone2" placeholder="Outro telefone" />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-4 col-12">
									<input type="text" class="single-input cep" id="cep" name="cep"
										placeholder="CEP" required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-8">
									<input type="text" class="single-input" id="rua" name="rua"
										placeholder="Rua, Av, Logradouro" required />
								</div>
								<div class="form-group col-md-4">
									<input type="text" class="single-input" id="numero"
										name="numero" placeholder="Nº" maxlength="5" required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-8">
									<input type="text" class="single-input" id="cidade"
										name="cidade" placeholder="Cidade" required />
								</div>
								<div class="form-group col-md-4">
									<input type="text" class="single-input" id="uf" name="estado"
										placeholder="UF" maxlength="2" required />
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<h2>Impulsione seus resultados!</h2>
							<h4>Cadastre sua clínica ou hospital e parceba o aumento na
								procura.</h4>

							<i class="fas fa-chart-line"></i>
							<p>Acompanhe o crescimento da procura de seus profissionais.</p>
							<i class="fas fa-users"></i>
							<p>Milhares de pacientes todos os dias.</p>
							<i class="fas fa-user-md"></i>
							<p>Maior base de profissionais da saúde do Brasil.</p>

							<div class="feature_head">
								<i class="fas fa-users"></i>
								<p>Acompanhe o crescimento da procura de seus profissionais.</p>
							</div>

						</div>
						<div class="col-md-12 text-center">
							<button type="submit" name="cadastraClinica"
								value="cadastraClinica" class="primary-btn text-uppercase">Cadastrar</button>
						</div>
					</form>
				</div>
			</div>
			</div>
		</div>
	</section>
	<!--================Fim do Cadastro =================-->

	<!--================ Includes de Footer e Modal de Login =================-->
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/login.jsp" />
</body>
</html>