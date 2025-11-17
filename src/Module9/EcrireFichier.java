package Module9;

import java.io.*;

public class EcrireFichier {
    public static void main(String[] args) throws FileNotFoundException {
        // Ouvrir un fichier en écriture et l'écraser si il existe :
        PrintWriter ecrire = new PrintWriter(new FileOutputStream("./src/Test.txt"));
        ecrire.println("Ecriture V2... ");
        ecrire.println("Une deuxieme ligne");
        ecrire.println(123546);
        // Fermerture
        ecrire.close();


    }
}
