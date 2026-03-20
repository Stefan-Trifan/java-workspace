package e26a;

import java.util.concurrent.TimeUnit;

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

    public void encendido()
    {
        for (int i = 0; i < 7; i++)
        {
            this.show();
            try
            {
                TimeUnit.SECONDS.sleep(1); // @off
            }
            catch (InterruptedException e)
            {
                e.printStackTrace(); // @on
            }
        }
    }

}