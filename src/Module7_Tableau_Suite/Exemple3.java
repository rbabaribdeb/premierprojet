package Module7_Tableau_Suite;

public class Exemple3 {
    public static void main(String[] args) {
        int [] tab = {1,2,3,44,-12,-99,14,23,0,-1,111};
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if(tab[i] < min) {
                min = tab[i];}
        }
        System.out.println("min = " + min);
    }
}
