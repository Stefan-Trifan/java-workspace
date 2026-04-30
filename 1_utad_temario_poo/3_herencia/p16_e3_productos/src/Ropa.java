

public class Ropa extends Producto
{
    // ------------------------------- Atributos
    
    private int talla;
    
    // ___________________ Constructor Principal
    
    public Ropa(String nombre, int precio, int codigoBarras, int talla)
    {
        super(nombre, precio, codigoBarras);
        this.talla = talla;
    }
    
    // --------------------------------- Getters
    
    public int getTalla()
    {
        return talla;
    }
    
    // --------------------------------- Setters
    
    public void setTalla(int talla)
    {
        this.talla = talla;
    }
    
    // ------------------------ Métodos Públicos

    @Override
    public String imprimirInfo()
    {
        return  super.imprimirInfo() + " / " + "talla " + this.talla;
    }

    public String mostrarTalla()
    {
        return "Talla " + talla;
    }
    
    // ------------------------ Métodos Privados 
}
