import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige el área que desea calcular:");
        System.out.print("1.Cuadrado 2.Círculo -> ");

        int n = sc.nextInt();

        if (n == 1)
        {
            System.out.print("lado del cuadrado (cms) ->");
            int lado = sc.nextInt();
            System.out.println("El área del cuadrado es de " + lado * lado + " cms");
        }
        else if (n == 2)
        {
            System.out.print("Radio del círculo (cms) ->");
            int radio = sc.nextInt();
            System.out.println("El área del círculo es de " + Math.PI * Math.pow(radio, 2) + " cms");
        }
        else
        {
            System.out.println("Argumento no válido.");
        }

        sc.close();
    }
}
