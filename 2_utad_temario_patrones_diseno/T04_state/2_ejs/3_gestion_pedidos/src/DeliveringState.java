// Clase concreta para el estado "Entregado"

public class DeliveringState implements OrderState
{
    public void confirmOrder(Order myOrder)
    {
        System.out.println("Operacion no disponible: ");
    }

    public void prepareOrder(Order myOrder)
    {
        System.out.println("Operacion no disponible: ");
    }

    public void shipOrder(Order myOrder)
    {
        System.out.println("Operacion no disponible: ");
    }

    public void deliveredOrder(Order myOrder)
    {
        System.out.println("Delivering -> Delivered");
        myOrder.setState(myOrder.getDeliveredState());
    }

    public void backToPreviousState(Order myOrder)
    {
        System.out.println("ReadyForShipping <- Delivering");
        myOrder.setState(myOrder.getReadyForShippingState());
    }
}
