public interface PullPushModelObservable
{
    // ________________________ Métodos Públicos
    public void attach(PullPushObserver observer);
    public void detach(PullPushObserver observer);
    public void notifyObservers();
}
