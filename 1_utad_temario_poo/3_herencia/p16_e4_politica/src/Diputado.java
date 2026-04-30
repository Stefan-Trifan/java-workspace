public class Diputado extends Legislador
{
    // ___________________ Constructor Principal
    public Diputado(String provinciaQueRepresenta, String nombre, int edad)
    {
        super(provinciaQueRepresenta, nombre, edad);
    }
    // ------------------------ Métodos Públicos
    public String getCamaraEnQueTrabaja()
    {
        return "Congreso de los Diputados";
    } 
}
