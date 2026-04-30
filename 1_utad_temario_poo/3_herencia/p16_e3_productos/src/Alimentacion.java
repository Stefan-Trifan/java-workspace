import java.time.LocalDate;

public class Alimentacion extends Producto
{
    // ------------------------------- Atributos

    private LocalDate fechaCaducidad;

    // ___________________ Constructor Principal

    public Alimentacion(String nombre, int precio, int codigoBarras, LocalDate fechaCaducidad)
    {
        super(nombre, precio, codigoBarras);
        this.fechaCaducidad = fechaCaducidad;
    }

    // --------------------------------- Getters

    public LocalDate getFechaCaducidad()
    {
        return fechaCaducidad;
    }

    // --------------------------------- Setters

    public void setFechaCaducidad(LocalDate fechaCaducidad)
    {
        this.fechaCaducidad = fechaCaducidad;
    }

    // ------------------------ Métodos Públicos

    @Override
    public String imprimirInfo()
    {
        return super.imprimirInfo() + " / " + "fechaCaducidad " + this.fechaCaducidad;
    }

    public String estaCaducado()
    {
        LocalDate fechaActual = LocalDate.now();
        if (fechaActual.isBefore(fechaCaducidad))
        {
            return "No esta caducado";
        }
        else
        {
            return "Esta caducado";
        }
    }

    // ------------------------ Métodos Privados

}
