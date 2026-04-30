public class Pareja<T>
{
    // ------------------------------- Atributos
    private T primero;

    // --------------------------- Constructores
    public Pareja()
    {
        primero = null;
    }

    // --------------------------------- Getters
    public T getPrimero()
    {
        return primero;
    }

    // --------------------------------- Setters
    public void setPrimero(T nuevoValor)
    {
        primero = nuevoValor;
    }

    // ------------------------ Métodos Públicos
    // ------------------------ Métodos Privados
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        

        System.out.println("\n_______________________END\n");
    }
}
