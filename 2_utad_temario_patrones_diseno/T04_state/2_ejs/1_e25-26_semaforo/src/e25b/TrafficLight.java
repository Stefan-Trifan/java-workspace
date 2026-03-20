package e25b;

public class TrafficLight
{
    // _______________________________ Atributos
    private TrafficLightState trafficLightState;

    // ___________________________ Constructores
    public TrafficLight(TrafficLightState trafficLightState)
    {
        this.trafficLightState = trafficLightState;
    }

    public TrafficLight()
    {
        this(new RedLightState());
    }

    // _________________________________ Getters
    public TrafficLightState getTrafficLightState()
    {
        return this.trafficLightState;
    }

    // _________________________________ Setters
    public void setTrafficLightState(TrafficLightState trafficLightState)
    {
        this.trafficLightState = trafficLightState;
    }

    // ________________________ Métodos Públicos
    public void show()
    {
        this.trafficLightState.show(); // Delegación
        this.cambiar();
    }

    public void cambiar()
    {
        trafficLightState.cambiar(this);
    }

}