public class Combat {
    public void combat(Hero hero1, Personnage p1){
        System.out.println("Début du combat...");

        int heroAttaque = hero1.getAttaque();
        int heroPv = hero1.getPv();
        hero1.setAttaque(hero1.getAttaque()-p1.getDefense());
        p1.setAttaque(p1.getAttaque()-hero1.getDefense());
        System.out.println("\nCaractéristique de : " + p1.getNom() + "\n\n" + p1.toString());
        System.out.println("\n" + hero1.getNom() + ", voici vos caractéristiques :\n\n" + hero1.toString());

        while(p1.getPv() > 0 && hero1.getPv() > 0){
            if(hero1.getVelocite() > p1.getVelocite()){
                System.out.println("\nVous lancez une attaque :");
                p1.setPv(p1.getPv() - hero1.getAttaque());
                System.out.println("\nCaractéristique de : " + p1.getNom() + "\n" + p1.toString());
                if(p1.getPv() <= 0){
                    System.out.println("\n" + hero1.getNom() + ", vous avez gagné le combat !\n");
                    hero1.setAttaque(heroAttaque);
                    System.out.println(hero1.getNom() + ", votre expérience de combat augmente avec vos attributs !\n");
                    hero1.ameliorationAttribut(hero1.getExp(), hero1.getAttaque(), hero1.getDefense(), heroPv, hero1.getVelocite());
                    System.out.println(hero1.getNom() + ", voici vos nouvelles capacités :\n\n" + hero1.toString() + "\n");
                }
                else {
                    System.out.println("\nVous êtes attaqués :");
                    hero1.setPv(hero1.getPv() - p1.getAttaque());
                    System.out.println("\n" + hero1.getNom() + ", voici vos caractéristiques :\n" + hero1.toString());
                    if(hero1.getPv() <= 0){
                        System.out.println("\n" + hero1.getNom() + ", vous avez perdu le combat !\n");
                    }
                }
            }
            
            else {
                System.out.println("\nVous êtes attaqués :");
                hero1.setPv(hero1.getPv() - p1.getAttaque());
                System.out.println("\n" + hero1.getNom() + ", voici vos caractéristiques :\n" + hero1.toString());
                if(hero1.getPv() <= 0){
                    System.out.println("\n" + hero1.getNom() + ", vous avez perdu le combat !\n");
                }
                else {
                    System.out.println("\nVous lancez une attaque :");
                    p1.setPv(p1.getPv() - hero1.getAttaque());
                    System.out.println("\nCaractéristique de : " + p1.getNom() + "\n" + p1.toString());
                    if(p1.getPv() <= 0){
                        System.out.println("\n" + hero1.getNom() + ", vous avez gagné le combat !\n");
                    }
                }
            }
        }

    }
}
