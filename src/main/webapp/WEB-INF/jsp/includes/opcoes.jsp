<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="modal fade login" id="opcoesModal">
		<div class="modal-dialog login animated">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Opções</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">
					<div class="box">
						<div class="content">
							<div class="form loginBox">
								

								<c:if test="${not empty usuarioAutenticado}">

									<h4 class="modal-title">${usuarioAutenticado.email} -
										Logado</h4>
									<br>
									<form method="get" action="selecionaPaciente" accept-charset="UTF-8">
										<input class="btn btn-default btn-login" type="button"
											value="Editar Cadastro" onclick="submit()">
									</form>
									<br>
									<form method="post" action="sair" accept-charset="UTF-8">
										<input class="btn btn-default btn-login" type="button"
											value="Logout" onclick="submit()">
									</form>
								</c:if>
							</div>
							<!-- <div class="division">
								<div class="line l"></div>
								<span>Ou</span>
								<div class="line r"></div>
							</div>
							<div class="social">
								<a id="google_login" class="circle google" href="#"> <i
									class="fa fa-google-plus fa-fw"></i>
								</a> <a id="facebook_login" class="circle facebook" href="#"> <i
									class="fa fa-facebook fa-fw"></i>
								</a>
							</div> -->
						</div>
					</div>
				</div>


				<div class="modal-footer">
					<div class="forgot login-footer">
<!-- 						<div class="division"> -->
<!-- 							<span>Ainda não possui um cadastro? <br> <a -->
<!-- 								href="/cadastro">Clique aqui</a></span> -->
<!-- 						</div> -->

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>