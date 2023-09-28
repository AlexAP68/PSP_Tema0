import java.util.Scanner;

public class Main
{
    String header;
    String[] options;




    public Main(String header, String ... options)
    {
        this.header = header;
        this.options = options;
    }

    public void show()
    {
        System.out.println("=".repeat(18));
        System.out.println(header);
        System.out.println("=".repeat(18));
        int counter = 0;
        for (String option : options)
            System.out.println(++counter + " -> " + option);
        System.out.println("=".repeat(18));
        System.out.println("0 -> Exit");
        System.out.println("=".repeat(18));
    }

    public String getOption()
    {
        Scanner get = new Scanner(System.in);



        show();



        return get.nextLine();

    }



    public static void main(String[] args)
    {
        Main menu = new Main("Menu", "Ejercicio1", "Ejercicio2", "Ejercicio3", "Ejercicio4","Ejercicio5");

        String answer = "-1";

        while (!answer.equals("0"))
        {
            answer = menu.getOption();

            switch (answer)
            {
                case "1" ->{
                    System.out.println("Ejercicio1");
                    Ejercicio1_AP programa = new Ejercicio1_AP();
                }

                case "2" ->{
                    System.out.println("Ejercicio2");
                    Ejercicio2_AP programa2 = new Ejercicio2_AP();
                }
                case "3" ->{
                    System.out.println("Ejercicio3");
                    Ejercicio3_AP programa3 = new Ejercicio3_AP();

                }
                case "4" -> {
                    System.out.println("Ejercicio4");
                    Ejercicio4_AP programa4 = new Ejercicio4_AP();
                }
                case "5" -> {
                    System.out.println("Ejercicio5");
                    Ejercicio5_AP programa5 = new Ejercicio5_AP();
                }
                case "0" -> {
                    System.out.println("Tschuss");
                }
                default -> System.out.println("Numero Introducido incorrecto");
            }
        }
    }


    public void doNothing() {}


}