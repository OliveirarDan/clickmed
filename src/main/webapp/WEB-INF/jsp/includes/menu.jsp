<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header class="header_area">
		<div class="header-top">
			<div class="container">
				<div class="row align-items-center"></div>
			</div>
		</div>
		<div class="main_menu">
			<nav class="navbar navbar-expand-lg navbar-light">
				<div class="container">
					<!-- Logo e menu readequados para mobile -->
					<a class="navbar-brand logo_h" href="/"><img src="img/logo.png" alt="" align="left"></a>
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<!-- Menu principal -->
					<div class="collapse navbar-collapse offset"
						id="navbarSupportedContent">

						<c:if test="${empty usuarioAutenticado}">
							<ul class="nav navbar-nav ml-auto header-top-right">
								<a class="primary-btn text-uppercase" data-toggle="modal"
									href="javascript:void(0)" onclick="openLoginModal();">Entrar</a>
							</ul>
						</c:if>
						
						<c:if test="${not empty usuarioAutenticado}">
							<ul class="nav navbar-nav ml-auto header-top-right">
								<a class="primary-btn text-uppercase" data-toggle="modal"
									href="javascript:void(0)" onclick="openOpcoesModal();">Minha Conta</a>
							</ul>
						</c:if>
					</div>
				</div>
			</nav>
		</div>
	</header>
</body>
</html>