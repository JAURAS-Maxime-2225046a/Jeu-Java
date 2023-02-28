//import java.util.Scanner;

public class Hero extends Personnage {
	private int exp;
	private Position position;
	/*
	private int arme; //Arme[] inventaire_arme = new Arme[2];
	private int artefacts; //Artefacts[] inventaire_artefacts = new Artefacts[3];
	private int potion; //Potion[] inventaire_potion = new Potion[5];
	private boolean porter = false;
	*/

	public Hero(String nom, int exp, int x, int y, int attaque, int defense, int pv, int velocite) {
		super(nom, x, y, attaque, defense, pv, velocite);
		this.exp = exp;
		this.position = new Position(x,y);
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void ameliorationAttribut(int exp, int attaque, int defense, int pv, int velocite){
			setExp(getExp()+1);
			setAttaque(getAttaque()+5);
			setDefense(getDefense()+5);
			setPv(getPv()+5);
			setVelocite(getVelocite()+1);
	}

	/* 
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
	*/

	public void deplacer(int deplacement) {
		switch (deplacement) {
		case 1 :
			getPosition().setY(getPosition().getY()-1); 
			break;
		case 2 :
			getPosition().setY(getPosition().getY()+1); 
			break;	
		case 3 :
			getPosition().setX(getPosition().getX()+1);
		 	break;
		case 4 :
			getPosition().setX(getPosition().getX()-1); 
			break;					
		}
    }

	public String toString(){
		return "Vie du perso = " + getPv() + "\nexp = " + exp + "\nAttaque = " + getAttaque() + "\nDéfense = " + getDefense();
	}
}
