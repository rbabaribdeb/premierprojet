package module2;

import java.util.Scanner;

public class Exemple_4 {
    public static void main(String[] args) {
        //psvm
        int x;
        Scanner clavier = new Scanner(System.in);

        System.out.println("veuillez saisir une valeur pour x : ");
        x = clavier.nextInt();

        System.out.println("x^2 = " + Math.pow(x,2));
        System.out.println("racine (x ) = " + Math.sqrt(x));
        System.out.println("Voila un chiffre aléatoire = " + 100 * Math.random());


    }


}
