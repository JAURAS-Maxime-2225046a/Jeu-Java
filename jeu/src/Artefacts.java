public class Artefacts {
    private Position position;
    private String nom;

    public Artefacts(Position position) {
        this.position = position;
    }

    public Artefacts(int x, int y, String nom){
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
