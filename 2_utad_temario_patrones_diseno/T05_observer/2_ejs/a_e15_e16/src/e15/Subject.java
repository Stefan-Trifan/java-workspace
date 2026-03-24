package e15;
public interface Subject
{
    public void addObserver(Observer... newObservers);
    public void removeObserver(Observer... oldObservers);
}
