// Clase concreta para el estado "En preparación"

// Todo arreglar los sout

public class PreparingState implements OrderState
{
    public void confirmOrder()
    {
        System.out.println("Pedido en preparacion!");
    }

    public void prepareOrder()
    {
        System.out.println("Pedido preparado! -> Enviando pedido");
        shipOrder();
    }

    public void shipOrder()
    {
        System.out.println("Pedido en camino!");
    }

    public void deliveredOrder()
    {
        System.out.println("Operacion no disponible");
    }
}
