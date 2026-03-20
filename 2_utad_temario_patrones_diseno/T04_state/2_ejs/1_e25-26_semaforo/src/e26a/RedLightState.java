package e26a;

public class RedLightState implements TrafficLightState
{
    public void cambiar(TrafficLight miSemaforo)
    {
        miSemaforo.setTrafficLightState(miSemaforo.getGreenLight());
    }

    public void show()
    {
        System.out.println("Red light, stop and wait!!");
    }
}