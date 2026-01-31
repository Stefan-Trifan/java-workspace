package c08_oop;
public class Classes 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("\n_______________________START\n");

        // Creamos primera persona con consturctor
        Person miPerson = new Person("Steve", 18, "JUGUBUGULEA");
        miPerson.sayHello();
        
        System.out.println("\n_______________________END\n");
    }
}
