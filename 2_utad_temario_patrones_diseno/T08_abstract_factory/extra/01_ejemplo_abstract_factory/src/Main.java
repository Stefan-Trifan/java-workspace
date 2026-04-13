public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        AnimalFactory factory = new AnimalFactory();

        Animal animal1 = factory.crearAnimal("perro");
        animal1.hacerSonido();

        Animal animal2 = factory.crearAnimal("gato");
        animal2.hacerSonido();

        System.out.println("\n_______________________END\n");
    }
}