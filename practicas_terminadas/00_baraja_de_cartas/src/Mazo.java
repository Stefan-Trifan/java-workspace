import java.util.ArrayList;
import java.util.Collections;

public class Mazo
{
    // _________________________________________
    // _______________________________ Atributos

    private static final int MAX_CARTAS = 40;
    private ArrayList<Carta> cartasDisponibles;      
    private ArrayList<Carta> cartasDadas;      

    // _________________________________________
    // ___________________ Constructor Principal

    public Mazo()
    {
        this.cartasDisponibles = new ArrayList<>();
        this.cartasDadas = new ArrayList<>();
        for (int i = 1; i <= 12; i++)
        {
            if (i != 8 && i != 9)
            {
                this.cartasDisponibles.add(new Carta(i, Palo.BASTOS));
                this.cartasDisponibles.add(new Carta(i, Palo.COPAS));
                this.cartasDisponibles.add(new Carta(i, Palo.ESPADAS));
                this.cartasDisponibles.add(new Carta(i, Palo.OROS));
            }
        }
    }

    // _________________________________________
    // _________________________________ Getters
    
    public static int getMaxCartas()
        return MAX_CARTAS;

    public Carta getCartaDisponible(int i)
        return cartasDisponibles.get(i);

    public Carta getCartaDada(int i)
        return cartasDadas.get(i);

    // _________________________________________
    // ________________________ Métodos Públicos

    // Cambia de posición todas las cartas aleatoriamente.
    public void barajar()
    {
        // Forma 1
        for (int i = 0; i < cartasDisponibles.size(); i++)
        {
            // Generamos una posición aleatoria válida del mazo
            int posicionAleatoria = (int) (Math.random() * cartasDisponibles.size());

            // Guardamos temporalmente la carta en la posición i
            Carta temp = cartasDisponibles.get(i);

            // Intercambiamos las cartas
            cartasDisponibles.set(i, cartasDisponibles.get(posicionAleatoria));
            cartasDisponibles.set(posicionAleatoria, temp);
        }
    }

    public void barajarConShuffle()
        Collections.shuffle(cartasDisponibles); // Forma 2

    // Devuelve la siguiente carta que está en la baraja
    // , cuando no haya más o se haya llegado al final
    // , se indica al usuario que no hay más cartas.
    public Carta siguienteCarta()
    {
        if (cartasDisponibles.size() > 0)
        {
            cartasDadas.add(cartasDisponibles.get(0));
            return cartasDisponibles.remove(0);
        }
        else
        {
            return null;
        }
    }

    // Indica el número de cartas que aún puede repartir.
    public int numCartasDisponibles()
        return cartasDisponibles.size();

    public int numCartasDadas()
        return cartasDadas.size();

    // Dado un número de cartas que nos pidan
    // , devolveremos ese número de cartas.
    // En caso de que haya menos cartas que las pedidas
    // , no devolveremos nada pero deberemos indicarlo.
    public ArrayList<Carta> darCartas(int num)
    {
        if (this.numCartasDisponibles() >= num)
        {
            ArrayList<Carta> temp = new ArrayList<>();
            for (int i = 0; i < num; i++)
            {
                temp.add(this.siguienteCarta());
            }
            return temp;
        }
        else
        {
            return null;
        }
    }
}
