public class Mur{
    private Position position;

    public Mur(Position position) {
        this.position = position;
    }

    public Mur(int x, int y ){
        this.position = new Position(x, y);
    }   

    public Position getPosition() {
        return position;
    }
}
