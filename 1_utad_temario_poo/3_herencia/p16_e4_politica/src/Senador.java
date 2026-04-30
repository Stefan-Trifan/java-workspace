public class Senador extends Legislador
{
    // ___________________ Constructor Principal
    public Senador(String provinciaQueRepresenta, String nombre, int edad)
    {
        super(provinciaQueRepresenta, nombre, edad);
    }
    // ------------------------ Métodos Públicos
    public String getCamaraEnQueTrabaja()
    {
        return "Senado";
    }

}