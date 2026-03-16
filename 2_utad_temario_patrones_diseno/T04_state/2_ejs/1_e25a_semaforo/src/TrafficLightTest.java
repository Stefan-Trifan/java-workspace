public class TrafficLightTest
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");
        TrafficLight trafficLight = new TrafficLight(new GreenLightState());

        trafficLight.show();

        trafficLight.setTrafficLightState(new AmberLightState());
        trafficLight.show();

        trafficLight.setTrafficLightState(new RedLightState());
        trafficLight.show();

        System.out.println("\n_______________________END\n");
    }
}