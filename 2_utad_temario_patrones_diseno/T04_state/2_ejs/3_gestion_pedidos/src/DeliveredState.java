// Clase concreta para el estado "Entregado"

public class DeliveredState implements OrderState
{
    public void confirmOrder(Order myOrder)
    {
        System.out.println("Operacion no disponible: El cliente ya tiene su pedido");
    }

    public void prepareOrder(Order myOrder)
    {
        System.out.println("Operacion no disponible: El cliente ya tiene su pedido");
    }

    public void shipOrder(Order myOrder)
    {
        System.out.println("Operacion no disponible: El cliente ya tiene su pedido");
    }

    public void deliveredOrder(Order myOrder)
    {
        System.out.println("Operacion no disponible: El cliente ya tiene su pedido");
    }

    public void backToPreviousState(Order myOrder)
    {
        System.out.println("Operacion no disponible: El cliente ya tiene su pedido");
    }
}
