<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
						<span class="header-title"><h2>Atualize seus dados</h2></span>
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
				<!--================Início do Formulário de Cadastro =================-->
				<div class="row">
					<div class="col-md-12">
						<form class="contact_form" action="salvaMedico" method="post"
							id="salvaMedico" autocomplete="off">
							<!--================Início da Primeira Etapa =================-->
							<div class="row">
								<div class="col-md-12">
									<div class="row">

										<div class="col-md-4">
											<label>Medico ID</label> <input type="text"
												class="single-input" id="id" name="id" value="${medico.id}" />
											<label>Medico Usuario ID</label> <input type="text"
												class="single-input" id="id" name="usuario.id"
												value="${medico.usuario.id}" />
											<div class="form-group">
												<label>Permissao</label> <input type="text"
													class="single-input" id="permissao"
													name="usuario.permissao" value="1" required />
											</div>
											<div class="form-group">
												<input type="number" class="single-input required" id="crm"
													name="crm" placeholder="CRM" maxlength="13"
													value="${medico.crm}">
											</div>

										</div>
									</div>
									<div class="row">
										<div class="col-md-8 col-6">
											<div class="form-group">
												<input type="text" class="single-input required" id="nome"
													name="nome" placeholder="Nome" value="${medico.nome}">
											</div>
											<div class="form-group">
												<input type="text" class="single-input required"
													value="${medico.sobrenome}" id="sobrenome" name="sobrenome"
													placeholder="Sobrenome">
											</div>

											<div class="form-group">
												<input type="email" class="single-input required" id="email"
													value="${medico.usuario.email}" name="usuario.email"
													placeholder="E-mail (login)">
											</div>
											<input type="hidden" class="foto" id="foto" name="foto"
												value="" />
										</div>
										<!-- Foto de perfil -->
										<div class="col-md-4 col-6">
											<div class="center">
												<div class="foto-circle">
													<!-- User Profile Image -->
													<img class="profile-pic" src="${medico.foto}">

													<!-- Default Image -->
													<!-- <i class="fa fa-user fa-5x"></i> -->
												</div>
											</div>
											<div class="p-image">
												<i class="fa fa-camera upload-button"></i> <input
													class="file-upload" type="file" accept="image/*" />
											</div>
										</div>
										<!-- Final da Foto de perfil -->
									</div>
									<!-- <div class="row">
										<label class="col-md-12 required" for="radios">Gênero</label>
										<div class="col-md-8">
											<label class="radio-inline" for="radios-0"> <input
												type="radio" name="sexo" id="radios-0" value="1" required>
												Masculino
											</label> <label class="radio-inline" for="radios-1"> <input
												type="radio" name="sexo" id="radios-1" value="2">
												Feminino
											</label> <label class="radio-inline" for="radios-2"> <input
												type="radio" name="sexo" id="radios-2" value="2">
												Outro
											</label>
										</div>
									</div> -->
									<div class="row">
										<div class="form-group col-md-4 required">
											<label for="pass">Altere sua senha</label> <input
												class="single-input required" type="password" id="senha"
												value="${medico.usuario.senha}" name="usuario.senha"
												maxlength="8" minlength="8">
										</div>
									</div>
								</div>
							</div>
							<!--================Fim da Primeira Etapa =================-->
							<!--================Início da Segunda Etapa =================-->
							<div class="row">
								<div class="col-md-12">
									<div class="control-group">
										<label for="especialidade">Especilidades:</label> <input
											type="text" id="especialidade" name="especialidade"
											placeholder="Começe a digitar para pesquisar"
											value="${medico.especialidade}" required />
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<label><span> Formação acadêmica:</span></label>
									<div class="form-group">
										<textarea class="single-input" id="formacaoAcademica"
											name="formacaoAcademica" rows="5">${medico.formacaoAcademica} </textarea>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<label><span> Experiência profissional:</span></label>
									<div class="form-group">
										<textarea class="single-input" id="experienciaProfissional"
											name="experienciaProfissional" rows="5">${medico.experienciaProfissional}</textarea>
									</div>
								</div>
							</div>
							<!--================Fim da Segunda Etapa =================-->
							<!--================Início da Terceira Etapa =================-->
							<div class="row">
								<div class="form-group col-md-12">
									<div class="control-group">
										<label for="localAtendimento">Selecione qual o seu
											local de atendimento</label> <input type="text" id="localAtendimento"
											name="localAtendimento"
											placeholder="Começe a digitar para pesquisar" value=""
											required />
									</div>
								</div>

							</div>
							<div class="row">
								<div class="form-group col-md-4">
									<input type="tel" class="single-input tel1 required"
										value="${medico.telefone1}" id="telefone1" name="telefone1"
										placeholder="Telefone principal">
								</div>
								<div class="form-group col-md-4">
									<input type="tel" class="single-input tel1" id="telefone2"
										value="${medico.telefone2}" name="telefone2"
										placeholder="Outro telefone (caso possua)">
								</div>
							</div>
							<div class="row">
								<div class="form-group col-md-8">
									<div class="control-group">
										<label for="diasAtendimento">Quais dias da semana há
											atendimento?</label> <input type="text" id="diasAtendimento"
											name="diasAtendimento"
											placeholder="Começe a digitar para pesquisar"
											value="${medico.diasAtendimento}" required />
									</div>
								</div>
								<div class="form-group col-md-2">
									<label for="horaInicioAtendimento">Início</label> <input
										type="text" class="single-input hora required"
										value="${medico.horaInicioAtendimento}"
										id="horaInicioAtendimento" name="horaInicioAtendimento"
										placeholder="00h00">
								</div>
								<div class="form-group col-md-2">
									<label for="horaFimAtendimento">Até:</label> <input type="text"
										class="single-input hora required" id="horaFimAtendimento"
										value="${medico.horaFimAtendimento}" placeholder="00h00"
										name="horaFimAtendimento" />
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<div class="control-group">
										<label for="convenios">Convênios atendidos:</label>
										<c:forEach items="${medico.convenios}" var="convenio">
											<input type="text" name="convenios" id="convenios"
												value="${convenio.id}"
												placeholder="Começe a digitar para pesquisar" required />
										</c:forEach>

									</div>
								</div>

							</div>
							<div class="row">
								<div class="col-md-12">
									<label><span> Descreva quais planos destes
											convênios atende?:</span></label>
									<div class="form-group">
										<textarea class="single-input required" id="planosConvenio"
											name="planosConvenio" rows="5">${medico.planosConvenio}</textarea>
									</div>
								</div>
							</div>
							<div class="form-group">
								<input type="hidden" class="single-input" id="permissao"
									name="permissao" value="1" required />
							</div>
							<div class="row">
								<div class="col-md-12 text-center">
									<button type="submit" name="salvaMedico" value="salvaMedico"
										class="primary-btn text-uppercase">Salvar</button>
								</div>
							</div>
							<!--================Fim da Terceira Etapa =================-->
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================Fim do Formulário de Cadastro =================-->
	<!--================ Includes de Footer e Modal de Login =================-->
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/login.jsp" />
</body>
</html>