package car.tp4.manager;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import car.tp4.entity.Livre;
import car.tp4.itf.GestionLivreItf;

@Stateless
public class GestionLivre implements GestionLivreItf {
	@PersistenceContext
	private EntityManager em;
	
	/**
	 * Premier service
	 */
	public void init()
	{
		Livre l1 = new Livre("Edouard Eric Java", "Le java, c'est la Java", "1974");
		Livre l2 = new Livre("Patrick Henry Parker", "How to PHP","1990");
		Livre l3 = new Livre("Christian Paul Picard","See plus plus, the C++","1989");
		this.em.persist(l1);
		this.em.persist(l2);
		this.em.persist(l3);
	}
	
	/**Deuxieme service obtention des auteurs
	 * @return La liste des auteurs
	 */
	public List<String> getAuteurs()
	{
		Query q1= this.em.createQuery("SELECT l.auteur FROM Livre l");
		return (List<String>) q1.getResultList();
	}
	
	public List<Livre> getLivres()
	{
		Query q1= this.em.createQuery("SELECT l FROM Livre l");
		return (List<Livre>) q1.getResultList();
	}

	@Override
	public void ajouterLivre(String titre, String auteur, String annee) {
		Livre nouveauLivre = new Livre(auteur, titre, annee);
		this.em.persist(nouveauLivre);
		
	}

	
	
	
	
	

}