package Etudiant;

import Joueur.Infos_jeu;
import Map.Map;

/* Profs 
 * Bonus +1 defense
 */

public class Profs extends Etudiant{
	
	public Profs(){
		super();
		this.nom = "Prof";
	}

	public int attaque(int nbrBoulots, int niveau , String type){
		return nbrBoulots;
	}
	
	public int defense(int nbrBoulots){
		return nbrBoulots + 1;
	}
	
	public boolean isPossible(int x, int y) {
		if (x<0 || x>3 || y<0 || y>5)
		{
			return false;
		}
		else if(Map.getInstance().is_present(Infos_jeu.getInstance().get_current_joueur()) == false && (x == 0 || x == 3 || y == 0 || y == 5)){
			return true;
		}
		else{			
				for(int ligne_autour = -1; ligne_autour <= 1 ; ++ligne_autour){
					if(x + ligne_autour >= 0 && x + ligne_autour < 4){
						for(int colonne_autour = -1; colonne_autour <= 1 ; ++colonne_autour){
							if(y + colonne_autour >= 0 && y + colonne_autour < 6){
								if(Map.getInstance().get_case(x + ligne_autour, y + colonne_autour).get_joueur() != null){
									if(Map.getInstance().get_case(x + ligne_autour, y + colonne_autour).get_joueur().get_name()
											.equals(Infos_jeu.getInstance().get_current_joueur().get_name())){
										return true;
								}
							}
						}
					}
					
				}
				
			}
		
			
		return false;	
		}
		
		
	}
	
	public String get_description(){
		return "Construit des exams (+1 def) sur ses cases";
	}
}
