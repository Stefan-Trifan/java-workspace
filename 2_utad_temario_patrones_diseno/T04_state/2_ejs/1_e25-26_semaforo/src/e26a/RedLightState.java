package e26a;
public class RedLightState implements TrafficLightState
{
    public void cambiar(TrafficLight miSemaforo)
    {
        miSemaforo.setTrafficLightState(new GreenLightState());
    }

    public void show()
    {
        System.out.println("Red light, stop and wait!!");
    }
}