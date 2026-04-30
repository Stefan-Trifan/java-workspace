public class Stock implements Observer
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public void update(Observable observable, Object state)
    {
        System.out.println("- Stock: Recibido.");
        // Push
        if(state instanceof Book)
        {
            System.out.println(state.toString());
        }
        // Pull
        if(observable instanceof BookAlarm)
        {
            System.out.println(((BookAlarm) observable).getBook().toString());
        }
    }
    // ------------------------ Métodos Privados
}
