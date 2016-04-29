package car.tp4.itf;

import java.util.List;

import javax.ejb.Local;

import car.tp4.entity.Personne;

@Local
public interface GestionPersonneItf {
	public List<Personne> listPersonne() ;
	public void addPersonne(Personne julienLepers);
	
	
	
	
	
}
