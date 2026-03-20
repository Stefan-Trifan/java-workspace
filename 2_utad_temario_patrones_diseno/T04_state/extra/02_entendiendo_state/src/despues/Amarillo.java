package despues;

public class Amarillo implements EstadoSemaforo
{
    // _______________________________ Atributos
    private String color = "AMARILLO";

    // _________________________________ Getters
    public String getColor()
    {
        return color;
    }

    // ________________________ Métodos Públicos
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
