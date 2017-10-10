package operation;

public class Retrait extends Operation {

	public Retrait(float montant, String desc) {
		super(montant, desc);
	}
	
	@Override
	public float getMontant(){
		return - super.getMontant();
	}
	public String toString(){
		return "Retrait de " + super.toString();
	}
}
