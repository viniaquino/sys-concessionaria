<%@page import="br.com.concessionaria.model.Carro"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Concessionaria PortoCar</title>
</head>
<body>
	<h1>Bem-vindo a Concessionaria PortoCar</h1>
				<div>
				<form action="/dados" method="post">
					<fieldset>
					
				</div>
				
				<%
					Carro carro = (Carro)request.getAttribute("objCarro");
				%>
				<div>
				<p>MODELO DO VEÍCULO   : <span><%=carro.getModelo()%></span></p>
				<p>NOME DO VEÍCULO     : <span><%=carro.getNome()%></span></p>
				<p>COR DO VEÍCULO      : <span style="background-color:<%=carro.getCor()%>;color:#fff"><%=carro.getCor()%></span></p>
				<p>ANO DO VEÍCULO      : <span><%=carro.getAno()%></span></p>
				<p>VALOR DO VEÍCULO R$ : <span><%=carro.getPreco()%></span></p>
				</div>
					</fieldset>
				</form>
			
	<p><a href="dados.jsp">HOME</a></p>
</body>
</html>