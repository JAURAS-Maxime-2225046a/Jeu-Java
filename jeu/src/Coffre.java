public class Coffre {
    private boolean etat;
    private Position position;

    public Coffre(Position position, boolean etat) {
        this.position = position;
        this.etat = etat;
    }

    public Coffre(int x, int y ){
        this.position = new Position(x, y);
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
	
}
