public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Semaforo semaforo = new Semaforo();
        semaforo.cambiar();
        semaforo.cambiar();
        semaforo.cambiar();
        semaforo.cambiar();

        System.out.println("\n_______________________END\n");
    }
}