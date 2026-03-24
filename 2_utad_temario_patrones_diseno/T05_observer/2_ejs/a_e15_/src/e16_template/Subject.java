package e16_template; // @off

public interface Subject
{
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
    public Integer getValor();
    public void setValor(Integer valor);
}
