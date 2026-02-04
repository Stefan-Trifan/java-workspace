public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("\n_______________________START\n");

        // Polimorfismo por herencia
        Animal miAnimal = new Animal();
        miAnimal.sound();

        Dog miDog = new Dog();
        miDog.sound();

        // Polimorfismo por sobrecarga
        Calculator miCalculator = new Calculator();
        System.out.println(miCalculator.sum(2.2, 3));


        System.out.println("\n_______________________END\n");
    }

    public static class Animal
    {
        // Metodo
        public void sound()
        {
            System.out.println("Algun sonido");
        }
    }

    public static class Dog extends Animal
    {
        // Metodo
        @Override
        public void sound()
        {
            System.out.println("Guau");
        }
    }

    public static class Calculator
    {
        public int sum(int a, int b)
        {
            return a + b;
        }

        public int sum(int a, int b, int c)
        {
            return a + b + c;
        }

        public double sum(double a, double b)
        {
            return a + b;
        }
    }
}
