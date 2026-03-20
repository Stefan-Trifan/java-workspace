package e25a;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        TrafficLight trafficLight = new TrafficLight(new AmberLightState());
        trafficLight.show();

        trafficLight.cambiar();
        trafficLight.show();

        trafficLight.cambiar();
        trafficLight.show();

        System.out.println("\n_______________________END\n");
    }
}