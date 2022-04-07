package batailleNavale.bo;

public class Case {
	
	// ATRIBUTS
	
	private char symbole;
	private Bateau destroyer;
	
	
	
	
	// CONSTRUCTEUR VIDE
	public Case() {
		super();
	}	
	
	// CONSTRUCTEUR
	public Case(char symbole, Bateau destroyer) {
		super();
		this.symbole = symbole;
		this.destroyer = destroyer;
	}
	//CONSTRUCTEUR
	
	public char getSymbole() {
		return symbole;
	}


	// GETTERS SETETRS


	public void setSymbole(char symbole) {
		this.symbole = symbole;
	}





	public Bateau getDestroyer() {
		return destroyer;
	}


	public void setDestroyer(Bateau destroyer) {
		this.destroyer = destroyer;
	}

	@Override
	public String toString() {
		return "Case [symbole=" + symbole + ", destroyer=" + destroyer + "]";
	}
	


}
