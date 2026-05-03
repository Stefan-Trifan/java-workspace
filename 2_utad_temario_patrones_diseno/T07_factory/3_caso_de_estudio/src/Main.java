public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        // Creacion
        PedidoFactory factory = new PedidoNormalFactory();
        Pedido primerPedido = factory.crearPedido();
        System.out.println(primerPedido.toString());

        // Comportamiento
        primerPedido.getEstado().mostrarEstado();
        primerPedido.cambiar();
        primerPedido.cambiar();
        primerPedido.cambiar();
        primerPedido.cambiar();

        System.out.println("\n_______________________END\n");
    }
}