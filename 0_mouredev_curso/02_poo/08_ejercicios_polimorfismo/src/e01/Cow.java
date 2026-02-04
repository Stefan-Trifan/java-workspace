package e01;

public class Cow extends Animal
{
    public String getType()
    {
        return "Cow";
    }

    @Override
    public void makeSound()
    {
        System.out.println("Mu");
    }
}
