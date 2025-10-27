package Module6_Tableau;

public class Exemple1 {
    public static void main(String[] args) {

        // declaration d'un tableau de int de 5 elements
        int[] tab = new int[5];
        // int[] tab2 = {1,1,1,1,1};
        // initialisation des élements d'un tableau
        tab[0] = 1;
        tab[1] = 1;
        tab[2] = 1;
        tab[3] = 1;
        tab[4] = 1;
        // accède aux élements d'un tableau dont l'indice est de 2
        // System.out.println("tab[2]" + tab[2]) ;
        // Acceder avec une boucle for
        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab["+ i+"] = " + tab[i]) ;
        }





    }

}
