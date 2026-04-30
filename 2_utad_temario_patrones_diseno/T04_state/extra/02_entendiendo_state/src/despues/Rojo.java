package despues;

public class Rojo implements EstadoSemaforo
{
    // ------------------------------- Atributos
    private String color = "ROJO";

    // --------------------------------- Getters
    public String getColor()
    {
        return color;
    }

    // ------------------------ Métodos Públicos
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
