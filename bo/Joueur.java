package batailleNavale.bo;

import java.util.Scanner;

public class Joueur {
	
	private Case playerPosition;
	//METHODE JOUEUR 

	public void predictPlayerPosition(Grille plateau) {
		
		Scanner position = new Scanner(System.in);
		
		System.out.println("Choisissez une position X :");
		
		int x = position.nextInt() - 1;
		
		System.out.println("Choisissez une position Y :");
		// TRIM POUR ENLEVER LES \r\n
		position.nextLine();
		int y = position.nextInt() - 1;
			
		
		
		if (plateau.getPlateau()[x][y].getDestroyer()!= null) {
			
			plateau.getPlateau()[x][y].setSymbole('X');
			plateau.afficherPlateau();
			
			Bateau bateau = plateau.getPlateau()[x][y].getDestroyer();
			
			boolean allFoundCase = true;
			
			for (Case currentCase : bateau.getLstboatPosition()) {
				if (currentCase.getSymbole() != 'X') {
					allFoundCase = false;
				}
			}
			
			if (allFoundCase) {
				System.out.println("     o_.-._                            .   . .\r\n"
						+ "             |_.-._|                        .  . .  ' \r\n"
						+ "             |                         . '. '\r\n"
						+ "        ^^^^^^^                       :'\r\n"
						+ "^^^ ^^^ | : : | ^^^ ^^^              .;      o t         o\r\n"
						+ "| |_| |_|     |_| |_| |              ..    p     p     p\r\n"
						+ "|                     |           .--++-.          o t\r\n"
						+ "|  :   :  .-.  :   :  |        .__|]_[]_'-...... \r\n"
						+ "|         | |         |         \\ o o o '=-=-=-!\r\n"
						+ "\"'\"''\"\"'\"\"\"''''\"'\"''\"\"'''~~~~~~~~\\_____________|~~~~BRAVO VOUS AVEZ GAGNE~~~~");
				System.exit(0);
			}
			
		} else {
			plateau.getPlateau()[x][y].setSymbole('#');
			plateau.afficherPlateau();
						
		}
		
		
	}
	
	// CONSTRUCTEUR VIDE 
	public Joueur() {
		super();
	}

	// CONSTRUCTEUR
	public Joueur(Case playerPosition) {
		super();
		this.playerPosition = playerPosition;
	}
	
	//GETTERS AND SETTERS
	public Case getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(Case playerPosition) {
		this.playerPosition = playerPosition;
	}

	@Override
	public String toString() {
		return "Joueur [playerPosition=" + playerPosition + "]";
	}
	
	

}
