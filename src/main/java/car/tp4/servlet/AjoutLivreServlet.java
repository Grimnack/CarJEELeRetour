package car.tp4.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import car.tp4.itf.GestionLivreItf;
import car.tp4.manager.GestionLivre;

@WebServlet("/ajoutLivre")
public class AjoutLivreServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8208317383606595697L;
	
	@EJB
	GestionLivreItf gl= new GestionLivre();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String titre = req.getParameter("titre");
		String auteur = req.getParameter("auteur");
		String annee = req.getParameter("annee");
		gl.ajouterLivre(titre, auteur, annee);
		RequestDispatcher dp =getServletContext().getRequestDispatcher("/ajoutLivre.jsp");
		dp.forward(req, resp);
	}

}