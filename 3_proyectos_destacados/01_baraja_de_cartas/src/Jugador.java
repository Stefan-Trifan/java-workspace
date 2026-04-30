import java.util.ArrayList;

public class Jugador
{
    // _________________________________________
    // ------------------------------- Atributos
    private ArrayList<Carta> misCartas;  
    private String nombre;
    private int rondasGanadas;
    // _________________________________________
    // ___________________ Constructor Principal
    public Jugador()
    {
        misCartas = new ArrayList<>();
        rondasGanadas = 0;
    }
    // _________________________________________
    // ________________ Constructores Auxiliares
    // _________________________________________
    // --------------------------------- Getters
    public int getRondasGanadas()
    {
        return rondasGanadas; 
    }
    public String getNombre()
    {
        return nombre; 
    }
    // _________________________________________
    // --------------------------------- Setters
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    // _________________________________________
    // ------------------------ Métodos Públicos
    public void addCarta(Carta carta)
    {
        misCartas.add(carta);
    }

    public Carta darCarta()
    {
        return misCartas.remove(0);
    }

    public void rondaGanada()
    {
        rondasGanadas++;
    }
    // _________________________________________
    // ------------------------ Métodos Privados 
}
