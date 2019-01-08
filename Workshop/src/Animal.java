public class Animal {
	public String nom;
	public static String DESCRIPTION = "";
	
	public void son() {
		
	};
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	public String toString() {
		return " je suis " + this.getNom();
	}
}
