package e16_generics;

import java.util.ArrayList;
import java.util.List;

public class Numero implements Subject<Integer>
{
    // ------------------------------- Atributos
    private List<Observer<Integer>> observers;
    private Integer        valor;

    // --------------------------- Constructores
    public Numero()
    {
        this(0);
    }

    public Numero(Integer valor)
    {
        this(valor, new ArrayList<Observer<Integer>>());
    }

    public Numero(Integer valor, List<Observer<Integer>> observers)
    {
        super();
        this.valor = valor;
        this.observers = observers;
    }

    // ------------------------ Métodos Públicos

    @Override
    public Integer getState()
    {
        return this.valor;
    }

    @Override
    public void setState(Integer object)
    {
        this.valor = object;
        this.notifyObservers();
    }

    @Override
    public void addObserver(Observer<Integer> observer)
    {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<Integer> observer)
    {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers()
    {
        for (Observer<Integer> observer : this.observers)
        {
            observer.update(this, this.valor);
        }
    }
}
