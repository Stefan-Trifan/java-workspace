package e16_generics; // @off

public interface Subject<T>
{
    public void addObserver(Observer<T> observer);
    public void removeObserver(Observer<T> observer);
    public void notifyObservers();
    public T getState();
    public void setState(T object);
}
