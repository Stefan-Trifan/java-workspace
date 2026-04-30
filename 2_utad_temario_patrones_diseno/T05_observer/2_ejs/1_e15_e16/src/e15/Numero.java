package e15;
import java.util.*;

class Numero implements Subject
{
    // ------------------------------- Atributos
    private int            valor;
    private List<Observer> myObservers = new ArrayList<>();

    // --------------------------- Constructores

    // ------------------------ Métodos Públicos
    public void addObserver(Observer... newObservers)
    {
        for (Observer o : newObservers)
        {
            this.myObservers.add(o);
        }
    }

    private void notifyObservers()
    {
        for (Observer o : myObservers)
        {
            o.update();
        }
    }

    public void removeObserver(Observer... oldObservers)
    {
        for (Observer o : oldObservers)
        {
            myObservers.remove(o);
        }
    }

    // --------------------------------- Setters
    public void setValor(int valor)
    {
        this.valor = valor;
        notifyObservers();
    }

    // --------------------------------- Getters
    public int getValor()
    {
        return valor;
    }
}