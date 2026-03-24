package e16_generics;

public class OctalIntegerObserver implements Observer<Integer>
{
    public void update(Subject<Integer> subject, Integer valor)
    {
        System.out.println("Pull Octal: " + Integer.toOctalString(subject.getState()));
        System.out.println("Push Octal: " + Integer.toOctalString(valor));
    }
}
