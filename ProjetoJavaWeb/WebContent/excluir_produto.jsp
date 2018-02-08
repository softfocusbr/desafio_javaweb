<%@ page language="java" contentType="text/html;" pageEncoding="iso-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv=Content-Type content="text/html; charset=iso-8859-1">
<link type="text/css" href="css/styles.css" rel="stylesheet" />
<title>Excluir Produto</title>
</head>
<body>
	<form action="ExcluirProduto">
		<table width="550" border="0">
			<tr>
				<td align="right">Código:</td>
				<td><input type="text" name="codigo" value="<%=request.getParameter("codigo") %>" readonly="readonly"></td>
			</tr>
			<tr>
				<td align="right">Categoria:</td>
				<td><input type="text" name="categoria" value="<%=request.getParameter("categoria") %>" readonly="readonly"></td>
			</tr>
			<tr>
				<td align="right">Nome:</td>
				<td><input type="text" name="nome" value="<%=request.getParameter("nome") %>" readonly="readonly"></td>
			</tr>
			<tr>
				<td></td>
				<td align="left">
					<input type="submit" value="Confirmar Exclusão">
					<a href="listar_produto.jsp"><input type="button" value="Cancelar"></a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>