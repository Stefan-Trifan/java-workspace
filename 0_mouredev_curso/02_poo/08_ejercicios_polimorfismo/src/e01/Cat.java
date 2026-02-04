package e01;

public class Cat extends Animal
{
    public String getType()
    {
        return "Cat";
    }

    @Override
    public void makeSound()
    {
        System.out.println("Miau");
    }
}
