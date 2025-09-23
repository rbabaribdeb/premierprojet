package ZAide_Tp;

import java.util.Scanner;

public class Exemple_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu =
                "******************************************\n" +
                        "*         Bienvenue au complexe Sportif    BDEB           *\n" +
                        "*                Catégorie des abonnements:                     *\n" +
                        "*  ----------------------------                                        *                            \n" +
                        "*    F       Forfait  (Nombre d'activités illimité)          *                            \n" +
                        "*    A      Activités     (Nombre limité)                        *\n" +
                        "******************************************\n" +
                        "Choisissez le type d'abonnement :  \n";

        System.out.print(menu);

        String choix = sc.nextLine();
        char choix_c = choix.charAt(0);
        switch (choix_c) {
            case 'F', 'f':
                System.out.println("F");
                break;
            case 'A', 'a':
                System.out.println("A");
                break;
            default:
                System.out.println("Choix non reconnu :)");

        }


    }
}
