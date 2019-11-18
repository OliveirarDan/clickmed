<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="modal fade login" id="loginModal">
		<div class="modal-dialog login animated">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Entre com seus dados</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">
					<div class="box">
						<div class="content">
							<div class="form loginBox">
								<c:if test="${empty usuarioAutenticado}">
									<form method="post" action="autenticar" accept-charset="UTF-8">
										<input id="email" class="form-control" type="text"
											placeholder="E-mail" name="email" required> 
										<input id="password" class="form-control" type="password"
											placeholder="Senha" name="senha" maxlength="10" minlength="8" required>
										<input class="btn btn-default btn-login" type="button"
											value="autenticar" onclick="submit()">
									</form>
								</c:if>
							</div>
						</div>
					</div>
				</div>


				<div class="modal-footer">
					<div class="forgot login-footer">
						<div class="division">
							<span>Ainda não possui um cadastro? <br> <a
								href="/cadastro">Clique aqui</a></span>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>