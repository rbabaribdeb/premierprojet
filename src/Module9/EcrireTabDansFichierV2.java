package Module9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class EcrireTabDansFichierV2 {
    public static void ecriretab(int [] tab, String nom) throws FileNotFoundException {
        PrintWriter ecrire = new PrintWriter(new FileOutputStream(nom));
        // écrire le tab dans un fichier
        for (int i = 0; i < tab.length; i++) {
            ecrire.println(tab[i]);
        }
        ecrire.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        int [] tab = {1,2,4,5,56,78,78};
        ecriretab(tab, "tab.txt");

    }



}
