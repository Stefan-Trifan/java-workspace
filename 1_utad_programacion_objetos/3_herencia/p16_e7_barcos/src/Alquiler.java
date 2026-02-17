import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler
{
    // _______________________________ Atributos
    private String    nombreCliente;
    private String    DNICliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Barco     miBarco;

    // ___________________ Constructor Principal

    public Alquiler(
        String nombreCliente, String dNICliente,
        LocalDate fechaInicio, LocalDate fechaFin, Barco miBarco)
    {
        this.nombreCliente = nombreCliente;
        this.DNICliente = dNICliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.miBarco = miBarco;
    }

    // ________________ Constructores Auxiliares
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public double calcularAlquiler()
    {
        int numDias = (int) ChronoUnit.DAYS.between(fechaInicio, fechaFin) + 1;

        return numDias * miBarco.calcularModulo();
    }
    // ________________________ Métodos Privados
}
