import java.util.Scanner;

public class Conversation {

    private boolean choixPret = false;

    public Conversation(boolean choixPret){
        this.choixPret = choixPret;
    }
    public boolean isChoixPret() {
        return choixPret;
    }
    public void setChoixPret(boolean choixPret) {
        this.choixPret = choixPret;
    }

    public void start(Scanner in, Hero hero1){ 
        while (!choixPret){
            boolean validInput;
            do {
                System.out.println("\n=================================================================\n"+ 
                "| Bienvenue dans ce jeu de rôle textuel ! Es-tu prêts à jouer ? |\n"+ 
                "| 1 : Oui                                                       |\n"+ 
                "| 2 : Non                                                       |\n"+ 
                "=================================================================\n");
                int ready = in.nextInt();
                validInput = true;
                switch (ready){
                    case 1 :
                        choixPret = true; 
                        System.out.println("-----------------------------------------------------------------\n"+
                            "Tu as réalisé le bon choix !\n"+
                            "Donnes un nom à ton héro.\n"+
                            "-----------------------------------------------------------------\n");
                        String name = in.next();
                        hero1.setNom(name);
                        System.out.println("-----------------------------------------------------------------\n"+
                            "Jolie nom "+ hero1.getNom() + " ! Maintenant laisse moi t'expliquer les règles : \n"+
                            "Tu vas devoir traverser un donjon afin d'éliminer le boss final\n" +
                            "Mais atention à ne pas épuiser ta réserve de vie !\n" +
                            "Pour cela, tu vas avoir différents objet sur la carte afin de t'aider à  réaliser ta quête\n" +
                            "Maintenant il est temps que tu découvres par toi même, bonne chance à toi "+ hero1.getNom() +" !\n"+
                            "-----------------------------------------------------------------\n"); 
                    break;

                    case 2 :
                        System.out.println("-----------------------------------------------------------------\n"+
                        "Dommage tu passes à côté de quelque chose :( !\n"+
                        "Tu es sûr de ne pas vouloir jouer ?\n"+
                        "-----------------------------------------------------------------\n");
                        choixPret = false;                    
                    break;

                    default:   
                        System.out.println("\nMauvaise entrée.\nRéessaies, tu peux y arriver ;)");
                        validInput = false; 
                }
            } while (!validInput);
        }
    }

    public void lancementCombat(Scanner in,Hero hero1, Personnage p1, Combat combat1){
        System.out.println("\n====================Un combat va se lancer !=====================\n");
        combat1.combat(in,hero1,p1);
    }

    public void deplacement_hero(Scanner in, Hero hero1, Map map1, Monstres[] monstres, Combat combat1, Boss boss, Coffre[] coffres, Potion[] potions){  
        //System.out.println("Monstre position 0 : " + monstres[0] + "\n"); 
        boolean choixDeplacement = true;
        while(choixDeplacement){
            boolean validInput;
            do{
                System.out.println("\nTu es à la position : " + hero1.getPosition().versChaine());
                System.out.println("\nChoisissez un déplacement !\n"+ 
                    "1: A Gauche\n"+ 
                    "2: A Droite\n"+ 
                    "3: En Bas\n"+ 
                    "4: En Haut\n"
                );
                int deplacement = in.nextInt();
                Position nouvellePosition = hero1.getPosition().copy();
                nouvellePosition.deplacer(deplacement);
                validInput = true;
                        System.out.println("\n" + hero1.getNom() + ", votre deplacement est : " + deplacement + "\n");
                        if(map1.estMur(nouvellePosition)){
                            System.out.println("\nIl y a un mur dans votre direction !\nChoissisez un autre déplacement");
                            map1.afficheMap();
                        }
                        else {
                            hero1.deplacer(deplacement);
                            map1.afficheMap();
                            if(map1.estMonstre(hero1.getPosition())){ 
                                if(hero1.getPosition().identique(monstres[0].getPosition())){
                                    lancementCombat(in,hero1, monstres[0],combat1);
                                    if(hero1.getPv() == 0){
                                        choixDeplacement = false;
                                    }
                                    map1.afficheMap();
                                }
                                else {
                                    lancementCombat(in, hero1, monstres[1],combat1);
                                    if(hero1.getPv() == 0){
                                        choixDeplacement = false;
                                    }
                                    map1.afficheMap();
                                }
                            }
                            else if (map1.estCoffre(hero1.getPosition())){
                                for (int i = 0; i < coffres.length; i++){
                                    if(hero1.getPosition().identique(coffres[i].getPosition()) && coffres[i].isEtat() == false){
                                        System.out.println("\n==================================\n"+ 
                                        "| Voulez vous ouvrir le coffre ? |\n"+ 
                                        "| 1 : Oui                        |\n"+ 
                                        "| 2 : Non                        |\n"+ 
                                        "==================================\n");
                                        int ouvertureCoffre = in.nextInt();
                                        switch(ouvertureCoffre){
                                            case 1 :
                                                    coffres[i].setEtat(true);
                                                    coffres[i].etatCoffre(coffres[0].isEtat());
                                                    if(map1.estCoffre(potions[0].getPosition())){
                                                        System.out.println("\n=====================================\n"+ 
                                                        "| Vous venez de ramasser une potion |\n"+ 
                                                        "=====================================\n");
                                                        hero1.getPotion().add(potions[0]);
                                                    }
                                                    choixDeplacement = true;
                                                    map1.afficheMap();
                                            break;
    
                                            case 2 :
                                                    coffres[i].etatCoffre(coffres[i].isEtat());
                                                    choixDeplacement = true;
                                                    map1.afficheMap();
                                            break;
    
                                            default:   
                                                System.out.println("\nMauvaise entrée.\nRéessaies, tu peux y arriver ;)");
                                                choixDeplacement = true;
                                                map1.afficheMap();
                                        }
                                    }
                                }
                            }
                            else if(map1.estBoss(hero1.getPosition())){
                                choixDeplacement = false;
                                lancementCombat(in,hero1,boss,combat1);
                            }
                            else {
                                choixDeplacement = true;
                            }
                }
            } while(!validInput);
        }
        System.out.println("\n=============================================================\n"+ 
                "| Merci d'avoir joué ! N'hésite pas à refaire une partie ;) |\n"+ 
                "=============================================================\n");
    }
}
