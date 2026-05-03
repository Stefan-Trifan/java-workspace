public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        // Creacion
        PedidoFactory factory = new PedidoExpressFactory();
        Pedido primerPedido = factory.crearPedido();
        System.out.println("Nuevo pedido: " + primerPedido.toString());

        System.out.println();

        // Comportamiento
        primerPedido.getEstado().mostrarEstado();
        System.out.println("Dias Entrega Restantes: " + primerPedido.getDiasRestantes());

        System.out.println();
        primerPedido.cambiar();
        primerPedido.getEstado().mostrarEstado();
        System.out.println("Dias Entrega Restantes: " + primerPedido.getDiasRestantes());

        System.out.println();
        primerPedido.cambiar();
        primerPedido.getEstado().mostrarEstado();
        System.out.println("Dias Entrega Restantes: " + primerPedido.getDiasRestantes());

        System.out.println();
        primerPedido.cambiar();
        primerPedido.getEstado().mostrarEstado();
        System.out.println("Dias Entrega Restantes: " + primerPedido.getDiasRestantes());

        // primerPedido.cambiar();
        // primerPedido.cambiar();
        // primerPedido.cambiar();
        // primerPedido.cambiar();

        System.out.println("\n_______________________END\n");
    }
}