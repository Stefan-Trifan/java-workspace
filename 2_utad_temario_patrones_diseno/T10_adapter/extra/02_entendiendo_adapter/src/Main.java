public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        OldPhoneCharger oldCharger = new OldPhoneCharger();

        

        System.out.println("\n_______________________END\n");
    }
}

class OldPhoneCharger
{
    // ------------------------ Métodos Públicos
    public void connectOldCharger()
    {
        System.out.println("Cargando teléfono con cargador antiguo...");
    }
}

interface OldToNewAdapter
{

}

class NewPhoneCharger
{
    // ------------------------ Métodos Públicos
    public void connectCharger()
    {
        System.out.println("Cargando teléfono con cargador nuevo...");
    }
}