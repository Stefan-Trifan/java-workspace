public class ElectricCar
{
    // _______________________________ Atributos
    private Engine motor;

    // ___________________ Constructor Principal
    public ElectricCar(Engine motor)
    {
        this.motor = motor;
    }

    // ________________ Constructores Auxiliares
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public String encender()
    {
        return motor.encender();
    }
    public String avanzar()
    {
        return "avanzando";
    }
    // ________________________ Métodos Privados
}
