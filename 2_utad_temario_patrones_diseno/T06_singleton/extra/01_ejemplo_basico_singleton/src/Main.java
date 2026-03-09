public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        // Pedimos la instancia del Singleton
        Counter c1 = Counter.getInstance();

        // Volvemos a pedir la instancia
        Counter c2 = Counter.getInstance();

        // Aunque parezcan dos variables distintas,
        // ambas apuntan al mismo objeto
        c1.increment();
        c2.increment();

        // El resultado será 2 porque es el mismo contador
        System.out.println("Valor del contador: " + c1.getValue());

        System.out.println("\n_______________________END\n");
    }
}