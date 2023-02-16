public class Map {

    private int row;
    private int column;
    private int[][] mur;
    private int posX;
    private int posY;

    public Map(int row, int column, int[][] mur){
        this.row = row;
        this.column = column;
        this.mur = mur;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    
    public int[][] getMur() {
        return mur;
    }

    public void setMur(int[][] mur) {
        this.mur = mur;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void afficheMap(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (this.estMur(i, j)) {
                    System.out.print("X\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
    }

    private boolean estMur(int indexRow, int indexColumn){
        for(int i = 0; i < mur.length; i++){
            if(indexRow == mur[i][0] && indexColumn == mur[i][1]){
                return true;
            }
        }

        return false;
    }
    
}
