<%@ page import ="car.tp4.entity.Livre" %>
	<%@ page import ="java.util.ArrayList" %>
		<%@ page import ="java.util.List" %>
<html>
<body>

<table>
	<tr>
		<th>Titre</th>
		<th>Auteur</th>
		<th>Annee</th>
	</tr>

<% 
			
			List<Livre> listes = (List<Livre>)request.getAttribute("listeLivre");
			for(Livre l : listes) { %>
	<tr>
		<td><%= l.getTitre() %></td>
		<td><%= l.getAuteur() %></td>
		<td><%= l.getAnnee() %></td>
	</tr>
<% } %>
</table>

</body>
</html>
