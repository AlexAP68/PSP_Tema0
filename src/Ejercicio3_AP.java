import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Ejercicio3_AP {

    public Ejercicio3_AP() {
        double horesAlDia = 0;
        int diesAlMes = 0;
        double taxaHoraria = 0;
        double souMensual = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            // Pide los datos del usuario (hores)
            while (true) {
                try {
                    System.out.print("Quantes hores fa feina al dia? ");
                    horesAlDia = scanner.nextDouble();
                    break; // Si es un número válido, salimos del bucle
                } catch (InputMismatchException e) {
                    System.out.println("Error: Introduïu un valor numèric vàlid.");
                    scanner.nextLine(); // Limpia el búfer del scanner para evitar un bucle infinito
                }
            }

            // Pide los datos del usuario (dies)
            while (true) {
                try {
                    System.out.print("Quants dies al mes fa feina? ");
                    diesAlMes = scanner.nextInt();
                    break; // Si es un número válido, salimos del bucle
                } catch (InputMismatchException e) {
                    System.out.println("Error: Introduïu un valor numèric vàlid.");
                    scanner.nextLine(); // Limpia el búfer del scanner para evitar un bucle infinito
                }
            }

            //Pide los datos del usuario (taxa)
            while (true) {
                try {
                    System.out.print("Quant cobra per hora? ");
                    taxaHoraria = scanner.nextDouble();
                    break; // Si es un número válido, salimos del bucle
                } catch (InputMismatchException e) {
                    System.out.println("Error: Introduïu un valor numèric vàlid.");
                    scanner.nextLine(); // Limpia el búfer del scanner para evitar un bucle infinito
                }
            }

            // Calcula el sueldo
            souMensual = horesAlDia * diesAlMes * taxaHoraria;

            // Muestra el resultado
            System.out.println("El sou mensual del treballador és: " + souMensual + " euros");
        } catch (NoSuchElementException e) {
            System.out.println("Error: S'ha produït un error d'entrada.");
        } catch (Exception e) {
            System.out.println("Error inesperat: " + e.getMessage());
        }
    }

}
