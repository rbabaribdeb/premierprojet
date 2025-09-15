package module2;

import java.util.Scanner;

public class Exemple_3 {
    public static void main(String[] args) {
    //-DEBUT
       int i = 0;
        // afficher un message
        System.out.println("veuillez saisir un entier : ");
       // créer un objet clavier pour saisir depuis le clavier
        Scanner clavier = new Scanner(System.in);
        // recupere la saisie en int
        i = clavier.nextInt();

        //---
        if (i>=0 && i<=100)
        {
            System.out.println("entier entre 0 et 100");

        }else
        {
            System.out.println("inferieur à 0 ou sup à 100");

        }



        //-FIN
    }
}
