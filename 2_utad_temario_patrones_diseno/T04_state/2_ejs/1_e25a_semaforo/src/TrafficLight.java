public class TrafficLight
{
    private TrafficLightState trafficLightState;

    public TrafficLight(TrafficLightState trafficLightState)
    {
        super();
        this.trafficLightState = trafficLightState;
    }

    public TrafficLightState getTrafficLightState()
    {
        return this.trafficLightState;
    }

    public void setTrafficLightState(TrafficLightState trafficLightState)
    {
        this.trafficLightState = trafficLightState;
    }

    public void show()
    {
        this.trafficLightState.show(); // Delegación
    }
}