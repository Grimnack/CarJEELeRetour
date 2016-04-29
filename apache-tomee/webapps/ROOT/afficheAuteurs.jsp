<%@ page import ="java.util.List" %>
	<% 
			
		List<String> aut = (List<String>)request.getAttribute("auteurs");
			%>
	<html>
		<body>
			<h1>
				Auteurs
			</h1>
			<ul>
			<%	for(String s : aut) { %>
				<li><%= s %></li>
				<% } %></%>
					</ul>
		</body>
	</html>