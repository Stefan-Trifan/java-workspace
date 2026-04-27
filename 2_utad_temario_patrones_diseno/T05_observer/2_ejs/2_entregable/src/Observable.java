public interface Observable
{
    public void attach(Observer...newObservers);
    public void detach(Observer observer);
    public void notifyObservers();
}
