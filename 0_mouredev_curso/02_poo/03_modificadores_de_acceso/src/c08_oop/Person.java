package c08_oop;
public class Person
{
    // Atributos
    protected String name;
    private int age;
    final private String id;

    // Constructor
    public Person(String name, int age, String id)
    {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Metodos
    public void sayHello()
    {
        System.out.println(
            "Hola, soy " + name + " y tengo " + age + " años.");
    }
}
