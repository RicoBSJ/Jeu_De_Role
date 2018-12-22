
public abstract class Personnage {

	protected String armes = "", chaussure = "", sacDeSoin = "";

	// Méthode de déplacement de personnage
	public void seDeplacer() {
		System.out.println("Je me déplace à pied.");
	}

	// Méthode que les combattants utilisent
	public void combattre() {
		System.out.println("Je ne combats PAS !");
	}

	// Méthode que les guerrier, civil et sniper utilisent
	public void soigner() {
		System.out.println("Je ne soigne pas.");
	}

	protected void setArmes(String armes) {
		this.armes = armes;
	}

	protected void setChaussure(String chaussure) {
		this.chaussure = chaussure;
	}

	protected void setSacDeSoin(String sacDeSoin) {
		this.sacDeSoin = sacDeSoin;
	}
}