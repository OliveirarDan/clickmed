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
						<a href="/"> <i class="fa fa-menu fa-chevron-left"></i>
						</a>
					</div>
					<div class="col-md-8 col-lg-8 col-8 header-right">
						<span class="header-title"><h2>Editar</h2></span>
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
							<h3>Edite seus dados</h3>
						</span>
					</div>
				</div>
				<!--================Fim da Paginação Cadastro =================-->
				<!--================Início dos campos de Cadastro =================-->
				<div class="row">
					<div class="col-lg-12">
						<form class="row contact_form" action="salvaPaciente"
							method="post" id="salvaPaciente">
							<div class="col-md-12">
								<div class="row">
									<div class="col-md-8 col-6">
										<input type="hidden" class="single-input" id="id" name="id"
											value="${paciente.id}" /> 
											<input type="hidden"
											class="single-input" id="id" name="usuario.id"
											value="${paciente.usuario.id}" /> 
											<input type="hidden"
											class="single-input" id="permissao" name="usuario.permissao"
											value="paciente" required />

										<div class="form-group">
											<input type="text" class="single-input" id="name" name="nome"
												placeholder="Nome" value="${paciente.nome}" required />
										</div>
										<div class="form-group">
											<input type="text" class="single-input" id="sobrenome"
												name="sobrenome" placeholder="Sobrenome"
												value="${paciente.sobrenome}" required />
										</div>

										<%-- <div class="form-group">
											<input type="email" class="single-input" id="email"
												name="usuario.email" placeholder="E-mail (login)" value="${paciente.email}" required />
										</div> --%>
										<div class="form-group">
											<input type="text" class="single-input cpf" id="cpf"
												name="cpf" placeholder="CPF" value="${paciente.cpf}"
												required />
										</div>
										<input type="hidden" class="foto" id="foto" name="foto"
											value="" />
									</div>
									<!-- Foto de perfil -->
									<div class="col-md-4 col-6">
										<div class="center">
											<div class="foto-circle">
												<!-- User Profile Image -->
												<img class="profile-pic" src="${paciente.foto}">

												<!-- Default Image -->
												<i class="fa fa-user fa-5x"></i>
											</div>
										</div>
										<div class="p-image">
											<i class="fa fa-camera upload-button"></i> <input
												class="file-upload" type="file" accept="image/*" />
										</div>
									</div>
									<!-- Final da Foto de perfil -->
								</div>
								<div class="row">
									<label class="col-md-12" for="radios">Gênero</label>
									<div class="col-md-8">
										<label class="radio-inline" for="radios-0"> <input
											type="radio" name="sexo" id="radios-0" value="1">
											Masculino
										</label> <label class="radio-inline" for="radios-1"> <input
											type="radio" name="sexo" id="radios-1" value="2">
											Feminino
										</label> <label class="radio-inline" for="radios-2"> <input
											type="radio" name="sexo" id="radios-2" value="2">
											Outro
										</label>
									</div>
								</div>
								<div class="row">
									<%-- <div class="form-group col-md-2">
										<input type="date" class="single-input" id="datanasc"
											name="dataNascimento" placeholder="Data de nascimento" value="${paciente.dataNascimento}"
											required />
									</div> --%>
									<div class="form-group col-md-4">
										<input type="tel" class="single-input tel1"
											id="telresidencial" name="telefone1"
											value="${paciente.telefone1}"
											placeholder="Telefone residencial" required />
									</div>
									<div class="form-group col-md-4">
										<input type="tel" class="single-input tel2" id="telcelular"
											value="${paciente.telefone2}" name="telefone2"
											placeholder="Telefone celular" />
									</div>
									<div class="form-group col-md-2">
										<input type="text" class="single-input cep" id="cep"
											name="cep" placeholder="CEP" required value="${paciente.cep}" />
									</div>
								</div>
								<div class="row">
									<div class="form-group col-md-8">
										<input type="text" class="single-input" id="rua"
											value="${paciente.nomeRua}" name="nomeRua"
											placeholder="Rua, Av, Logradouro" required />
									</div>
									<div class="form-group col-md-4">
										<input type="text" class="single-input" id="numero"
											value="${paciente.numero}" name="numero" placeholder="Nº"
											maxlength="5" required />
									</div>
								</div>
								<div class="row">
									<div class="form-group col-md-8">
										<input type="text" class="single-input" id="cidade"
											value="${paciente.cidade}" name="cidade" placeholder="Cidade"
											required />
									</div>
									<div class="form-group col-md-4">
										<input type="text" class="single-input" id="uf" name="estado"
											value="${paciente.estado}
											placeholder="
											UF" maxlength="2" required />
									</div>
								</div>
							</div>
							<!-- <div class="form-group col-md-4">
								<label for="pass">Crie uma senha</label> <input
									class="single-input" type="password" id="senha"
									name="usuario.senha" maxlength="8" minlength="8" required />
							</div> -->

							<div class="col-md-12 text-center">
								<button type="submit" name="salvaPaciente" value="salvaPaciente"
									class="primary-btn text-uppercase">Salvar</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================Fim dos campos de Cadastro =================-->
	<!--================ Includes de Footer e Modal de Login =================-->
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/login.jsp" />
	<jsp:include page="includes/opcoes.jsp" />
</body>
</html>