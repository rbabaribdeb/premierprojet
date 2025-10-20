package Revision;

import java.util.Scanner;

public class Exercice_9_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double somme = 0;
        int entier = 0;
        int i = 0;
        System.out.print(" svp saisissez un entier : ");
        entier = sc.nextInt();

        somme = somme + entier;

        while (entier != 0) {
            System.out.print(" svp saisissez un entier : ");
            entier = sc.nextInt();
            if (entier >= 0) {
                somme = somme + entier;
                i = i +1;
            }
        }
        System.out.println("La somme est : " + somme);
        System.out.println("La moy est : " + somme/i);


    }


}
