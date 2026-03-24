import java.util.Observer;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        PullModelObservable model = new PullModelObservable();

        Observer observerRadio = new PullModelObserver("Radio channel");

        Observer observerTV = new PullModelObserver("TV channel");

        // todo Crear otro observador (Chat channel)
        Observer observerChat = new PullModelObserver("Chat channel");

        model.addObserver(observerRadio);
        model.addObserver(observerTV);
        model.addObserver(observerChat);

        model.setWeatherState("It's bright and sunny... Let's play football!!");

        model.setWeatherState("It's raining heavily!... Let's play GO game!!");

        System.out.println("\n_______________________END\n");
    }
}