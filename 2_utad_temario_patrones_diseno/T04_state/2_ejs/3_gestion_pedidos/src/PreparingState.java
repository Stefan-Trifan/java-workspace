// Clase concreta para el estado "En preparación"

public class PreparingState implements OrderState
{
    public void confirmOrder(Order myOrder)
    {
        System.out.println("Operacion no disponible");
    }

    public void prepareOrder(Order myOrder)
    {
        System.out.println("Preparing -> ReadyForShipping");
        myOrder.setState(myOrder.getReadyForShippingState());
    }

    public void shipOrder(Order myOrder)
    {
        System.out.println("Operacion no disponible");
    }

    public void deliveredOrder(Order myOrder)
    {
        System.out.println("Operacion no disponible");
    }

    public void backToPreviousState(Order myOrder)
    {
        System.out.println("Pending <- Preparing");
        myOrder.setState(myOrder.getPendingState());
    }
}
