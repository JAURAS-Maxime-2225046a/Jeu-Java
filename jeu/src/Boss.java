public class Boss extends Personnage {
	private Position position;

	public Boss(String nom, int x, int y, int attaque, int defense, int pv, int velocite) {
		super(nom, x, y, attaque, defense, pv, velocite);
		this.position = new Position(x,y);
	}
    public String toString(){
		return "Vie du perso = " + getPv() + "\nAttaque = " + getAttaque() + "\nDéfense = " + getDefense();
	}

	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
}
