<%@ page language="java" contentType="text/html;" pageEncoding="iso-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv=Content-Type content="text/html; charset=iso-8859-1">
<link type="text/css" href="css/styles.css" rel="stylesheet" />
<title>Novo Produto</title>
</head>
<body>
	<form action="IncluirProduto">
		<table width="550" border="0">
			<tr>
				<td align="right">Categoria:</td>
				<td>
					<select name="categoria">
						<option value="0">Inform�tica</option>
						<option value="1">Eletr�nica</option>
						<option value="2">Im�vel</option>
					</select>
				</td>
			</tr>
			<tr>
				<td align="right">Nome:</td>
				<td><input type="text" name="nome"></td>
			</tr>
			<tr>
				<td align="right">Descri��o:</td>
				<td><input type="text" name="descricao"></td>
			</tr>
			<tr>
				<td></td>
				<td align="left">
					<input type="submit" value="Confirmar Inclus�o">
					<a href="listar_produto.jsp"><input type="button" value="Cancelar"></a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>