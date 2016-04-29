package car.tp4.servlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import car.tp4.entity.Livre;
import car.tp4.itf.GestionLivreItf;
import car.tp4.manager.GestionLivre;

@WebServlet("/auteur")
public class AuteurServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4300119982900156L;
	
	@EJB
	GestionLivreItf gl = new GestionLivre();

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		List<String> auteurs = gl.getAuteurs();
		req.setAttribute("auteurs", auteurs);
		RequestDispatcher dp =getServletContext().getRequestDispatcher("/afficheAuteurs.jsp");
		dp.forward(req, resp);
	}

}
