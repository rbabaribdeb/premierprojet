package Revision;

import java.util.Scanner;

/**
 * Calculer le max est le min
 *
 *
 */
public class Exercice_7_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entier = 0;
        int i = 0;
        System.out.print(" svp saisissez un entier : ");
        entier = sc.nextInt();
        int max = entier;
        int min = entier;
        while (entier != 0) {
            System.out.print(" svp saisissez un entier : ");
            entier = sc.nextInt();
            if (entier > max)
            {
                max = entier;
            }
            if(entier < min)
            {
                min =entier;
            }
        }
        System.out.println("Le max : " + max);
        System.out.println("Le min : " + min);
    }


}
