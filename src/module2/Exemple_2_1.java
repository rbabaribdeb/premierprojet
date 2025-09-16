package module2;

import java.util.Scanner;

public class Exemple_2_1 {
    public static void main(String[] args) {
        int valeur = 1;
      switch (valeur) {
          case 1:
              // code à executer si la valeur est egale à 1
              System.out.println("valeur ==1");
              // arreter l'execution du switch
              break;

          case 2:
              // code à executer si la valeur est egale à 2
              System.out.println("valeur ==2");
              // arreter l'execution du switch
              break;

          default:
              // code à executer si aucune des valeurs ne correspond
              System.out.println("aucune valeur ne correspond");
                break;
      }
    }


}
