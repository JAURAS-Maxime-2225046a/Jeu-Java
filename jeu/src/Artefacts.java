public class Artefacts {
    private Position position;

    public Artefacts(Position position) {
        this.position = position;
    }

    public Artefacts(int x, int y){
        this.position = new Position(x, y);
    }   

    public Position getPosition() {
        return position;
    }

}
