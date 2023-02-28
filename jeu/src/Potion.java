public class Potion {
    private Position position;

    public Potion(Position position) {
        this.position = position;
    }

    public Potion(int x, int y){
        this.position = new Position(x, y);
    }   

    public Position getPosition() {
        return position;
    }

}
