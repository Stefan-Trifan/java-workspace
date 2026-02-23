public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        TrafficLightContext TrafficLightContext = new TrafficLightContext(new GreenLightState());
        TrafficLightContext.show();

        TrafficLightContext.setTrafficLightContextState(new AmberLightState());
        TrafficLightContext.show();

        TrafficLightContext.setTrafficLightContextState(new RedLightState());
        TrafficLightContext.show();

        System.out.println("\n_______________________END\n");
    }
}