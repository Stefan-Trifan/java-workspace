package e25a;
public class TrafficLight
{
    // ------------------------------- Atributos
    private TrafficLightState trafficLightState;

    // --------------------------- Constructores
    public TrafficLight(TrafficLightState trafficLightState)
    {
        this.trafficLightState = trafficLightState;
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
    public void cambiar()
    {
        trafficLightState.cambiar(this);
    }

    public void show()
    {
        this.trafficLightState.show(); // Delegación
    }
}