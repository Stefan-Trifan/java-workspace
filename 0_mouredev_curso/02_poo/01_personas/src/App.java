public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("\n_______________________START\n");

        // Creamos primera persona con consturctor
        Person person1 = new Person("Steve", 18);
        System.out.println("- Persona1:");
        person1.sayHello();

        // Modificamos nombre primera persona
        // person1.name = "Pepe";
        System.out.println("- Persona1:");
        person1.sayHello();

        // Creamos nueva persona con consturctor
        Person person2 = new Person("Steve", 18);
        System.out.println("- Persona2:");
        person2.sayHello();
        
        System.out.println("\n_______________________END\n");
    }
}
