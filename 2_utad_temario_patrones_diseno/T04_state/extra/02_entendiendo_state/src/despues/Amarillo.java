package despues;

public class Amarillo implements EstadoSemaforo
{
    // ------------------------------- Atributos
    private String color = "AMARILLO";

    // --------------------------------- Getters
    public String getColor()
    {
        return color;
    }

    // ------------------------ Métodos Públicos
    public String mostrarEstado()
    {
        return "Color actual: " + color + "\nLos coches deben ir frenando.";
    }
    public boolean puedenPasarCoches()
    {
        return false;
    }

    public EstadoSemaforo cambiar()
    {
        return new Rojo();
    }

}
