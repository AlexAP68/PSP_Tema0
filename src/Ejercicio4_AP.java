import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4_AP {
    public  Ejercicio4_AP() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int enter;
        float nombreFloat;
        double nombreDouble;

        try {
            // Llegir una cadena (String)
            System.out.print("Introdueix una String: ");
            String cadena = reader.readLine();
            System.out.println("Has introduït: " + cadena);

            // Llegir un enter (int)
            System.out.print("Introdueix un enter: ");
             enter = Integer.parseInt(reader.readLine());
            System.out.println("Has introduït: " + enter);

            // Llegir un nombre amb coma flotant (float)
            System.out.print("Introdueix un nombre amb coma flotant: ");
             nombreFloat = Float.parseFloat(reader.readLine());
            System.out.println("Has introduït: " + nombreFloat);

            // Llegir un nombre decimal (double)
            System.out.print("Introdueix un nombre decimal: ");
             nombreDouble = Double.parseDouble(reader.readLine());
            System.out.println("Has introduït: " + nombreDouble);
        } catch (IOException e) {
            System.out.println("S'ha produït un error d'entrada/sortida.");
        } catch (NumberFormatException e) {
            System.out.println("No s'ha pogut convertir a un nombre vàlid.");
        
        }
    }
}

