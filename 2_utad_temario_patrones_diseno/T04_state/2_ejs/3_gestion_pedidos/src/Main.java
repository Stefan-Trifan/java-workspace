public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Order pedidoAirFryer = new Order();

        pedidoAirFryer.confirmOrder();
        pedidoAirFryer.prepareOrder();
        pedidoAirFryer.shipOrder();
        pedidoAirFryer.backToPreviousState();
        pedidoAirFryer.backToPreviousState();
        pedidoAirFryer.backToPreviousState();
        pedidoAirFryer.confirmOrder();
        pedidoAirFryer.prepareOrder();
        pedidoAirFryer.shipOrder();
        pedidoAirFryer.deliveredOrder();

        System.out.println();

        Order pedidoMacbook = new Order();

        pedidoMacbook.procesarPedido();

        System.out.println("\n_______________________END\n");
    }
}