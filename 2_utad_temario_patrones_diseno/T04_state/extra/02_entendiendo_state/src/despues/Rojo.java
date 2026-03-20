package despues;

public class Rojo implements EstadoSemaforo
{
    // _______________________________ Atributos
    private String color = "ROJO";

    // _________________________________ Getters
    public String getColor()
    {
        return color;
    }

    // ________________________ Métodos Públicos
    public String mostrarEstado()
    {
        return "Color actual: " + color + "\nLos coches deben parar.";
    }

    public boolean puedenPasarCoches()
    {
        return false;
    }

    public EstadoSemaforo cambiar()
    {
        return new Verde();
    }

}
