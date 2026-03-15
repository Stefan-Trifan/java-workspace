package v1;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        DoctorServiceTemplate servicio = new DrWang();

        servicio.atender();

        System.out.println();

        servicio = new DrFong();
        servicio.atender();

        System.out.println("\n_______________________END\n");
    }
}