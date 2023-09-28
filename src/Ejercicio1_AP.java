import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1_AP {
    public Ejercicio1_AP() {
        int Numero1 = 0;
        int Numero2 = 0;
        int Resultado;

        Scanner Leer = new Scanner(System.in);

        // Lee el primer número
        boolean numero1Valido = false;
        while (!numero1Valido) {
            try {
                System.out.println("Introduce el primer numero:");
                Numero1 = Leer.nextInt();
                numero1Valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Introduce un número entero válido.");
                Leer.nextLine(); // Limpia el búfer del scanner para evitar un bucle infinito
            }
        }

        // Lee el segundo número
        boolean numero2Valido = false;
        while (!numero2Valido) {
            try {
                System.out.println("Introduce el segundo numero:");
                Numero2 = Leer.nextInt();
                numero2Valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Introduce un número entero válido.");
                Leer.nextLine(); // Limpia el búfer del scanner para evitar un bucle infinito
            }
        }


        // Realiza las operaciones
        Resultado = Numero1 + Numero2;
        System.out.println("Suma: " + Resultado);

        Resultado = Numero1 - Numero2;
        System.out.println("Resta: " + Resultado);

        Resultado = Numero1 * Numero2;
        System.out.println("Multiplicacion: " + Resultado);

        if (Numero2 != 0) {
            Resultado = Numero1 / Numero2;
            System.out.println("Division: " + Resultado);
        } else {
            System.out.println("No es posible dividir por cero.");
        }


    }


}
