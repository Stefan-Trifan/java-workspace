// Clase concreta para el estado "En camino"

// Todo arreglar los sout

public class ShippingState implements OrderState
{
    public void confirmOrder()
    {
        System.out.println("Pedido en camino!");
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
        System.out.println("Pedido recibido");
        // Cambiar State
    }
}
