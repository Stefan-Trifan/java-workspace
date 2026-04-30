// Clase que representa un pedido

public class Order
{
    // ------------------------------- Atributos
    private OrderState actualState;
    private OrderState pendingState          = new PendingState();
    private OrderState preparingState        = new PreparingState();
    private OrderState readyForShippingState = new ReadyForShippingState();
    private OrderState deliveringState       = new DeliveringState();
    private OrderState deliveredState        = new DeliveredState();

    // --------------------------- Constructores
    public Order(OrderState state)
    {
        this.actualState = state;
    }

    public Order()
    {
        this.actualState = pendingState;
    }

    // ------------------------ Métodos Públicos
    public void procesarPedido()
    {
        confirmOrder();
        prepareOrder();
        shipOrder();
        deliveredOrder();
    }

    public void confirmOrder()
    {
        actualState.confirmOrder(this);
    }

    public void prepareOrder()
    {
        actualState.prepareOrder(this);
    }

    public void shipOrder()
    {
        actualState.shipOrder(this);
    }

    public void deliveredOrder()
    {
        actualState.deliveredOrder(this);

    }

    public void backToPreviousState()
    {
        actualState.backToPreviousState(this);
    }

    // --------------------------------- Setters
    public void setState(OrderState state)
    {
        this.actualState = state;
    }

    // --------------------------------- Getters
    public OrderState getPendingState()
    {
        return pendingState;
    }

    public OrderState getPreparingState()
    {
        return preparingState;
    }

    public OrderState getReadyForShippingState()
    {
        return readyForShippingState;
    }

    public OrderState getDeliveringState()
    {
        return deliveringState;
    }

    public OrderState getDeliveredState()
    {
        return deliveredState;
    }
}
