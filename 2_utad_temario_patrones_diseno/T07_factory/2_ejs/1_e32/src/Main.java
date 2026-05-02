public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Integer maxAnimals = 100;
        Animal[] animals = new Animal[maxAnimals];

        AnimalFactory animalFactory = new RandomAnimalFactory();

        for (int i = 0; i < maxAnimals; i++)
        {
            animals[i] = animalFactory.factoryAnimalMethod();
        }

        // todo Impresión del número de Dogs
        // todo y Cats y la proporción de cada uno
        int numDogs = 0;
        int numCats = 0;
        for (Animal c : animals)
        {
            if (c instanceof Cat)
            {
                numCats++;
            }
        }
        System.out.println("Antes");
        System.out.println("Perros = " + numDogs);
        System.out.println("Gatos  = " + numCats);
        System.out.println("Proporcion perros: "
            + (float) numDogs / (numDogs + numCats));
        System.out.println("Proporcion perros: "
            + (float) numCats / (numDogs + numCats));

        AnimalFactory animalFactoryOverCats = new OverCatsPopulatedAnimalFactory();

        for (int i = 0; i < maxAnimals; i++)
        {
            animals[i] = animalFactoryOverCats.factoryAnimalMethod();
        }

        // todo Impresión del número de Dogs y Cats
        // todo y la proporción de cada uno
        numDogs = 0;
        numCats = 0;
        for (Animal d : animals)
        {
            if (d instanceof Dog)
            {
                numDogs++;
            }
        }
        for (Animal c : animals)
        {
            if (c instanceof Cat)
            {
                numCats++;
            }
        }
        System.out.println("\nDespues");
        System.out.println("Perros = " + numDogs);
        System.out.println("Gatos  = " + numCats);
        System.out.println("Proporcion perros: "
            + (float) numDogs / (numDogs + numCats));
        System.out.println("Proporcion perros: "
            + (float) numCats / (numDogs + numCats));

        System.out.println("\n_______________________END\n");
    }
}