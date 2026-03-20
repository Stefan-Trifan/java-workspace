package e25a;
public class TrafficLight
{
    // _______________________________ Atributos
    private TrafficLightState trafficLightState;

    // ___________________________ Constructores
    public TrafficLight(TrafficLightState trafficLightState)
    {
        this.trafficLightState = trafficLightState;
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
    public void cambiar()
    {
        trafficLightState.cambiar(this);
    }

    public void show()
    {
        this.trafficLightState.show(); // Delegación
    }
}