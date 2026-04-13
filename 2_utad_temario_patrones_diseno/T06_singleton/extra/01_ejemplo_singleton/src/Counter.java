public class Counter
{
    // _______________________________ Atributos

    // Referencia estática que guardará la única instancia de la clase
    private static Counter instance;

    // Atributo normal del objeto
    private int value;

    // ___________________________ Constructores
    // Constructor privado
    // Esto impide que otras clases puedan
    // crear objetos con "new Counter()"
    private Counter()
    {
        value = 0;
    }

    // ________________________ Métodos Públicos

    // Método estático para obtener la única instancia
    // Si no existe, la crea. Si ya existe, devuelve la misma
    public static Counter getInstance()
    {
        if (instance == null)
        {
            // Se crea la instancia solo la primera vez
            instance = new Counter();
        }
        // Siempre se devuelve la misma instancia
        return instance;
    }

    public void increment()
    {
        value++;
    }

    public int getValue()
    {
        return value;
    }

}