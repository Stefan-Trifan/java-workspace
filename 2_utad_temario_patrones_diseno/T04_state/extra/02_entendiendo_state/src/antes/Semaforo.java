package antes;

public class Semaforo
{
    // ------------------------------- Atributos
    private String color;

    // --------------------------- Constructores
    public Semaforo()
    {
        this.color = "ROJO";
    }

    // --------------------------------- Getters
    public String getColor()
    {
        return color;
    }

    // --------------------------------- Setters
    public void setColor(String color)
    {
        this.color = color;
    }

    // ------------------------ Métodos Públicos
    public void cambiar()
    {
        if (color.equals("ROJO"))
        {
            color = "VERDE";
        }
        else if (color.equals("VERDE"))
        {
            color = "AMARILLO";
        }
        else if (color.equals("AMARILLO"))
        {
            color = "ROJO";
        }
    }

    public void mostrarEstado()
    {
        System.out.println("Color actual: " + color);

        if (color.equals("ROJO"))
        {
            System.out.println("Los coches deben parar.");
        }
        else if (color.equals("VERDE"))
        {
            System.out.println("Los coches pueden pasar.");
        }
        else if (color.equals("AMARILLO"))
        {
            System.out.println("Los coches deben ir frenando.");
        }
    }

    public boolean puedenPasarCoches()
    {
        if (color.equals("VERDE"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}