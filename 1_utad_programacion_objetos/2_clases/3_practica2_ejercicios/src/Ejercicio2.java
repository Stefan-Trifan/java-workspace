// Define una clase Java denominada Circulo que tenga como atributo de clase y constante numeroPi (PI)
// , siendo esta constante de tipo Double y valor 3.1416. 
// Además la clase tendrá el atributo radio (tipo Double) que representa el radio del círculo
// , y los métodos para obtener y establecer los atributos. 
// También debe disponer de un método para calcular el área del círculo 
// (método area que devuelve el área, el área encerrada por un círculo de radio r es π*r2) 
// y la longitud del círculo (método longitud que devuelve la longitud
// , la longitud de una circunferencia es igual a 2π*r). 
// En el método main, declara el código que cree un objeto círculo
// , le pida al usuario el radio y le devuelva el área y la longitud del círculo.

import java.util.Scanner;

public class Ejercicio2
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Scanner sc = new Scanner(System.in);
        Circulo mCirculo = new Circulo();

        System.out.printf("Indica el radio del circulo\n-> ");

        mCirculo.setRadio(Double.parseDouble(sc.nextLine()));

        System.out.println("Tu area es           " + mCirculo.calcArea());
        System.out.println("Tu curcunferencia es " + mCirculo.calcCircunferencia());

        System.out.println("\n_______________________END\n");
    }

    public static class Circulo
    {
        // _________________________________________
        // Atributos 
        private static final Double NUMEROPI = 3.1416;
        private double radio;

        // _________________________________________
        // Constructor Principal 

        // _________________________________________
        // Constructores Auxiliares 

        // _________________________________________
        // Getters
        public double getRadio()
        {
            return this.radio;
        }

        // _________________________________________
        // Setters
        public void setRadio(double radio)
        {
            this.radio = radio;
        }

        // _________________________________________
        // Métodos Públicos
        public double calcArea()
        {
            return NUMEROPI * Math.pow(radio, 2);
        }

        public double calcCircunferencia()
        {
            return NUMEROPI * radio * 2;
        }

        // _________________________________________
        // Métodos Privados
    }
}
