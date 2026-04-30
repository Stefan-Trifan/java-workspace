import java.util.ArrayList;

public class TestMazo
{
    // _________________________________________
    // ------------------------ Métodos Públicos

    public static void mostrarCartasDisponibles(Mazo miMazo)
    {
        if (miMazo.numCartasDisponibles() > 0)
        {
            // @formatter:off ┌ ─ ┬ ─ ┐ └ ─ ┴ ─ ┘
            System.out.print(
            "┌───────────────────────────────────────────────────┐\n" +
            "│                    Mazo Actual                    │\n" +
            "├╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌┤\n"); 
            for (int i = 0; i <= miMazo.numCartasDisponibles() - 1; i++)
            {
                imprimirFila(i, miMazo.getCartaDisponible(i));
            }
            System.out.print(
            "└────────────┴────────┴─────────┴───────────────────┘\n");
        }
        else
        {
            System.out.print(
                "┌───────────────────────────────────────────────────┐\n" +
                "│                El mazo está vacío                 │\n" +
                "└───────────────────────────────────────────────────┘\n");
        }
    }

    public static void mostrarCartasDadas(Mazo miMazo)
    {
        if (miMazo.numCartasDadas() > 0)
        {
            System.out.print(
            "┌───────────────────────────────────────────────────┐\n" +
            "│             Cartas que ya han salido              │\n" +
            "├╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌╌┤\n"); 
            for (int i = 0; i <= miMazo.numCartasDadas() - 1; i++)
            {
                imprimirFila(i, miMazo.getCartaDada(i));
            }
            System.out.print("└────────────┴────────┴─────────┴───────────────────┘\n");
        }
        else
        {
            System.out.print(
            "┌───────────────────────────────────────────────────┐\n" +
            "│           No han salido cartas todavía            │\n" +
            "└───────────────────────────────────────────────────┘\n");
            // @formatter:on
        }
    }

    public static void imprimirFila(int i, Carta c)
    {
        System.out.printf(
            "│ Carta i %2d │ num %2d │ %-7s │ posicionEnMazo %2d │\n",
            i, c.getNumero(), c.getPalo(), i + 1);
    }

    public static void noQuedanCartas()
    {
        System.out.println("No quedan suficientes cartas en el mazo");
    }

}
