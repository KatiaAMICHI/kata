package operation;

public class D�p�t extends Operation {

	public D�p�t(float montant, String desc) {
		super(montant, desc);
	}

	public String toString(){
		return "D�p�t de " + super.toString();
	}
}
