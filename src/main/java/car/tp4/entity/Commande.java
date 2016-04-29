package car.tp4.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commande implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3208481738258708046L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	
	private Personne personne ;
	private Collection<Livre> lesLivre;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public Collection<Livre> getLesLivre() {
		return lesLivre;
	}
	public void setLesLivre(Collection<Livre> lesLivre) {
		this.lesLivre = lesLivre;
	}
	
}
