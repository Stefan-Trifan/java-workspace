package e16_generics;

public class HexaIntegerObserver implements Observer<Integer>
{
    public void update(Subject<Integer> subject, Integer valor)
    {
        System.out.println("Pull Hexa: " + Integer.toHexString(subject.getState()));
        System.out.println("Push Hexa: " + Integer.toHexString(valor));
    }
}
