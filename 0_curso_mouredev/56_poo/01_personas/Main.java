public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("\n_______________________START\n");

        // Creamos primera persona con consturctor
        var person = new Person("Steve", 18);
        person.sayHello();
        // Modificamos nombre primera persona
        person.name = "Pepe";
        person.sayHello();

        System.out.println("\n_______________________END\n");
    }
}