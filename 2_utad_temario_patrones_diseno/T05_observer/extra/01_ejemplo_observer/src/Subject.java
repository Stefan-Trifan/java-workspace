
import java.util.ArrayList;
import java.util.List;

// Lista de observadores suscritos

// Cuando cambia el estado del Subject,
// se notifica a todos los observadores

public class Subject
{
    private List<Observer> observers = new ArrayList<>();
    private int            state;

    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void setState(int state)
    {
        this.state = state;
        notifyObservers();
    }

    private void notifyObservers()
    {
        for (Observer observer : observers)
        {
            observer.update(state); // notifica a todos
        }
    }
}