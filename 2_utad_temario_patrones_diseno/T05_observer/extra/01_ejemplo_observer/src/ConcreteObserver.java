// Cada observador decide qué hacer cuando recibe la notificación

public class ConcreteObserver implements Observer
{
    private String name;

    public ConcreteObserver(String name)
    {
        this.name = name;
    }

    @Override
    public void update(int value)
    {
        System.out.println(name + " received update: " + value);
    }
}