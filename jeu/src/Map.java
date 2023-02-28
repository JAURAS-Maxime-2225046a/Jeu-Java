public class Map {

    private int row;
    private int column;
    private Mur[] murs;
    private Monstres[] monstres;
    private Hero hero;
    private Boss boss;
    private Coffre[] coffres;

    public Map(int row, int column, Mur []murs, Hero hero, Boss boss, Monstres[] monstres, Coffre[] coffres){
        this.row = row;
        this.column = column;
        this.murs = murs;
        this.hero = hero;
        this.boss = boss;
        this.monstres = monstres;
        this.coffres = coffres;
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
    
    public Mur[] getMur() {
        return murs;
    }

    public Monstres[] getMonstres() {
        return monstres;
    }

    public void setMonstres(Monstres[] monstres) {
        this.monstres = monstres;
    }

    public Coffre[] getCoffres() {
        return coffres;
    }

    public void setCoffres(Coffre[] coffres) {
        this.coffres = coffres;
    }

    public void afficheMap(){
        for (int i = 0; i < row; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < column; j++) {
                Position position = new Position(i,j);
                if (this.estMur(position)) {
                    System.out.print("X\t");
                } 
                else if (this.estHero(position)){
                    System.out.print("H\t");
                }
                else if (this.estBoss(position)){
                    System.out.print("B\t");
                }
                else if (this.estMonstre(position)){
                    System.out.print("M\t");
                }
                else if (this.estCoffre(position)){
                    System.out.print("C\t");
                }
                else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
    }


    public boolean estMur(Position position){
        for(Mur mur : murs)
         if(position.identique(mur.getPosition()))
            return true;
        return false;

      /* * for(int i = 0; i < murs.length; i++)
            if(position.identique(murs[i].getPosition()))
                return true;
        return false; */
    }

    public boolean estHero(Position position){
        return position.identique(hero.getPosition());
    }

    public boolean estBoss(Position position){
        return position.identique(boss.getPosition());
    }

    public boolean estMonstre(Position position){
        for(Monstres monstre : monstres)
         if(position.identique(monstre.getPosition()))
            return true;
        return false;
    }
    
    public boolean estCoffre(Position position){
        for(Coffre coffre : coffres)
         if(position.identique(coffre.getPosition()))
            return true;
        return false;
    }
}
