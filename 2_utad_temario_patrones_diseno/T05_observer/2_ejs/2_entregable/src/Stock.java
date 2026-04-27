public class Stock implements Observer
{
    // _______________________________ Atributos
    // ___________________________ Constructores
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
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
    // ________________________ Métodos Privados
}
