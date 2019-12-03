<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt">

<head>
<!-- Include de todos os imports e meta tags -->
<jsp:include page="includes/imports.jsp" />

<title>ClickMed</title>

<script src="js/autocomplete/arrayauto.js"></script>

<body>
	<!--================ Include do Menu =================-->
	<jsp:include page="includes/menu.jsp" />

	<!--================ Começo Home Banner Area =================-->
	<section class="home_banner_area">
		<div class="banner_inner">
			<div class="container">
				<div class="banner_content">
					<center>
					<h2>
						Algo de errado aconteceu. <br>
						${mensagemDoSistema} <br>
						
					</h2>
					
				<br><br><br><br><br><br><br>
				
				
				
	<jsp:include page="includes/footer.jsp" />
	<jsp:include page="includes/login.jsp" />	
	<jsp:include page="includes/opcoes.jsp" />
</body>
</html>