// Interfaz para los diferentes estados de un pedido @off

public interface OrderState
{
    void confirmOrder(Order myOrder);
    void prepareOrder(Order myOrder);
    void shipOrder(Order myOrder);
    void deliveredOrder(Order myOrder);
    void backToPreviousState(Order myOrder);
}
