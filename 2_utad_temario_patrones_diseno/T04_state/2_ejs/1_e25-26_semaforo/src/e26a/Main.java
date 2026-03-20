package e26a;

import java.util.concurrent.TimeUnit;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        TrafficLight trafficLight = new TrafficLight();
        trafficLight.encendido();

        System.out.println("\n_______________________END\n");
    }
}