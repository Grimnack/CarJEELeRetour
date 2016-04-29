package car.tp4.manager;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import car.tp4.entity.Personne;
import car.tp4.itf.GestionPersonneItf;

@Stateless
public class GestionPersonne implements GestionPersonneItf {
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Personne> listPersonne() {
		Query qr = this.em.createQuery("SELECT P FROM Personne P");
		return (List<Personne>) qr.getResultList();
	}

	@Override
	public void addPersonne(Personne julienLepers) {
		this.em.persist(julienLepers);
	}

}
