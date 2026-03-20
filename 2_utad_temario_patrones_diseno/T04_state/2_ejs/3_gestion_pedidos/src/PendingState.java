// Clase concreta para el estado "En espera"

// Todo arreglar los sout

public class PendingState implements OrderState
{
    public void confirmOrder()
    {
        System.out.println("Pedido en espera de confirmacion!");
    }

    public void prepareOrder()
    {
        System.out.println("Pedido confirmado! -> Preparando pedido");
    }

    public void shipOrder()
    {
        System.out.println("Error: Pedido no preparado todavia");
    }

    public void deliveredOrder()
    {
        System.out.println("Operacion no disponible");
    }
}
