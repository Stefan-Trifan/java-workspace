package despues;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        ContextoSemaforo semaforo = new ContextoSemaforo();

        for (int i = 0; i < 10; i++)
        {
            System.out.println(semaforo.verColor());
            System.out.println(semaforo.mostrarEstado());;
            semaforo.cambiar();
            try
            {
                Thread.sleep(1000); // espera 2 segundos
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println();
        }

        System.out.println("\n_______________________END\n");
    }
}