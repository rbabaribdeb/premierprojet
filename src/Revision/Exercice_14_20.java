package Revision;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Calculer la solution d'une equation de 2nd degres
 *     a.x2 + b.x + c = 0
 *
 */
public class Exercice_14_20 {
    public static void main(String[] args) {
        //---------
        Double a,b,c;
        Double delta, x1, x2;
        //---------
        System.out.println("===== a.x2 + b.x + c = 0 =====");
        Scanner sc = new Scanner(System.in);
        System.out.print(" svp saisissez a : ");
        a = sc.nextDouble();
        System.out.print(" svp saisissez b : ");
        b = sc.nextDouble();
        System.out.print(" svp saisissez c : ");
        c = sc.nextDouble();
        System.out.println("===== "+a+".x2 + "+b+".x + "+c+" = 0 =====");
        delta = (b*b) - (4 * a *c) ;
        if (delta == 0) {
            x1 = (- b + Math.sqrt(delta) )/ 2*a;
            System.out.println("delta = 0 et x = " + x1);
        }else if (delta > 0) {
            x1 = (- b + Math.sqrt(delta) )/ 2*a;
            x2 = (- b - Math.sqrt(delta) )/ 2*a;
            System.out.println("delta > 0 et x1 = " + x1);
            System.out.println("delta > 0 et x2 = " + x2);
        }else {
            // cas delta negatif
            System.out.println("Pas de sollution dans R");
        }
    }
}
