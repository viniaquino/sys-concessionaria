package br.com.concessionaria.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import br.com.concessionaria.bo.CarroBO;
import br.com.concessionaria.model.Carro;

/**
 * Servlet implementation class TrafegoController
 */
public class TrafegoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrafegoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CarroBO cbo = new CarroBO();
		List<Carro> lista = cbo.listaCarro();
		
		request.setAttribute("listaCarros", lista);
		
		request.getRequestDispatcher("listagem.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//	String modelo = request.getParameter("modelo");	
		
//		Carro carro = new Carro();
//		
//		carro.setModelo(request.getParameter("modelo"));
//		carro.setNome(request.getParameter("nome"));
//		carro.setCor(request.getParameter("cor"));
//		carro.setAno(Integer.parseInt(request.getParameter("ano")));
//		carro.setPreco(Double.parseDouble(request.getParameter("preco")));
		
		CarroBO cbo = new CarroBO();
		
		if(cbo.validacao(request.getParameter("modelo"),
				request.getParameter("nome"),
				request.getParameter("cor"),
				Integer.parseInt(request.getParameter("ano")),
				Double.parseDouble(request.getParameter("preco")))) {
			response.sendRedirect("sucesso.jsp");
		}else {
			
			String funcJs = "<script>\r\n"
					+ "function msgErro(){\r\n"
					+ "        const elMsg = document.querySelector(\".Erro\");\r\n"
					+ "        setTimeout(() => {\r\n"
					+ "            elMsg.style.display = \"none\";\r\n"
					+ "        },3000);\r\n"
					+ "    }\r\n"
					+ "msgErro();\r\n"
					+ "</script>";
			
			//Crie um dispatcher para a página dados.jsp com um atributo de nome msg.
			//A mensagem deve alertar o usuario sobre o erro do preenchimento!!
			request.setAttribute("msg", "Erro");
			request.setAttribute("al", funcJs);
			request.getRequestDispatcher("dados.jsp").forward(request, response);	
		}
		
//		request.setAttribute("objCarro", carro);
//		
//		request.getRequestDispatcher("resultado.jsp").forward(request, response);
//		
	}

}
