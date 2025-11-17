package Module9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class EcrireTabDansFichier {
    public static void main(String[] args) throws FileNotFoundException {
        int [] tab = {1,2,4,5,56,78,78};
        // écrire le tab dans un fichier
        PrintWriter ecrire = new PrintWriter(new FileOutputStream("tableau.txt"));
        for (int i = 0; i < tab.length; i++) {
            ecrire.println(tab[i]);
        }
        ecrire.close();
    }
}
