package antes;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Semaforo semaforo = new Semaforo();

        semaforo.mostrarEstado();
        System.out.println();

        semaforo.cambiar();
        semaforo.mostrarEstado();
        System.out.println();

        semaforo.cambiar();
        semaforo.mostrarEstado();
        System.out.println();

        semaforo.cambiar();
        semaforo.mostrarEstado();
        System.out.println();

        System.out.println("\n_______________________END\n");
    }
}