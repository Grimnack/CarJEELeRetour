<html>
<body>

<%

String auteur = request.getParameter("auteur");
if ( auteur != null && !auteur.isEmpty() ) {
    String titre = request.getParameter("titre");
    String annee = request.getParameter("annee");
    out.print("Auteur : "+auteur+"<br/>");
    out.print("Titre : "+titre+"<br/>");
    out.print("Ann&eacute; : "+annee+"<br/><p/>");
    
    %>
    <form action="ajoutLivre" method="post>
    Auteur : <input type="text" name="auteur" value="<%= auteur %>"><br/>
    Titre : <input type="text" name="titre" value="<%= titre %>"><br/>
    Année : <input type="text" name="annee" value="<%= annee %>"><br/>
    <input type="submit">
	</form>
    
    
    
<% }

else
{ %>


<form action="ajoutLivre" method="post">
Auteur : <input type="text" name="auteur"><br/>
Titre : <input type="text" name="titre"><br/>
Ann&eacute;e : <input type="text" name="annee"><br/>
<input type="submit">
</form>
<% } %>
</body>
</html>
