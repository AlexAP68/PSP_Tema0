import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2_AP {

    public Ejercicio2_AP() {

        String Nombre;
        int Numero1 = 0;
        int Numero2 = 0;
        int Numero3 = 0;
        int Resultado;

        Scanner Leer = new Scanner(System.in);

        System.out.println("Introduce el nombre del alumno ");

        Nombre = Leer.next();

        System.out.println("Introduce las notas de " + Nombre);

        // Leer la nota del Primer Trimestre
        boolean nota1Valida = false;
        while (!nota1Valida) {
            try {
                System.out.println("Primer Trimestre:");
                Numero1 = Leer.nextInt();
                nota1Valida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Introduce una nota válida (número entero).");
                Leer.nextLine(); // Limpia el búfer del scanner para evitar un bucle infinito
            }
        }

        // Leer la nota del Segundo Trimestre
        boolean nota2Valida = false;
        while (!nota2Valida) {
            try {
                System.out.println("Segundo Trimestre:");
                Numero2 = Leer.nextInt();
                nota2Valida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Introduce una nota válida (número entero).");
                Leer.nextLine(); // Limpia el búfer del scanner para evitar un bucle infinito
            }
        }

        // Leer la nota del Tercer Trimestre
        boolean nota3Valida = false;
        while (!nota3Valida) {
            try {
                System.out.println("Tercer Trimestre:");
                Numero3 = Leer.nextInt();
                nota3Valida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Introduce una nota válida (número entero).");
                Leer.nextLine(); // Limpia el búfer del scanner para evitar un bucle infinito
            }
        }



        // Calcular la media de las notas
        Resultado = (Numero1 + Numero2 + Numero3) / 3;


        System.out.println("La media de las tres evaluaciones es: " + Resultado);
    }


}
