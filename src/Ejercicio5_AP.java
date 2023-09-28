import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5_AP {

    // Metodo para leer y mostrar el contenido
    public  void llegir(String nomFitxer) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nomFitxer));
            String linia;

            while ((linia = reader.readLine()) != null) {
                System.out.println(linia);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("S'ha produït un error en llegir el fitxer.");
        }
    }

    // Metodo paara escribir en el archivo
    public  void escriure(String nomFitxer, String text) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(nomFitxer, true)); // El argumento "true" indica que añadiremos al final del texto
            writer.write(text);
            writer.newLine(); // Añadir un salto de linea despues del texto

            writer.close();
            System.out.println("Text escrit al fitxer amb exit.");
        } catch (IOException e) {
            System.out.println("S'ha produït un error en escriure al fitxer.");
        }
    }

    public  Ejercicio5_AP() {
        // Nombre del archivo
        String nomFitxerLectura = "Archivo.txt";

        // LLama al metodo "llegir"
        llegir(nomFitxerLectura);

        // Pide al usuario introducir el texto
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introdueix el text per escriure al fitxer: ");
            String textescriure = inputReader.readLine();

            // Nombre del archivo donde quieres escribir
            String nomFitxerEscriptura = "Archivo.txt";

            // Llama al metodo "escriure"
            escriure(nomFitxerEscriptura, textescriure);
        } catch (IOException e) {
            System.out.println("S'ha produït un error en llegir l'entrada de l'usuari.");
        }
    }
}

