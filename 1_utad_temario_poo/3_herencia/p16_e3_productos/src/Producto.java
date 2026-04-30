public class Producto
{
    // ------------------------------- Atributos
    private String nombre;
    private int    precio;
    private int    codigoBarras;

    // ___________________ Constructor Principal
    public Producto(String nombre, int precio, int codigoBarras)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.codigoBarras = codigoBarras;
    }

    // --------------------------------- Getters
    public String getNombre()
    {
        return nombre;
    }

    public int getPrecio()
    {
        return precio;
    }

    public int getCodigoBarras()
    {
        return codigoBarras;
    }

    // --------------------------------- Setters
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setPrecio(int precio)
    {
        this.precio = precio;
    }

    public void setCodigoBarras(int codigoBarras)
    {
        this.codigoBarras = codigoBarras;
    }

    // ------------------------ Métodos Públicos

    public String imprimirInfo()
    {
        // @off
        return "nombre: " + nombre + " / " + 
               "precio: " + precio + " / " + 
               "codigoBarras: " + codigoBarras; // @on
    }

    // ------------------------ Métodos Privados
}
