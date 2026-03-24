import java.util.Observable;
import java.util.Observer;

public class PullModelObserver implements Observer
{
    protected String name;

    public PullModelObserver(String name)
    {
        super();
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object arg)
    {
        // El observador se asegura del tipo concreto
        System.out.println(
                "[Pull protocol " + this.name + "] " +
                ((PullModelObservable) observable).getWeatherState()
        );
    }
}