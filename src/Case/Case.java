package Case;
import Joueur.*;

public class Case {
	
	private String nom;
	private int niveau;
	private String type;
	private Joueur player;
	private int boulots;
	private boolean declin;
	private boolean lock; /* Administratifs verouille 2 UVs */
	
	/* Name : LO , Level : 43 , Kind : CS */
	
	public Case(String name, int level , String kind){
		nom = name;
		niveau = level;
		type = kind;
		player = null;
		boulots = 0;
		declin = false;
		lock = false;
		
	}
	
	public Case() {
		nom = "Case vide";
		niveau = 0;
		type = "Case vide";
		player = null;
		boulots = 0;
		declin = false;
		lock = false;
	}
	
	public String get_nom(){
		return nom;
	}
	
	public int get_niveau(){
		return niveau;
	}
	
	public String get_type(){
		return type;
	}
	
	public Joueur get_joueur(){
		return player;
	}
	
	public boolean get_lock(){
		return lock;
	}
	
	public boolean get_declin(){
		return declin;
	}
	
	public int get_boulots(){
		return boulots;
	}
	
	public boolean combat(int nbrBoulots, Joueur attaquant){
		/* CODE */
		return true; // Pour tests
	}
	
	
	/* Setters */
	
	public void setCase(String name, int level , String kind){
		nom = name;
		niveau = level;
		type = kind;
		player = null;
		boulots = 0;
		declin = false;
		lock = false;
		
	}
	
	public boolean is_present(Joueur gamer){
		
		if(nom.equals(gamer.get_name())){
			return true;
		}
		else{
			return false;
		}
	}

}
