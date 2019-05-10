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
		
		<select name="especialidade">
		    <option value="">Selecione uma especialidade:</option>
			<option value="Acupuntura">Acupuntura</option>
			<option value="Alergias">Alergias</option>
			<option value="Cancerologia">Cancerologia</option>
			<option value="Cardiologia">Cardiologia</option>
			<option value="Cirurgias">Cirurgias</option>
			
			<option value="Clinico Geral">Clínico Geral</option>
			
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
		
		<input type="submit" value="Buscar">
		
	</form>

</body>

</html>