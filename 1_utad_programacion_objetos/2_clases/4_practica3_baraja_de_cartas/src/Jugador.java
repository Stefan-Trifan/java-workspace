import java.util.ArrayList;

public class Jugador
{
    // _________________________________________
    // _______________________________ Atributos
    private ArrayList<Carta> misCartas;  
    private String nombre;
    // _________________________________________
    // ___________________ Constructor Principal
    public Jugador()
    {
        misCartas = new ArrayList<>();
    }
    // _________________________________________
    // ________________ Constructores Auxiliares
    // _________________________________________
    // _________________________________ Getters
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
    // _________________________________________
    // ________________________ Métodos Privados 
}
