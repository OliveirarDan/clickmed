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
		<!--================ Header Menu Area =================-->
		<section class="simple-header">
			<div class="container">
				<div class="row">
					<div class="form-group col-2 col-md-2">
						<div class="control-group">
							<input type="text" id="classificacao" name="classificacao"
								placeholder="Classificação" value="" />
						</div>
					</div>
					<div class="form-group col-2 col-md-2">
						<div class="control-group">
							<input type="text" id="custo" name="custo" placeholder="Custo"
								value="" />
						</div>
					</div>
					<div class="form-group offset-4 col-2 col-md-2">
						<div class="control-group">
							<button name="limparFiltros" value=""
								class="secondary-btn text-uppercase">Limpar filtros</button>
						</div>
					</div>
					<div class="form-group col-2 col-md-2">
						<div class="control-group">
							<a href="/">
								<button name="refazerPesquisa" value="/"
									class="secondary-btn text-uppercase">Refazer pesquisa</button>
							</a>
						</div>
					</div>
				</div>
			</div>
		</section>
	</header>
	<!--================ Final Header Area =================-->
	<!--================Início do Container principal =================-->
	<section class="contact_area section_gap">
		<div class="container">

			<!--Início da card  -->
			<c:forEach items="${medico}" var="medico">
				<div class="wrapper">
					<div class="card radius shadowDepth1">
						<div class="row card-line card__padding">
							<div class="border-tlr-radius">
								<img src="img/person.jpg" alt="image"
									class="border-tlr-radius foto-card-circle">
							</div>
							<div class="card-head-title">
								<a>Nome do médico</a></br> <a>CRM</a> <a>${medico.nome}</a></br> <a>${medico.crm}</a>
							</div>
						</div>

						<div class="card__content card-line card__padding">
							<div class="row card__meta">
								<div class="col-md-12 col-12">
									<a>Especialidades:</a>
									<c:forEach items="${medico.especialidade}" var="especialidade">
										<ul>
											<a class="card-title">Otorrino</a>
											<a class="card-title">${especialidade}</a>
										</ul>
									</c:forEach>
								</div>
							</div>
							<div class="row">
								<div class="col-md-2 col-2">
									<i class="fa-card fa-map-marker"></i>
								</div>
								<div class="col-md-10 col-10">
									<a class="card-title">Endereço do médico</a> <a
										class="card-title">${medico.rua}</a>
								</div>
							</div>
						</div>

						<div class="card__content card-line card__padding">
							<a class="card-title">Nota: ${medico.avaliacao}</a><br> <a
								class="card-title">Custo: ${medico.preco}</a><br>
						</div>
						<div class="card-bottom">
							<a class="card-action" href="/selecionaMedico">Visualizar</a>
						</div>

					</div>
				</div>
			</c:forEach>
		</div>
	</section>
	<!--================ Começo Area Rodapé  =================-->
	<!--================ Includes de Footer e Modal de Login =================-->
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/login.jsp" />
</body>
</html>