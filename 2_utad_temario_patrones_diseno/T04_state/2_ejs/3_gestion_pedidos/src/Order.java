// Clase que representa un pedido

public class Order
{
    // _______________________________ Atributos
    private OrderState actualState;
    private OrderState pendingState   = new PendingState();

    private OrderState preparingState = new PreparingState();

    private OrderState shippingState  = new ShippingState();

    private OrderState deliveredState = new DeliveredState();

    // ___________________________ Constructores
    public Order(OrderState state)
    {
        this.actualState = state;
    }

    public Order()
    {
        this.actualState = pendingState;
    }

    // _________________________________ Setters
    public void setState(OrderState state)
    {
        this.actualState = state;
    }

    // _________________________________ Getters
    public OrderState getPendingState()
    {
        return pendingState;
    }

    public OrderState getPreparingState()
    {
        return preparingState;
    }

    public OrderState getShippingState()
    {
        return shippingState;
    }

    public OrderState getDeliveredState()
    {
        return deliveredState;
    }

    // ________________________ Métodos Públicos
    public void procesarPedido()
    {
        confirmOrder();
        prepareOrder();
        shipOrder();
        deliveredOrder();
    }

    private void confirmOrder()
    {
        actualState.confirmOrder();
    }

    private void prepareOrder()
    {
        actualState.prepareOrder();
    }

    private void shipOrder()
    {
        actualState.shipOrder();
    }

    private void deliveredOrder()
    {
        actualState.deliveredOrder();
    }
}
