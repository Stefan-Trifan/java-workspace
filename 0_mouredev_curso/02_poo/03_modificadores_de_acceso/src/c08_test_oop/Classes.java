package c08_test_oop;

import c08_oop.Person;

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
