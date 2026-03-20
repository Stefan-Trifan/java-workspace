// Clase concreta para el estado "Entregado"

// Todo arreglar los sout

public class DeliveredState implements OrderState
{
    public void confirmOrder()
    {
        System.out.println("Pedido recibido");
    }

    public void prepareOrder()
    {
        System.out.println("Operacion no disponible");
    }

    public void shipOrder()
    {
        System.out.println("Operacion no disponible");
    }

    public void deliveredOrder()
    {
        System.out.println("Operacion no disponible");
    }
}
