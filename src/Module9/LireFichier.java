package Module9;
import java.io.*;

public class LireFichier {
    public static void main(String[] args) throws IOException {
        // ouvrir un fichier en lecture
        BufferedReader lire = new BufferedReader(new FileReader("Test.txt"));
        //
        String ligne= "";
        while(ligne != null)
        {
            ligne = lire.readLine();
            System.out.println(ligne);
        }
        lire.close(); // fermeture du fichier

    }
}
