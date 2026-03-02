public interface Subject
{
    void attach(Observer);
    void detach(Observer);
    void notifyObservers();
}
