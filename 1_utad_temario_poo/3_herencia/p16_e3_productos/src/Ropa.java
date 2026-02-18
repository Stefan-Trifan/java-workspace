

public class Ropa extends Producto
{
    // _______________________________ Atributos
    
    private int talla;
    
    // ___________________ Constructor Principal
    
    public Ropa(String nombre, int precio, int codigoBarras, int talla)
    {
        super(nombre, precio, codigoBarras);
        this.talla = talla;
    }
    
    // _________________________________ Getters
    
    public int getTalla()
    {
        return talla;
    }
    
    // _________________________________ Setters
    
    public void setTalla(int talla)
    {
        this.talla = talla;
    }
    
    // ________________________ Métodos Públicos

    @Override
    public String imprimirInfo()
    {
        return  super.imprimirInfo() + " / " + "talla " + this.talla;
    }

    public String mostrarTalla()
    {
        return "Talla " + talla;
    }
    
    // ________________________ Métodos Privados 
}
