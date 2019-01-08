import java.util.ArrayList;

public class Personnage {
	protected String nom;
	protected int force;
	protected int agilite;
	protected int endurance;
	protected int intelligence;
	protected int sagesse;
	private ArrayList<Equipement> equipements;
	private Humain race;
	
	public Personnage() {
		this.nom = "Arthur";
		this.force = 10;
		this.agilite = 10;
		this.endurance = 10;
		this.intelligence = 10;
		this.sagesse = 10;
		this.setRace(new Humain());
		this.equipements = new ArrayList<Equipement>();
		}

	public Humain getRace() {
		return race;
	}

	public void setRace(Humain race) {
		this.race = race;
	}
	
	public void ajouterEquipement(final Equipement equipement) {
		this.equipements.add(equipement);
		}
}
