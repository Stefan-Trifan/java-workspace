public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Calculadora calc = new Calculadora(new Suma());
        System.out.println(calc.calcular(5, 3)); // 8

        calc.setOperacion(new Resta());
        System.out.println(calc.calcular(5, 3)); // 2

        calc.setOperacion(new Multiplicacion());
        System.out.println(calc.calcular(5, 3)); // 15
            
        System.out.println("\n_______________________END\n");
    }
}