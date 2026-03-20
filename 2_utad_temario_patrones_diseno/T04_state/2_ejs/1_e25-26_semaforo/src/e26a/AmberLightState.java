package e26a;

public class AmberLightState implements TrafficLightState
{
    public void cambiar(TrafficLight miSemaforo)
    {
        miSemaforo.setTrafficLightState(miSemaforo.getRedLight());
    }

    public void show()
    {
        System.out.println("Amber light, stop!");
    }
}