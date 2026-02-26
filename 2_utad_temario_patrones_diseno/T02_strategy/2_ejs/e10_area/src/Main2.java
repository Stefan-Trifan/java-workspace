import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Scanner sc = new Scanner(System.in);
        Strategy miStrategy;
        Context miContext;

        System.out.println("Elige el área que desea calcular:");
        System.out.print("1.Cuadrado 2.Círculo -> ");

        int n = sc.nextInt();

        if (n == 1)
        {
            System.out.print("lado del cuadrado (cms) ->");
            int lado = sc.nextInt();

            miStrategy = new SquareAreaStrategy();
            miContext = new Context(miStrategy);

            System.out.println("El área del cuadrado es de " + miContext.calcularArea(lado) + " cms");
        }
        else if (n == 2)
        {
            System.out.print("Radio del círculo (cms) ->");
            int radio = sc.nextInt();

            miStrategy = new CircleAreaStrategy();
            miContext = new Context(miStrategy);

            System.out.println("El área del círculo es de " + miContext.calcularArea(radio) + " cms");
        }
        else
        {
            System.out.println("Argumento no válido.");
        }

        sc.close();

        System.out.println("\n_______________________END\n");
    }
}
