public class Pareja<T>
{
    // _______________________________ Atributos
    private T primero;

    // ___________________________ Constructores
    public Pareja()
    {
        primero = null;
    }

    // _________________________________ Getters
    public T getPrimero()
    {
        return primero;
    }

    // _________________________________ Setters
    public void setPrimero(T nuevoValor)
    {
        primero = nuevoValor;
    }

    // ________________________ Métodos Públicos
    // ________________________ Métodos Privados
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        

        System.out.println("\n_______________________END\n");
    }
}
