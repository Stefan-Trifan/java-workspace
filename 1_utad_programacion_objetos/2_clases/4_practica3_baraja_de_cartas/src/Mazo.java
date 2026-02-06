import java.util.ArrayList;

public class Mazo
{
    // _________________________________________
    // _______________________________ Atributos

    public static final int MAX_CARTAS = 40;
    public ArrayList<Carta>  misCartas;      // todo cambiar a private

    // _________________________________________
    // ___________________ Constructor Principal

    public Mazo()
    {
        misCartas = new ArrayList<>(); 
        for (int i = 1; i <= 12; i++)
            if (i != 8 && i != 9)
            {
                misCartas.add(new Carta(i, Palo.BASTOS));
                misCartas.add(new Carta(i, Palo.COPAS));
                misCartas.add(new Carta(i, Palo.ESPADAS));
                misCartas.add(new Carta(i, Palo.OROS));
            }
    }

    // _________________________________________
    // ________________ Constructores Auxiliares
    // _________________________________________
    // _________________________________ Getters

    public static int getMaxCartas()
    {
        return MAX_CARTAS;
    }

    // _________________________________________
    // _________________________________ Setters
    // _________________________________________
    // ________________________ Métodos Públicos

    // Cambia de posición todas las cartas aleatoriamente.
    public void barajar()
    {

    }

    // Devuelve la siguiente carta que está en la baraja
    // , cuando no haya más o se haya llegado al final
    // , se indica al usuario que no hay más cartas.
    public void siguienteCarta()
    {

    }

    // Indica el número de cartas que aún puede repartir.
    public void cartasDisponibles()
    {

    }

    // Dado un número de cartas que nos pidan
    // , devolveremos ese número de cartas.
    // En caso de que haya menos cartas que las pedidas
    // , no devolveremos nada pero deberemos indicarlo.
    public void darCartas()
    {

    }

    // Mostramos aquellas cartas que ya han salido
    // , si no ha salido ninguna habrá que indicarlo.
    public void cartasMonton()
    {

    }

    // Muestra todas las cartas hasta el final.
    // Es decir, si se saca una carta y luego se llama al método
    // , éste no mostrara esa primera carta.
    public void mostrarBaraja()
    {

    }

    // _________________________________________
    // ------------------------ Métodos Privados
}
