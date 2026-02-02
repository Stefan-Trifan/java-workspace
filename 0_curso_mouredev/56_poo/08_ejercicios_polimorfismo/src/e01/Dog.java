package e01;

public class Dog extends Animal
{
    
    public String getType()
    {
        return "Dog";
    }

    @Override
    public void makeSound()
    {
        System.out.println("Wuf");
    }
}
