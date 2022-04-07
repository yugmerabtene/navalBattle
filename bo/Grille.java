package batailleNavale.bo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Grille {

	private Case[][] plateau = new Case[5][5];

	// CONSTRUCTEUR
	public Grille(Case[][] plateau) {
		super();
		this.plateau = plateau;
	}

	// CONSTRUCTEUR VIDE
	public Grille() {
		super();
	}

	// GETTER SETTER CASE PLATEAI GRILLE
	public Case[][] getPlateau() {
		return plateau;
	}

	public void setPlateau(Case[][] plateau) {
		this.plateau = plateau;
	}

	// METHODES PERSO
	public void initGrille() {
		for (int i = 0; i < plateau.length; i++) {
			for (int j = 0; j < plateau[i].length; j++) {
				plateau[i][j] = new Case('O', null);

			}
		}
	}

	public void afficherPlateau() {
		for (int i = 0; i < plateau.length; i++) {
			System.out.print("---|");
		}
		System.out.println();
		for (int i = 0; i < plateau.length; i++) {
			for (int j = 0; j < plateau[i].length; j++) {
				System.out.print(" " + plateau[i][j].getSymbole() + " |");

			}
			System.out.println();
			for (int j = 0; j < plateau.length; j++) {
				System.out.print("---|");
			}
			System.out.println();
		}
	}

	public void placerBateau() {
		// INTIALISE UN OBJET BATEAU
		Bateau bateau = new Bateau();
		// creer une position random en objet
		Random randomPosition = new Random();
		// INTIALISE UN OBJET POSITION X EN RECUPERANT LE RANDOMPOSITION EN HAUT ET EN
		// METTAN UN MAX DE 3
		int positionX = randomPosition.nextInt(4);
		// INTIALISE UN OBJET POSITION X EN RECUPERANT LE RANDOMPOSITION EN HAUT ET EN
		// METTAN UN MAX DE 3
		int positionY = randomPosition.nextInt(4);
		randamOriantation(positionX, positionY, bateau);

	}

	public boolean left(int positionX) {
		if (positionX == 0) {
			return false;
		}
		return true;
	}

	public boolean right(int positionX) {
		if (positionX == plateau.length) {
			return false;
		}
		return true;
	}

	public boolean top(int positionY) {
		if (positionY == 0) {
			return false;
		}
		return true;
	}

	public boolean bottom(int positionY) {
		if (positionY == plateau.length) {
			return false;
		}
		return true;
	}

	public void randamOriantation(int positionX, int positionY, Bateau bateau) {

		Random randomPosition = new Random();
		// ORIENTATION POSSIBLE DU BATEAU
		List<String> orientationPossible = new ArrayList<String>();

		if (top(positionY)) {
			orientationPossible.add("top");

		} else if (bottom(positionY)) {
			orientationPossible.add("bottom");
		} else if (right(positionX)) {
			orientationPossible.add("right");
		} else if (left(positionX)) {
			orientationPossible.add("left");
		}

		String orientationChoisi = orientationPossible.get(randomPosition.nextInt(orientationPossible.size()));

		switch (orientationChoisi) {
		case "top": {
			plateau[positionX][positionY].setDestroyer(bateau);
			plateau[positionX][positionY - 1].setDestroyer(bateau);

			bateau.addCase(plateau[positionX][positionY]);
			bateau.addCase(plateau[positionX][positionY - 1]);
			break;
		}
		case "bottom": {
			plateau[positionX][positionY].setDestroyer(bateau);
			plateau[positionX][positionY + 1].setDestroyer(bateau);

			bateau.addCase(plateau[positionX][positionY]);
			bateau.addCase(plateau[positionX][positionY + 1]);
			break;
		}
		case "right": {
			plateau[positionX][positionY].setDestroyer(bateau);
			plateau[positionX + 1][positionY].setDestroyer(bateau);

			bateau.addCase(plateau[positionX][positionY]);
			bateau.addCase(plateau[positionX + 1][positionY]);
			break;
		}
		case "left": {
			plateau[positionX][positionY].setDestroyer(bateau);
			plateau[positionX - 1][positionY].setDestroyer(bateau);

			bateau.addCase(plateau[positionX][positionY]);
			bateau.addCase(plateau[positionX - 1][positionY]);
			break;
		}

		}
	}

	@Override
	public String toString() {
		return "Grille [plateau=" + Arrays.toString(plateau) + "]";
	}

}
