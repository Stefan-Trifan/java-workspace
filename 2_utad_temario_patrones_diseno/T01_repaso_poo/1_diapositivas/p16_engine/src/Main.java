public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        ElectricCar miElectricCar = new ElectricCar(new Engine("Electrico"));

        System.out.println(miElectricCar.encender());
        System.out.println(miElectricCar.avanzar());


        System.out.println("\n_______________________END\n");
    }
}