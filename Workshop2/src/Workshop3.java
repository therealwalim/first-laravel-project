
public class Workshop3 {

	public static void main(String[] args) {
		Personnage personnage = new Personnage();
		Humain human = new Humain();
		
		System.out.println("Je suis " + personnage.nom);
		System.out.println("J'ai " + personnage.force + " de force.");
		System.out.println("J'ai " + personnage.agilite + " d'agilité.");
		System.out.println("J'ai " + personnage.endurance + " d'endurance.");
		System.out.println("J'ai " + personnage.intelligence + " d'intelligence.");
		System.out.println("Je suis un " + human.nom);

	}

}
