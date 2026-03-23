package e4_efecto_cascada;

import java.util.*;

class Numero
{
    // _______________________________ Atributos
    private int            valor;
    private List<Observer> myObservers = new ArrayList<>();

    // ___________________________ Constructores

    // ________________________ Métodos Públicos
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
            o.update(this);
        }
    }

    public void removeObserver(Observer... oldObservers)
    {
        for (Observer o : oldObservers)
        {
            myObservers.remove(o);
        }
    }

    // _________________________________ Setters
    public void setValor(int valor)
    {
        this.valor = valor;
        notifyObservers();
    }

    // _________________________________ Getters
    public int getValor()
    {
        return valor;
    }
}