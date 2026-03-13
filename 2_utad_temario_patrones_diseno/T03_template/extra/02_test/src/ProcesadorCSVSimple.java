public class ProcesadorCSVSimple extends ProcesadorTemplate
{
    // _______________________________ Atributos
    // ___________________________ Constructores
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    @Override
    protected void leer()
    {
        System.out.println("- Subclase CSV Simple: Leyendo datos");
    }

    @Override
    protected void procesarDatos()
    {
        System.out.println("- Subclase CSV Simple: Procesando datos");
    }
    // ________________________ Métodos Privados
}
