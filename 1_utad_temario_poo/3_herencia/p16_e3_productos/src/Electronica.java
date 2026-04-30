
public class Electronica extends Producto
{
    // ------------------------------- Atributos

    private int garantia;

    // ___________________ Constructor Principal

    public Electronica(String nombre, int precio, int codigoBarras, int garantia)
    {
        super(nombre, precio, codigoBarras);
        this.garantia = garantia;
    }

    // --------------------------------- Getters

    public int getGarantia()
    {
        return garantia;
    }

    // --------------------------------- Setters

    public void setGarantia(int garantia)
    {
        this.garantia = garantia;
    }

    // ------------------------ Métodos Públicos

    @Override
    public String imprimirInfo()
    {
        return super.imprimirInfo() + " / " + "garantia " + this.garantia;
    }

    public String obtenerGarantia()
    {
        return "Garantia " + garantia;
    }

    // ------------------------ Métodos Privados
}
