package e16_template;

import java.util.ArrayList;
import java.util.List;

public class Numero implements Subject
{
    // _______________________________ Atributos
    private List<Observer> observers;
    private Integer        valor;

    // ___________________________ Constructores
    public Numero()
    {
        this(0);
    }

    public Numero(Integer valor)
    {
        this(valor, new ArrayList<Observer>());
    }

    public Numero(Integer valor, List<Observer> observers)
    {
        super();
        this.valor = valor;
        this.observers = observers;
    }

    // ________________________ Métodos Públicos

    public Integer getValor()
    {
        return this.valor;
    }

    public void setValor(Integer valor)
    {
        this.valor = valor;
        this.notifyObservers();
    }

    @Override
    public void addObserver(Observer observer)
    {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer)
    {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers()
    {
        for (Observer observer : this.observers)
        {
            observer.update(this, this.valor);
        }
    }
}
