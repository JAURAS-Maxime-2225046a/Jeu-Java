public class Personnage {	
	private int x;
	private int y;
	private int attaque;
	private int defense;
	private int pv;

	public Personnage(int x, int y, int attaque, int defense, int pv) {
		this.x = x;
		this.y = y;
		this.attaque = attaque;
		this.defense = defense;
		this.pv = pv;
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

	public int getAttaque() {
		return attaque;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
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
	}
}
