package despues;

public class Verde implements EstadoSemaforo
{
    // ------------------------------- Atributos
    private String color = "VERDE";

    // --------------------------------- Getters
    public String getColor()
    {
        return color;
    }

    // ------------------------ Métodos Públicos
    public String mostrarEstado()
    {
        return "Color actual: " + color + "\nLos coches pueden pasar.";
    }

    public boolean puedenPasarCoches()
    {
        return true;
    }

    public EstadoSemaforo cambiar()
    {
        return new Amarillo();
    }

}
