import java.util.ArrayList;

public class Jugador
{
    // _________________________________________
    // _______________________________ Atributos
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
    // _________________________________ Getters
    public int getRondasGanadas()
    {
        return rondasGanadas; 
    }
    public String getNombre()
    {
        return nombre; 
    }
    // _________________________________________
    // _________________________________ Setters
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    // _________________________________________
    // ________________________ Métodos Públicos
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
    // ________________________ Métodos Privados 
}
