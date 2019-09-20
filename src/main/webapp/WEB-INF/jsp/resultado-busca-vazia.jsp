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
							<select class="form-control form-control" id="sel2">
								<option>Bairros:</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
							</select>
						</div>

						<div class="form-group col-2 col-md-2">
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
						</div>
					</div>

				</form>
			</div>
		</section>
	</header>
	<!--================ Final Header Area =================-->
	<!--================Início do Container principal =================-->
	<section class="contact_area section_gap">
		<div class="container">
			<p>
			<div align="center">
				<img src="img/ListaVazia3.png">
			</div>
			</p>
		</div>
	</section>
	<!--================ Começo Area Rodapé  =================-->
	<!--================ Includes de Footer e Modal de Login =================-->
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/login.jsp" />
	<jsp:include page="includes/opcoes.jsp" />
</body>
</html>