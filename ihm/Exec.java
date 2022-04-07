package batailleNavale.ihm;

import java.io.IOException;

import batailleNavale.bo.Grille;
import batailleNavale.bo.Joueur;

public class Exec {
	public static void main(String[] args) throws IOException {
		
		System.out.println("    ____        __        _ ____                                __   \r\n"
				+ "   / __ )____ _/ /_____ _(_) / /__     ____  ____ __   ______ _/ /__ \r\n"
				+ "  / __  / __ `/ __/ __ `/ / / / _ \\   / __ \\/ __ `/ | / / __ `/ / _ \\\r\n"
				+ " / /_/ / /_/ / /_/ /_/ / / / /  __/  / / / / /_/ /| |/ / /_/ / /  __/\r\n"
				+ "/_____/\\__,_/\\__/\\__,_/_/_/_/\\___/  /_/ /_/\\__,_/ |___/\\__,_/_/\\___/ \r\n"
				+ "                                                                     ");
		
		
		
		Grille plateau = new Grille();
		
		plateau.initGrille();
		plateau.afficherPlateau();
		
		plateau.placerBateau();
		
		Joueur joueur = new Joueur();
		while(true) {
			joueur.predictPlayerPosition(plateau);
		}
		
		
	
		
	}
}
