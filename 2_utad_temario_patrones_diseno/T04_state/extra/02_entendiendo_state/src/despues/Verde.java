package despues;

public class Verde implements EstadoSemaforo
{
    // _______________________________ Atributos
    private String color = "VERDE";

    // _________________________________ Getters
    public String getColor()
    {
        return color;
    }

    // ________________________ Métodos Públicos
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
