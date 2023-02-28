public class Arme {
    private Position position;

    public Arme(Position position) {
        this.position = position;
    }

    public Arme(int x, int y){
        this.position = new Position(x, y);
    }   

    public Position getPosition() {
        return position;
    }

}
