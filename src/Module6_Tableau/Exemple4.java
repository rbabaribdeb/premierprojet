package Module6_Tableau;

public class Exemple4 {
    public static void main(String[] args) {
        // déclaration initialisation du tableau
        int [] tab1 = {1,2,3,4,5,6,7,8,9};
        int [] tab2 = {1,2,3,4,5,6,7,8,9};
        // déclaration du tableau somme
        int [] tabSomme = new int[tab1.length];
        for (int i = 0; i < tabSomme.length; i++) {
            tabSomme[i] = tab1[i] + tab2[i];
        }
    }
}
