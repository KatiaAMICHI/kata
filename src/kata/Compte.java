package kata;

import java.util.ArrayList;
import java.util.Collections;

import operation.Dépôt;
import operation.Operation;
import operation.Retrait;

public class Compte {
	
	private ArrayList<Operation> historique;
	private Client client;
	public Compte(Client client) {
		historique = new ArrayList<Operation>();
		this.client = client;
	}

	public float getSolde(){
		float resultat = 0;
		for(Operation o : historique)
			resultat += o.getMontant();
		return resultat;
	}
	
	public void retirer(float montant, String descriptif) throws Exception {
		if (this.getSolde() < montant)
			throw new Exception("Solde insuffisant");
		historique.add(new Retrait(montant, descriptif));
	}
	
	public void deposer(float montant, String descriptif){
		historique.add(new Dépôt(montant, descriptif));
	}
	
	public String relevé(){
		Collections.sort(historique);
		String s = client.toString() + "\n";
		for(Operation o : historique)
			s+= o.toString() + "\n";
		s+= "Solde : " + this.getSolde() + "€";
		return s;
	}
	
}
