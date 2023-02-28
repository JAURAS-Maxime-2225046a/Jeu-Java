public class Potion {
    private Position position;
    private String nom;

    public Potion(Position position) {
        this.position = position;
    }

    public Potion(int x, int y){
        this.position = new Position(x, y);
    }   

    public Position getPosition() {
        return position;
    }

    public void pouvoirPotion(Hero hero){
        hero.setPv(hero.getPv()+35);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
