public class Senador extends Legislador
{
    // ___________________ Constructor Principal
    public Senador(String provinciaQueRepresenta, String nombre, int edad)
    {
        super(provinciaQueRepresenta, nombre, edad);
    }
    // ________________________ Métodos Públicos
    public String getCamaraEnQueTrabaja()
    {
        return "Senado";
    }

}