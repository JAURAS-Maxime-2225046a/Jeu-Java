public class Position {
    int x;
    int y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String versChaine() {
        return "(" + getX() + "," + getY() + ")";
    }

    public void deplacer(int deplacement) {
		switch (deplacement) {
		case 1 :
			setY(getY()-1); 
			break;
		case 2 :
			setY(getY()+1); 
			break;	
		case 3 :
			setX(getX()+1);
		 	break;
		case 4 :
			setX(getX()-1); 
			break;					
		}
    }

    public Position copy() {
        return new Position(x,y);
    }

    public boolean identique(Position position){
        return position.x == x && position.y == y; 
    }
}
