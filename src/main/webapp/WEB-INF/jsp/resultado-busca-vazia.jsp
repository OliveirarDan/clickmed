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
					
						<div class="autocomplete" style="width:700px;">
    						<input id="myInput" type="text" name="nome" placeholder="Pesquise por nome, especialidade ou bairro do médico...">
 						</div>
 					
					</div>
					<div class="form-group offset-4 col-2 col-md-2">
						
					</div>
					<div class="form-group col-2 col-md-2">
						<div class="control-group">
							<a href="/">
								<button type="submit" name="refazerPesquisa" value="/"
									class="secondary-btn text-uppercase">Refazer pesquisa</button>
							</a>
						</div>
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
</body>
</html>