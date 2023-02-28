public class Coffre {
    private boolean etat = false;
    private Position position;

    public Coffre(Position position) {
        this.position = position;
    }

    public Coffre(int x, int y, boolean etat){
        this.position = new Position(x, y);
        this.etat = etat;
    }   

    public Position getPosition() {
        return position;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public void etatCoffre(boolean etat){
        if(etat){
            System.out.println("\nLe coffre est ouvert !");
        }
        else {
            System.out.println("\nLe coffre est fermé !\n");
        }
    }
	
}
