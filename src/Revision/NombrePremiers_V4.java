package Revision;

public class NombrePremiers_V4 {
    public static void main(String[] args) {
        for (int nombre = 2; nombre < 200; nombre++) {

            boolean estPremier = true; // suppose que le nombre est premier
            int i = 2;
            while(estPremier && i<nombre)
            {
                if (nombre % i == 0) {
                    //   System.out.println(i + " est diviseur");
                    estPremier = false; // sortie de la boucle
                }
                i++;
            }
            if (estPremier)
            {
                System.out.println(nombre + " estPremier " + estPremier);
            }
        }
    }
}
