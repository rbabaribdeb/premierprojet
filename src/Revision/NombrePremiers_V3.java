package Revision;

public class NombrePremiers_V3 {
    public static void main(String[] args) {
        for (int nombre = 2; nombre < 100; nombre++) {

            boolean estPremier = true; // suppose que le nombre est premier
            // si je trouve un diviseur
            // est premier
            for (int i = 2; i < nombre; i++) {

                if (nombre % i == 0) {
                 //   System.out.println(i + " est diviseur");
                    estPremier = false;
                }
            }
            if (estPremier)
            {
                System.out.println(nombre + " estPremier " + estPremier);
            }
        }
    }
}
