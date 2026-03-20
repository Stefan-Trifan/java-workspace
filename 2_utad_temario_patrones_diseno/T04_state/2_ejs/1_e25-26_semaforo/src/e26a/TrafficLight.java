package e26a;

import java.util.concurrent.TimeUnit;

public class TrafficLight
{
    // _______________________________ Atributos
    private TrafficLightState actualLight;
    private TrafficLightState redLight   = new RedLightState();
    private TrafficLightState greenLight = new GreenLightState();
    private TrafficLightState amberLight = new AmberLightState();

    // ___________________________ Constructores
    public TrafficLight(TrafficLightState trafficLightState)
    {
        this.actualLight = trafficLightState;
    }

    public TrafficLight()
    {
        this.actualLight = redLight;
    }

    // _________________________________ Getters
    public TrafficLightState getTrafficLightState()
    {
        return this.actualLight;
    }

    public TrafficLightState getRedLight()
    {
        return this.redLight;
    }

    public TrafficLightState getGreenLight()
    {
        return this.greenLight;
    }

    public TrafficLightState getAmberLight()
    {
        return this.amberLight;
    }

    // _________________________________ Setters
    public void setTrafficLightState(TrafficLightState trafficLightState)
    {
        this.actualLight = trafficLightState;
    }

    // ________________________ Métodos Públicos
    public void show()
    {
        this.actualLight.show(); // Delegación
        this.cambiar();
    }

    public void cambiar()
    {
        actualLight.cambiar(this);
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