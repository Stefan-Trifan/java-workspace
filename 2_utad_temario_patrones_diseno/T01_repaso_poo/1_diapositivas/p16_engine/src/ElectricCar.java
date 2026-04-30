public class ElectricCar
{
    // ------------------------------- Atributos
    private Engine motor;

    // ___________________ Constructor Principal
    public ElectricCar(Engine motor)
    {
        this.motor = motor;
    }

    // ________________ Constructores Auxiliares
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public String encender()
    {
        return motor.encender();
    }
    public String avanzar()
    {
        return "avanzando";
    }
    // ------------------------ Métodos Privados
}
