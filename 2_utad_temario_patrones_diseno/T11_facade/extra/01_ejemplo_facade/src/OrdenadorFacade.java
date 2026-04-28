public class OrdenadorFacade
{
    private CPU       cpu;
    private RAM       ram;
    private DiscoDuro disco;

    public OrdenadorFacade()
    {
        cpu = new CPU();
        ram = new RAM();
        disco = new DiscoDuro();
    }

    public void encenderOrdenador()
    {
        cpu.encender();
        ram.cargar();
        disco.leerDatos();
        cpu.ejecutar();
    }
}