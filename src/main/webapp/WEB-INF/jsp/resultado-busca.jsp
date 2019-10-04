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
				<form autocomplete="off" action="buscaPrincipal" method="post">
					<div class="row">
						<div class="form-group col-2 col-md-2">

							<div class="autocomplete" style="width: 800px;">
								<input id="myInput" type="text" name="nome"
									placeholder="Pesquise por nome, especialidade ou bairro do médico...">
							</div>

						</div>

						<div class="form-group offset-4 col-2 col-md-3"></div>

						<div class="form-group col-2 col-md-2">
							<div class="control-group">
								<a href="/">
									<button type="submit" name="refazerPesquisa" value="/"
										class="secondary-btn text-uppercase">Refazer pesquisa</button>
								</a>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-2 col-md-2">
							<select class="form-control form-control" id="especialidade"
								name="especialidade">
								<option value="">Especialidade:</option>
								<option value="Acupuntura">Acupuntura</option>
								<option value="Alergias">Alergias</option>
								<option value="Cancerologia">Cancerologia</option>
								<option value="Cardiologia">Cardiologia</option>
								<option value="Cirurgias">Cirurgias</option>
								<option value="Clínico Geral">Clínico Geral</option>
								<option value="Dentista">Dentista</option>
								<option value="Dermatologia">Dermatologia</option>
								<option value="Endoscopia">Endoscopia</option>
								<option value="Gastroenterologia">Gastroenterologia</option>
								<option value="Ginecologia">Ginecologia</option>
								<option value="Infectologia">Infectologia</option>
								<option value="Medicina Esportiva">Medicina Esportiva</option>
								<option value="Medicina Intensiva">Medicina Intensiva</option>
								<option value="Medicina Nuclear">Medicina Nuclear</option>
								<option value="Neurocirurgia">Neurocirurgia</option>
								<option value="Neurologia">Neurologia</option>
								<option value="Ortopedia">Ortopedia</option>
								<option value="Otorrinolaringologia">Otorrinolaringologia</option>
								<option value="Patologia">Patologia</option>
								<option value="Psicologia">Psicologia</option>
								<option value="Psiquiatria">Psiquiatria</option>
								<option value="Radiologia">Radiologia</option>
								<option value="Traumatologia">Traumatologia</option>
							</select>
						</div>

						<div class="form-group col-2 col-md-2">
							<select class="form-control form-control" id="bairros" name="bairros">
								<option value="">Bairros:</option>
								<option value="Água Rasa">Água Rasa‎</option>
								<option value="Alto Pinheiros">Alto de Pinheiros‎</option>
								<option value="Anhanguera">Anhanguera‎</option>
								<option value="Aricanduva">Aricanduva‎</option>
								<option value="Artur Alvim">Artur Alvim‎</option>
								<option value="Barra Funda">Barra Funda‎</option>
								<option value="Bela Vista">Bela Vista‎</option>
								<option value="Belém">Belém‎</option>
								<option value="Bom Retiro">Bom Retiro‎</option>
								<option value="Brasilândia">Brasilândia‎</option>
								<option value="Butantã">Butantã‎</option>
								<option value="Cachoeirinha">Cachoeirinha‎</option>
								<option value="Cambuci">Cambuci‎</option>
								<option value="Campo Belo">Campo Belo‎</option>
								<option value="Campo Grande">Campo Grande</option>
								<option value="Campo Limpo">Campo Limpo‎</option>
								<option value="Cangaíba">Cangaíba‎</option>
								<option value="Capão Redondo">Capão Redondo‎</option>
								<option value="Carrão">Carrão‎</option>
								<option value="Casa Verde">Casa Verde‎</option>
								<option value="Ademar">Cidade Ademar‎</option>
								<option value="Dutra">Cidade Dutra‎</option>
								<option value="Líder">Cidade Líder‎</option>
								<option value="Tiradentes">Cidade Tiradentes‎</option>
								<option value="Consolação">Consolação‎</option>
								<option value="Cursino">Cursino‎</option>
								<option value="Ermelino Matarazzo">Ermelino Matarazzo‎</option>
								<option value="Freguesia">Freguesia do Ó‎</option>
								<option value="Grajaú">Grajaú‎</option>
								<option value="Guaianases">Guaianases‎</option>
								<option value="Iguatemi">Iguatemi‎</option>
								<option value="Ipiranga">Ipiranga‎</option>
								<option value="Itaim Bibi">Itaim Bibi‎</option>
								<option value="Itaim Paulista">Itaim Paulista‎</option>
								<option value="Itaquera">Itaquera‎</option>
								<option value="Jabaquara">Jabaquara‎</option>
								<option value="Jaçanã">Jaçanã‎</option>
								<option value="Jaguara">Jaguara‎</option>
								<option value="Jaguaré">Jaguaré</option>
								<option value="Jaraguá">Jaraguá‎</option>
								<option value="Ângela">Jardim Ângela‎</option>
								<option value="Helena">Jardim Helena‎</option>
								<option value="Paulista">Jardim Paulista‎</option>
								<option value="São Luís">Jardim São Luís‎</option>
								<option value="Lapa">Lapa‎</option>
								<option value="Liberdade">Liberdade‎</option>
								<option value="Limão">Limão‎</option>
								<option value="Mandaqui">Mandaqui‎</option>
								<option value="Marsilac">Marsilac‎</option>
								<option value="Moema">Moema‎</option>
								<option value="Mooca">Mooca‎</option>
								<option value="Morumbi">Morumbi‎</option>
								<option value="Parelheiros">Parelheiros‎</option>
								<option value="Pari">Pari‎</option>
								<option value="Parque do Carmo">Parque do Carmo‎</option>
								<option value="Penha">Penha‎</option>
								<option value="Perdizes">Perdizes‎</option>
								<option value="Pinheiros">Pinheiros‎</option>
								<option value="Ponte Rasa">Ponte Rasa‎</option>
								<option value="Raposo Tavares">Raposo Tavares‎</option>
								<option value="República">República‎</option>
								<option value="Rio Pequeno">Rio Pequeno‎</option>
								<option value="Sacomã">Sacomã‎</option>
								<option value="Santa Cecília">Santa Cecília</option>
								<option value="Santana">Santana‎</option>
								<option value="Santo Amaro">Santo Amaro‎</option>
								<option value="Domingos">São Domingos‎</option>
								<option value="Miguel Paulista">São Miguel
									Paulista‎</option>
								<option value="Sapopemba">Sapopemba‎</option>
								<option value="Saúde">Saúde‎</option>
								<option value="Sé">Sé‎</option>
								<option value="Tatuapé">Tatuapé‎</option>
								<option value="Tremembé">Tremembé‎</option>
								<option value="Tucuruvi">Tucuruvi</option>
								<option value="Formosa">Vila Formosa‎</option>
								<option value="Guilherme">Vila Guilherme‎</option>
								<option value="Leopoldina">Vila Leopoldina‎</option>
								<option value="Maria">Vila Maria‎</option>
								<option value="Mariana">Vila Mariana‎</option>
								<option value="Matilde">Vila Matilde‎</option>
								<option value="Prudente">Vila Prudente‎</option>
								<option value="Sônia">Vila Sônia‎</option>
							</select>
						</div>

						<!-- <div class="form-group col-2 col-md-2">
							<select class="form-control form-control" id="sel2">
								<option>Notas:</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
							</select>
						</div>

						<div class="form-group col-2 col-md-2">
							<select class="form-control form-control" id="sel2">
								<option>Convênio:</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
							</select>
						</div> -->
					</div>

				</form>
			</div>
		</section>
	</header>
	<!--================ Final Header Area =================-->
	<!--================Início do Container principal =================-->
	<section class="contact_area section_gap">
		<div class="container">
			<!--Início da card  -->
			<div class="row">
				<c:forEach items="${medicos}" var="m">
					<form class="contact_form" action="selecionaMedico" method="get"
						id="selecionaMedico">
						<div class="wrapper col-md-4 col-4">
							<div class="card radius shadowDepth1">
								<div class="row card-line card__padding">
									<div class="border-tlr-radius">
										<img src="img/person.jpg" alt="image"
											class="border-tlr-radius foto-card-circle">
									</div>
									<div class="card-head-title">
										<a>${m.nome} ${m.sobrenome}</a></br> <a>CRM: ${m.crm}</a>
									</div>
									<input type="hidden" id="id" name="id" value="${m.id}">
								</div>
								<div class="card__content card-line card__padding">
									<div class="row card__meta">
										<div class="col-md-12 col-12">
											<a class="card-title">Especialidade:</a>
											<c:forEach items="${m.especialidades}" var="e">
												<a>${e.nome}</a>
											</c:forEach>
										</div>
									</div>
									<br>
									<div class="row">
										<div class="col-md-2 col-2">
											<i class="fa-card fa-map-marker"></i>
										</div>
										<div class="col-md-10 col-10">
											<c:forEach items="${m.clinicas}" var="c">
												<a>Localidade: ${c.bairro}<br>${c.cidade}/${c.estado}</a>
												<br>
											</c:forEach>
										</div>
									</div>
									<br>
									<div class="row">
										<div class="col-md-12 col-12">
											<a class="card-title">Telefone:</a><br> <a>${m.telefone1}</a>
											<br> <a>${m.telefone2}</a> <br>
										</div>
									</div>
								</div>

								<%-- <div class="card__content card-line card__padding">
									<a class="card-title">Nota: ${avaliacao}</a><br>
								</div> --%>
								<button class="card-button" type="submit" name="selecionaMedico"
									value="selecionaMedico">Visualizar</button>
							</div>
						</div>
					</form>
				</c:forEach>
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