public class Arme {
    private Position position;
    private String nom;

    public Arme(Position position) {
        this.position = position;
    }

    public Arme(int x, int y, String nom){
        this.position = new Position(x, y);
        this.nom = nom;
    }   

    public Position getPosition() {
        return position;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
