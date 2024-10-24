<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="br.com.concessionaria.model.Carro"%>
 
<!DOCTYPE html> 
<!-- DTD Document Type Definition -->
<html>
  <head>
	<meta charset="UTF-8">
	<title>Olá Mundo</title>
	<link rel="stylesheet" href="./css/style.css">
  </head>
  <body>
		<div class="container">
			<header class="cabecalho">
				<h1>Concessionaria - PortoCar</h1>
				<nav class="menu">
					<ul>
						<li><a href="#">Comprar</a></li>
						<li><a href="#">Vender</a></li>
						<li><a href="#">Representante</a></li>
						<li><a href="loja?nome=Gabriel&idade=17">Loja</a></li>
					</ul>
				</nav>
			</header>	
			
			
			<div>
				<h2>Recuperando atributos</h2>
				
				<%
				String nome = "";
				int idade = 0;
					//Recebendo os parâmetros da Servlet
					
					if(request.getAttribute("nm") != null || request.getAttribute("id") != null){
						nome = (String)request.getAttribute("nm");
						idade = (Integer)request.getAttribute("id");
					}
				%>
			
				<p>NOME: <%=nome%></p>
				<p>IDADE: <%=idade%></p>
			</div>
			
			
			<div>
				<form action="/loja" method="post">
					<fieldset>
						<legend>Cadastro de carros</legend>
						<div>
							<label>Nome do carro</label>
							<input type="text"
							  name="nmCarro"
							  id="idCarro"
							  placeholder="Digite o nome do carro"
							  required />
						</div>
					</fieldset>
				</form>
			
			
			</div>
			
			
			<main class="principal">
				<section>
					<div>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						 Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
						  Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
						   Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
						
						</p>
					</div>
					<div>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
						 Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
						  Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
						   Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
						
						</p>
					</div>
				</section>
			</main>
			<footer class="rodape">
				<h2>Show Room</h2>
				<p>Av. dos Amigos sem Emprego 2180 - SemBloco</p>
				<p>Criado por <span>Rei Luizinho</span> &copy; 2024</p>
			</footer>							
		</div>
		
  </body>
</html>



