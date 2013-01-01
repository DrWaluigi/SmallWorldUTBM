package Joueur;
import Personnage.Personnage;
import Map.*;
import Pile.*;

public class Joueur {

	private int numero;
	private String nom;
	private int credits;
	private Personnage perso;
	private Personnage perso_declin;
	private boolean declin;
	
	public Joueur(){
		numero = 0;
		nom = "";
		credits = 20;
		declin = false;
		perso = null;
		perso_declin = null;
	}
	
	public Joueur(int number,String name){
		numero = number;
		nom = name;
		credits = 20;
		declin = false;
		perso = null;
		perso_declin = null;
		
	}
	
	public boolean choisir_perso(int numeroPerso){
		/* CODE */
		if(Pile.getInstance().get_price(numeroPerso) > credits){
			return false;
		}
		else{
			
			credits += Pile.getInstance().get_credits(numeroPerso);
			perso = Pile.getInstance().set_Personnage(numeroPerso); // recopie ?
			return true;
		}
		
		
	}
	
	public boolean passer_declin(){
		/* CODE */
	}
	
	public boolean isPossible(int x, int y){
		
		/* CODE */
		
		
	}
	
	public void add_credits(int nbrCredits){
		credits += nbrCredits;
	}
	
	public void set_personnage(Personnage personnage){
		perso = personnage;//Peut etre recopie necessaire
	}
	
	public String get_name(){
		return nom;
	}
	
	public int get_credits(){
		System.out.println(credits);
		return credits;
	}
	
	public Personnage get_perso(){
		return perso;		
	}
	
	public Personnage get_perso_declin(){
		return perso_declin;
	}
}
