import java.util.Scanner;

public class Hero extends Personnage {
	private String nom;
	private String deplacement;
	private int exp;
	private int arme; //Arme[] inventaire_arme = new Arme[2];
	private int artefacts; //Artefacts[] inventaire_artefacts = new Artefacts[3];
	private int potion; //Potion[] inventaire_potion = new Potion[5];
	private boolean porter = false;
	
	public Hero(int exp, int x, int y, int attaque, int defense, int pv) {
		super(x, y, attaque, defense, pv);
		this.exp = exp; 
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void deplacer() {
		switch (deplacement) {
		case "haut":
			this.setY(this.getY() - 1); break;
		case "bas":
			this.setY(this.getY() + 1); break;
		case "droite":
			this.setX(this.getX() + 1); break;
		case "gauche":
			this.setX(this.getX() - 1); break;					
		}
    }

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getArme() {
		return arme;
	}

	public void setArme(int arme) {
		this.arme = arme;
	}
	
	public int getArtefacts() {
		return artefacts;
	}

	public void setArtefacts(int artefacts) {
		this.artefacts = artefacts;
	}

	public int getPotion() {
		return potion;
	}

	public void setPotion(int potion) {
		this.potion = potion;
	}
	
	public boolean getEst_porter() {
		return this.porter;
	}

	public void setEst_porter(boolean porter){
		this.porter = porter;
	}

	public void demander_nom(){
		String name;
        Scanner in = new Scanner(System.in);
		System.out.println("Tu dois donner un nom à ton héros : ");
        name = in.next();
        in.close();
		this.setNom(name);
		System.out.println("Votre nom est : " + this.getNom() + "\n");
	}
}
