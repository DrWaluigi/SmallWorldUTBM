package Pouvoirs;

public class Philosophes {

	public Philosophes(){
		super();
		this.nom = "Philosophe";
		
	}
	
	int attaque(String type){
		if (type.equals("PH")){
			return 1;
		}
		else{
			return 0;
		}
	}
	
}