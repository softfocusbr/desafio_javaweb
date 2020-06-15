package controller.produto.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.produto.DAOProduto;

@SuppressWarnings("serial")
public class IncluirProduto extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String n = request.getParameter("nome");
			Integer cd = 0;
			String categoria = request.getParameter("categoria");

			if (DAOProduto.isNomeProdutoValido(n, cd)) {
				DAOProduto.incluirProduto(n, Integer.parseInt(categoria), request.getParameter("descricao"));
			} else {
				response.setContentType("text/html; charset=iso-8859-1;");

				PrintWriter out = response.getWriter();
				out.println("<html><head><title>Projeto Java Web</title></head><body>");
				out.println("<h4>Atenção: Nome do produto já cadastrado</h4><a href='javascript:window.history.go(-1)'><input type='button' value='Voltar'></a>");
				out.println("<a href='index.jsp'><input type='button' value='Tela Inicial'></a></body></html>");
				out.close();
			}
			response.setContentType("text/html; charset=iso-8859-1;");

			PrintWriter out = response.getWriter();
			out.println("<html><head><title>Projeto Java Web</title></head><body>");
			out.println("<h4>Operação efetuada com sucesso!</h4>");
			out.println("<a href='index.jsp'><input type='button' value='Tela Inicial'></a></body></html>");
			out.close();
		} catch (Exception e) {
			response.setContentType("text/html; charset=iso-8859-1;");

			PrintWriter out = response.getWriter();
			out.println("<html><head><title>Projeto Java Web</title></head><body>");
			out.println("<h4>Erro crítico no sistema:" + e.getMessage() + "</h4><a href='javascript:window.history.go(-1)'><input type='button' value='Voltar'></a>");
			out.println("<a href='index.jsp'><input type='button' value='Tela Inicial'></a></body></html>");
			out.close();
		}
	}
}
