import java.util.Scanner;

public class AreaStrategyTest
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
            AreaStrategy estrategia = new SquareAreaStrategy(lado);
            ContextAreaStrategy contexto = new ContextAreaStrategy(estrategia);
            System.out.println("El área del cuadrado es de " + contexto.calcularArea() + " cms");
        }
        else if (n == 2)
        {
            System.out.print("Radio del círculo (cms) ->");
            int radio = sc.nextInt();
            AreaStrategy estrategia = new CircleAreaStrategy(radio);
            ContextAreaStrategy contexto = new ContextAreaStrategy(estrategia);
            System.out.println("El área del círculo es de " + contexto.calcularArea() + " cms");
        }
        else
        {
            System.out.println("Argumento no válido.");
        }

        sc.close();
    }
}
