package Personnage;
import Peuples.Peuple;
import Pouvoirs.Pouvoir;

public class Personnage {
	
	
	private Peuple peup;
	private Pouvoir pouv;
	private int boulots;
	
	public Personnage(){
		
		peup = null;
		pouv = null;
		boulots = 0;
	}
	
	public Personnage(Personnage perso){
		
		peup = perso.get_peuple();
		pouv = perso.get_pouvoir();
		boulots = perso.get_boulots();
		
	}
	
	
	public Personnage(Peuple newPeup, Pouvoir newPouv){

		peup = newPeup;
		pouv = newPouv;
		boulots = peup.get_boulots();
		
	}
	
	
	public Peuple get_peuple(){
		return peup;
	}
	
	public Pouvoir get_pouvoir(){
		return pouv;
	}
	
	public int get_boulots(){
		return boulots;
	}
	/* Exemple LO43 : LO (nom) , 43 (niveau) , TM (type) */
	
	public int attaque(int nbrBoulots,int niveau , String type , String nom){
		
		return (pouv.attaque(nom) + peup.attaque(nbrBoulots,niveau,type));
	}
	
	public int defense (int nbrBoulots){
		return peup.defense(nbrBoulots);
	}
	
	public boolean isPossible(int x , int y){
		return peup.isPossible(x, y);
	}
	
	public String get_name(){
		return peup.get_nom() + " " + pouv.get_nom();
	}
	
	public void set_boulots(int nbrBoulots){
		
		boulots += nbrBoulots;
		
	}
		
	
	
	

}
