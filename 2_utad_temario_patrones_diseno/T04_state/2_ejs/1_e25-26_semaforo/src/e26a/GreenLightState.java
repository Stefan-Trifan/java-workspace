package e26a;
public class GreenLightState implements TrafficLightState
{
    public void cambiar(TrafficLight miSemaforo)
    {
        miSemaforo.setTrafficLightState(new AmberLightState());
    }

    public void show()
    {
        System.out.println("Green light, go forward!!");
    }
}