<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pt">
<head>

</head>
<body>

	<h1>Hello Wolrd</h1>
	<!-- ${pcs} -->
	
	<form action="listar_nome_medicos" method="post">
	<label>Pesquisa por nome: </label>
	<input name="nome">
	<input type="submit" value="Buscar">
	</form>

</body>

</html>