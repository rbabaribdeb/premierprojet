package Module9;

import java.io.*;

// Fucionner deux fichiers
public class FusionFichier {
    public static void main(String[] args) throws IOException {
        // Chemin des fichiers
        String f1 = "fichier1.txt";
        String f2 = "fichier2.txt";
        String ff = "fichier_fusion.txt";
        // Appel de la méthode
        fusionner_fichiers(f1,f2,ff);
    }
    private static void fusionner_fichiers(String f1, String f2, String ff) throws IOException {
    // Lire depuis fichier
    BufferedReader reader1 = new BufferedReader(new FileReader(f1));
    BufferedReader reader2 = new BufferedReader(new FileReader(f2));
    // Ecrire dans le ficier ff
    BufferedWriter writer1 = new BufferedWriter(new FileWriter(ff));
    //
        String ligne;
        while((ligne = reader1.readLine()) != null)
        {
            writer1.write(ligne);
            writer1.newLine();
        }
        while((ligne = reader2.readLine()) != null)
        {
            writer1.write(ligne);
            writer1.newLine();
        }
    // Fermeture des Flux
        reader1.close();
        reader2.close();
        writer1.close();

    }
}
