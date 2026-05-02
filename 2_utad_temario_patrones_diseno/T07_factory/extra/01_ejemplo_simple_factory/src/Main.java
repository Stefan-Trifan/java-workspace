public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Vehicle v1 = VehicleFactory.createVehicle("car");
        Vehicle v2 = VehicleFactory.createVehicle("bike");

        v1.drive();
        v2.drive();

        System.out.println("\n_______________________END\n");
    }
}