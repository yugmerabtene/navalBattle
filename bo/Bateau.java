package batailleNavale.bo;

import java.util.ArrayList;
import java.util.List;

public class Bateau {

	//ATTRIBUT
	private List<Case> lstboatPosition;
	
	// CONSTRUCTEUR
	public Bateau(List<Case> lstboatPosition) {
		super();
		this.lstboatPosition = lstboatPosition;
	}
	
	// CONSTRUCTEUR VIDE
	public Bateau() {
		super();
		this.lstboatPosition = new ArrayList<Case>();
	}

	//GETTERs SETTERS
	public List<Case> getLstboatPosition() {
		return lstboatPosition;
	}

	public void setLstboatPosition(List<Case> lstboatPosition) {
		this.lstboatPosition = lstboatPosition;
	}
	
	//METHODES PERSO
	public void addCase(Case caseAAjouter) {
		this.lstboatPosition.add(caseAAjouter);
	}
	// TOSTRING
	@Override
	public String toString() {
		return "Bateau [lstboatPosition=" + lstboatPosition + "]";
	}

	



	
	
	
	
}
