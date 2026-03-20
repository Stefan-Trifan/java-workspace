package e25b;

import java.util.concurrent.TimeUnit;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        TrafficLight trafficLight = new TrafficLight();
        trafficLight.show();

        for (int i = 0; i < 7; i++)
        {
            trafficLight.show();
            try
            {
                TimeUnit.SECONDS.sleep(1); // @off
            }
            catch (InterruptedException e)
            {
                e.printStackTrace(); // @on
            }
        }

        System.out.println("\n_______________________END\n");
    }
}