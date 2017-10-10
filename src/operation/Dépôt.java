package operation;

public class Dépôt extends Operation {

	public Dépôt(float montant, String desc) {
		super(montant, desc);
	}

	public String toString(){
		return "Dépôt de " + super.toString();
	}
}
