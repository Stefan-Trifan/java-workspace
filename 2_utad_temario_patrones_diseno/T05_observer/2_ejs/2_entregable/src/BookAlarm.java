import java.util.ArrayList;
import java.util.List;

public class BookAlarm implements Observable
{
    // _______________________________ Atributos
    private List<Observer> myObservers = new ArrayList<>();
    private Book           book;

    // ___________________________ Constructores
    // _________________________________ Getters
    public Book getBook()
    {
        return book;
    }

    // _________________________________ Setters
    public void setBook(Book book)
    {
        this.book = book;
    }
    // ________________________ Métodos Públicos

    @Override
    public void attach(Observer... newObservers)
    {
        for (Observer o : newObservers)
        {
            myObservers.add(o);
        }
    }

    @Override
    public void detach(Observer observer)
    {
        myObservers.remove(observer);
    }

    @Override
    public void notifyObservers()
    {
        for (Observer o : myObservers)
        {
            o.update(this, this.book);
        }
    }
    // ________________________ Métodos Privados
}
