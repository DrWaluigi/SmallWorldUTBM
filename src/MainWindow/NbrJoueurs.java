package MainWindow;
import javax.swing.Box;
import javax.swing.JDialog;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;

import Personnage.Personnage;
import Peuples.Peuple;




public class NbrJoueurs extends javax.swing.JDialog{
	
	private ArrayList <String> gamers = new ArrayList<String>();
	
/* Création des composants */
	
	/* Box */
	Box structure = Box.createVerticalBox();
    Box joueur = Box.createHorizontalBox();
    
    Box nbrJoueur = Box.createVerticalBox();
    
    
    /* Grid */
    
    GridLayout grid = new GridLayout(4,2);
    
    /* Pannel */
    
    JPanel content = new JPanel(grid);
    
    
    /* Champ texte */
    
    JTextField[] nom_joueur = new JTextField[4];

    
    /* Bouton */
    JButton valider = new JButton("Valider");

    /* Spinner */
    SpinnerModel choice =
            new SpinnerNumberModel(2, //initial value
                                   2, //min
                                   4, //max
                                   1);  // pas
   JSpinner choix = new JSpinner(choice);
    
   	/* Label */
    Label question = new Label("Veuillez choisir le nombre de joueurs");
    Label bienvenue = new Label("Bienvenue sur le jeu Small World UTBM");
    
    Label [] label_joueur = new Label[4];
    

    /* Panel */
    JPanel buttonPane = new JPanel();
	
	/* Constructeur */
	public NbrJoueurs() {
		super();
		this.setTitle("Nombre de Joueurs");
	    this.setSize(500, 250);
	    this.setLocationRelativeTo(null);
	  //this.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
	    initComponents();
	}
	
	/* Utilisations des composants */
	private void initComponents(){
	    
		/* Organisation */
	   
	    
	    
	    nom_joueur[0] = new JTextField("Joueur1");
	    nom_joueur[1] = new JTextField("Joueur2");
	    nom_joueur[2] = new JTextField("Joueur3");
	    nom_joueur[3] = new JTextField("Joueur4");
	    
	    nom_joueur[2].setVisible(false);
	    nom_joueur[3].setVisible(false);
	    
	    label_joueur[0] = new Label("Joueur 1");
	    label_joueur[1] = new Label("Joueur 2");
	    label_joueur[2] = new Label("Joueur 3");
	    label_joueur[3] = new Label("Joueur 4");
	    
	    label_joueur[2].setVisible(false);
	    label_joueur[3].setVisible(false);
	    
	    for(int value = 0 ; value < 4 ; ++ value){
	    	content.add(label_joueur[value]);
	    	content.add(nom_joueur[value]);
	    	
	    }
	    
	    buttonPane.add(valider);

	    joueur.add(question);
	    joueur.add(choix);
	    
	    structure.add(bienvenue);
	    structure.add(joueur);
	    
	    nbrJoueur.add(content);
	    
	    TitledBorder joueur_title = new TitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black),"Noms des joueurs");
	    content.setBorder(joueur_title);
	    
	    structure.add(nbrJoueur);
	    
	    this.add(structure);
	    
	    
	    this.getContentPane().add(buttonPane,BorderLayout.SOUTH);
	    
	    
	    /* Création des signaux */
	    
	    /* Signal valider */
	    valider.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				
				// Utiliser fonction qui changera nbr de joueur (Verifier que les noms sont différents)
				gamers.clear();
				for(int nombreJoueur = 0 ;nombreJoueur < (int) choice.getValue() ; ++nombreJoueur){
					
					gamers.add(nom_joueur[nombreJoueur].getText());
								
				}
				
				
			} 
		});
	    
	    
	    /* Au changement du nombre de joueurs */
	      
	    choice.addChangeListener(new ChangeListener(){
	    	 public void stateChanged(ChangeEvent e) {
		          
	    		 for(int nombreJoueur = 0 ;nombreJoueur < 4; ++nombreJoueur){
	    		 
	    			 if(nombreJoueur < (int) choice.getValue()){
	    				 
	    				 label_joueur[nombreJoueur].setVisible(true);
	    				 nom_joueur[nombreJoueur].setVisible(true);
	    				 
	    			 }
	    			 else{
	    				 
	    				 label_joueur[nombreJoueur].setVisible(false);
	    				 nom_joueur[nombreJoueur].setVisible(false);
	    				 
	    			 }
	    		 
	    		 }
	    	 }
	     });
	    
	    
	}
	

	/* Retourne liste de joueurs */
	
	
	public ArrayList <String> return_player(){
		return gamers;
	}
	
	
	/*public ArrayList <String> return_player(){
		this.setVisible(true);
		// Signal valider
		
		final ArrayList <String> gamers = new ArrayList<String>();
		
		valider.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 			
				gamers.clear();
				for(int nombreJoueur = 0 ;nombreJoueur < (int) choice.getValue() ; ++nombreJoueur){
					
					gamers.add(nom_joueur[nombreJoueur].getText());
					//Ajouter les joueurs au tableau et verifier si pas 2 pareil

								
				}
				
				for(String  value : gamers){
					System.out.println(value);
				}
				
				
			} 
		}); 
		
		while (gamers.isEmpty()){
			
		}
		
			
		System.out.println("new");
		
		for(String  value : gamers){
			System.out.println(value);
		}
		
		return gamers;
		
		
	}
	*/
	/* Retourne nombre de joueurs */
	
	
	
    /* Affichage */
    
	public void afficher(){		
		this.setVisible(true);
		while(gamers.isEmpty()){
			System.out.println("");
		}
		this.setVisible(false);
	}
	
	
	
}
