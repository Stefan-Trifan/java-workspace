public class FormaDeJuego
{
    // ------------------------------- Atributos
    
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public void muestraFigura()
    {
        System.out.println("Mostrando forma");
    }
    // ------------------------ Métodos Privados 
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        FormaDeJuego figura = new PiezaDeJuego();
        PiezaDama piezaDama = new PiezaDama();

        // figura.muestraFigura();
        // figura.muevePieza();

        muestraFigura(figura);
        muestraFigura(piezaDama);

        System.out.println("\n_______________________END\n");
    }
    public static void muestraFigura(FormaDeJuego formaDeJuego)
    {
        formaDeJuego.muestraFigura();
    }
}
