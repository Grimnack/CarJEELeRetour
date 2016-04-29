package car.tp4.servlet;

import java.io.IOException;
import java.util.ArrayList;
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

@WebServlet("/init")
public class InitServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5856488992948502846L;
	
	@EJB
	GestionLivreItf gl = new GestionLivre();

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		gl.init();
		List<Livre> liste = gl.getLivres();
		req.setAttribute("listeLivre", liste);
		RequestDispatcher dp =getServletContext().getRequestDispatcher("/afficheLivre.jsp");
		dp.forward(req, resp);
	}

}
