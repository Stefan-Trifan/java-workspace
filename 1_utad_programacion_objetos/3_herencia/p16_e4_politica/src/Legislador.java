public abstract class Legislador
{
    // _______________________________ Atributos
    private String provinciaQueRepresenta;
    private String nombre;
    private int edad;
    // ___________________ Constructor Principal
    public Legislador(String provinciaQueRepresenta, String nombre, int edad)
    {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.nombre = nombre;
        this.edad = edad;
    }
    // ________________________ Métodos Públicos
    public abstract String getCamaraEnQueTrabaja();
}
