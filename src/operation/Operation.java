package operation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Operation implements Comparable<Operation>{
	private float montant;
	private String descriptif;
	private LocalDateTime date;
	
	public Operation(float montant, String desc){
		this.montant = montant;
		this.descriptif = desc;
		this.date = LocalDateTime.now();;
	}
	
	public float getMontant(){
		return montant;
	}
	
	public String getDescription(){
		return descriptif;
	}
	
	public LocalDateTime getDate(){
		return date;
	}
	
	public String toString(){
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return this.getMontant() + "€ à " + this.getDate().format(format) 
		+ " : " + this.getDescription();
	}
	
	@Override
	public int compareTo(Operation o) {
		return this.date.compareTo(o.getDate());
	}
	
	
}
