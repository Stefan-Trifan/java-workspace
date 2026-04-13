public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Usuario usuario = new Usuario();
        Administrador admin = new Administrador();

        usuario.imprimirDocumento();
        admin.imprimirReporte();

        System.out.println("\n_______________________END\n");
    }
}