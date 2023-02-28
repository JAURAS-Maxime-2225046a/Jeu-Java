import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Mur[] murs = { new Mur(0,0), new Mur(0,1),new Mur(0,2),new Mur(0,3), new Mur(0,4), new Mur(0,5), 
        new Mur(0,6), new Mur(0,7), new Mur(0,8), new Mur(0,9),
        new Mur(1,0), new Mur(2,0), new Mur(3,0), new Mur(4,0), new Mur(5,0), new Mur(6,0),
        new Mur(7,0), new Mur(8,0), new Mur(9,0),
        new Mur(9,1), new Mur(9,2), new Mur(9,3), new Mur(9,4), new Mur(9,5), new Mur(9,6),
        new Mur(9,7), new Mur(9,8), new Mur(9,9),
        new Mur(1,9), new Mur(2,9), new Mur(3,9), new Mur(4,9), new Mur(5,9), new Mur(6,9),
        new Mur(7,9), new Mur(8,9),
        new Mur(5,5), new Mur(5,6), new Mur(4,5), new Mur(4,6), new Mur(1,8), new Mur(2,8), 
        new Mur(7,8), new Mur(8,8), new Mur(2,1), new Mur(2,2), new Mur(2,3), new Mur(3,3)};

    Coffre[] coffres = { new Coffre(1,7), new Coffre(6,1)}; 

    Monstres[] monstres = { new Monstres("Monstre1",1,4,70,50,40,0), 
    new Monstres("Monstre2",3,7,70,50,40,0)};

        Hero hero1 = new Hero ("héro",1,1,1,80,50,60,1);
        Boss boss = new Boss ("BOSS",6,8,85,55,70,2);

        Conversation inout = new Conversation(false);
        Combat combat1 = new Combat();

        Scanner sc1 = new Scanner (System.in);
        inout.start(sc1,hero1);
        if(inout.isChoixPret()){
            Map map1 = new Map (10,10,murs,hero1,boss,monstres,coffres);
            map1.afficheMap();
            inout.deplacement_hero(sc1,hero1,map1,monstres,combat1,boss);
        }
        sc1.close();
    }
}