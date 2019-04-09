<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pt">
<head>

</head>
<body>

	<h1>Hello Wolrd Teste</h1>


	
	<!-- Formulario para inclusao de clientes -->
		<form action="cadastrateste" method="post" >
			<div><label for="texto">Texto</label>
					<input type="text" class="form-control" name="texto" id="texto" maxlength="60" placeholder="nome"></div>
		
		<div>					<button type="submit" class="btn btn-primary" name="insereTeste" value="insereTeste">Salvar</button>
		</div>
		
		</form>


	

</body>

</html>