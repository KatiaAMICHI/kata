package kata;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {

	private String nom, prenom;
	private LocalDate naissance;
	
	public Client(String nom, String prenom, LocalDate naissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
	}

	public String toString(){
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return nom + " " + prenom + " (" + format.format(naissance);
	}
}
