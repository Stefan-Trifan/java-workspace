public class Ejercicio3
{
    public static void main(String[] args)
    {
        System.out.println("a + b = " + Operacion.sumar(3, 4));
        System.out.println("a - b = " + Operacion.restar(3, 4));
    }

    public static class Operacion
    {
        // _________________________________________
        // Métodos Públicos
        public static double sumar(double a, double b)
        {
            return a + b;
        }

        public static double restar(double a, double b)
        {
            return a - b;
        }
    }
}
