package controller.produto.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.produto.DAOProduto;

@SuppressWarnings("serial")
public class ExcluirProduto extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String codigo = request.getParameter("codigo");
			Integer cdInt = Integer.parseInt(codigo);
			
			DAOProduto.excluirProduto(cdInt);
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