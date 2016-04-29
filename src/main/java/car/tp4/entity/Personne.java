package car.tp4.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7422352067760929757L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	private String nom;
	private Collection<Livre> panier;
	
	public Personne(String nom, Collection<Livre> panier){
		this.nom = nom;
		this.panier = panier;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Collection<Livre> getPanier() {
		return panier;
	}

	public void setPanier(Collection<Livre> panier) {
		this.panier = panier;
	}
	
	
	
	
}
