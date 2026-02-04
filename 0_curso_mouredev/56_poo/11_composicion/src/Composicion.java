public class Composicion
{
    public static void main(String[] args) throws Exception
    {
        // Composición ("tiene un")

        var car = new Car();
        car.on();
    }

    public static class Engine
    {

        public void on()
        {
            System.out.println("Motor encendido");
        }
    }

    public static class Car
    {

        final private Engine engine = new Engine();

        public void on()
        {
            engine.on();
        }
    }
}