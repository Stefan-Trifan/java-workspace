// Interfaz para los diferentes estados de un pedido @off

public interface OrderState
{
    void confirmOrder();
    void prepareOrder();
    void shipOrder();
    void deliveredOrder();
}
