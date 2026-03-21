// Clase concreta para el estado "En camino"

public class ReadyForShippingState implements OrderState
{
    public void confirmOrder(Order myOrder)
    {
        System.out.println("Operacion no disponible");
    }

    public void prepareOrder(Order myOrder)
    {
        System.out.println("Operacion no disponible");
    }

    public void shipOrder(Order myOrder)
    {
        System.out.println("ReadyForShipping -> Delivering");
        myOrder.setState(myOrder.getDeliveringState());
    }

    public void deliveredOrder(Order myOrder)
    {
        System.out.println("Operacion no disponible");
    }

    public void backToPreviousState(Order myOrder)
    {
        System.out.println("Preparing <- ReadyForShipping");
        myOrder.setState(myOrder.getPreparingState());
    }
}
