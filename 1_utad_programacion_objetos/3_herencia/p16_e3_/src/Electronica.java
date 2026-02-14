
public class Electronica extends Producto
{
    // _______________________________ Atributos

    private int garantia;

    // ___________________ Constructor Principal

    public Electronica(String nombre, int precio, int codigoBarras, int garantia)
    {
        super(nombre, precio, codigoBarras);
        this.garantia = garantia;
    }

    // _________________________________ Getters

    public int getGarantia()
    {
        return garantia;
    }

    // _________________________________ Setters

    public void setGarantia(int garantia)
    {
        this.garantia = garantia;
    }

    // ________________________ Métodos Públicos

    @Override
    public String imprimirInfo()
    {
        return super.imprimirInfo() + " / " + "garantia " + this.garantia;
    }

    public String obtenerGarantia()
    {
        return "Garantia " + garantia;
    }

    // ________________________ Métodos Privados
}
