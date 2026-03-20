package e25b;
public class AmberLightState implements TrafficLightState
{
    public void cambiar(TrafficLight miSemaforo)
    {
        miSemaforo.setTrafficLightState(new RedLightState());
    }

    public void show()
    {
        System.out.println("Amber light, stop!");
    }
}