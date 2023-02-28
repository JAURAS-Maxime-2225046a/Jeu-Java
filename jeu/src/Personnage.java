public class Personnage {
	private String nom;	
	private int x;
	private int y;
	private int attaque;
	private int defense;
	private int pv;
	private int velocite;

	public Personnage(String nom, int x, int y, int attaque, int defense, int pv, int velocite) {
		this.nom = nom;
		this.x = x;
		this.y = y;
		this.attaque = attaque;
		this.defense = defense;
		this.pv = pv;
		this.velocite = velocite;
	}

	public int getAttaque() {
		return attaque;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
		if(this.attaque < 0){
			this.attaque = 0; // L'attaque ne peut pas être plus petite que 0 !
		}
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
		if(this.pv < 0){
			this.pv = 0; // La vie ne peut pas être plus petite que 0 !
		}
	}

	public int getVelocite() {
		return velocite;
	}

	public void setVelocite(int velocite) {
		this.velocite = velocite;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
