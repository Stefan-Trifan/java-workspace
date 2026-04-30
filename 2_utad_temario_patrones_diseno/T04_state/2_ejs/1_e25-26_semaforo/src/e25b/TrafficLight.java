package e25b;

public class TrafficLight
{
    // ------------------------------- Atributos
    private TrafficLightState trafficLightState;

    // --------------------------- Constructores
    public TrafficLight(TrafficLightState trafficLightState)
    {
        this.trafficLightState = trafficLightState;
    }

    public TrafficLight()
    {
        this(new RedLightState());
    }

    // --------------------------------- Getters
    public TrafficLightState getTrafficLightState()
    {
        return this.trafficLightState;
    }

    // --------------------------------- Setters
    public void setTrafficLightState(TrafficLightState trafficLightState)
    {
        this.trafficLightState = trafficLightState;
    }

    // ------------------------ Métodos Públicos
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