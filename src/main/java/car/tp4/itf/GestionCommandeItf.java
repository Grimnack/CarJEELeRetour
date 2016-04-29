package car.tp4.itf;

import java.util.List;

import javax.ejb.Local;

import car.tp4.entity.Commande;
import car.tp4.entity.Personne;

@Local
public interface GestionCommandeItf {
	public List<Commande> getCommandes();
	public void ajouteCommande(Commande commande);
	public List<Commande> getCommandePersonne(Personne p);
	
}
