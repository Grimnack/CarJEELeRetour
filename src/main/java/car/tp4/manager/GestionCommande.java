package car.tp4.manager;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import car.tp4.entity.Commande;
import car.tp4.entity.Personne;
import car.tp4.itf.GestionCommandeItf;

@Stateless
public class GestionCommande implements GestionCommandeItf {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Commande> getCommandes() {
		Query qr = em.createQuery("SELECT c FROM Commande c");
		return (List<Commande>) qr.getResultList();
	}

	@Override
	public void ajouteCommande(Commande commande) {
		em.persist(commande);
		
	}

	@Override
	public List<Commande> getCommandePersonne(Personne p) {
		Query qr = em.createQuery("SELECT c FROM Commande WHERE c.Personne=:id");
		qr.setParameter("id", p.getId());
		return (List<Commande>) qr.getResultList();
	}
	
	
}
