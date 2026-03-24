import java.util.Observable;

public class PullModelObservable extends Observable
{
    public static final String DEFAULT_STATE = "N/A";

    protected String weatherState; // variable de estado

    public PullModelObservable()
    {
        this(PullModelObservable.DEFAULT_STATE);
    }

    public PullModelObservable(String weatherState)
    {
        super();
        this.weatherState = weatherState;
    }

    public String getWeatherState()
    {
        return this.weatherState;
    }

    public void setWeatherState(String weatherState)
    {
        this.weatherState = weatherState;

        this.setChanged();     // invocación requerida
        this.notifyObservers();
        // similar a PullSubject
    }
}