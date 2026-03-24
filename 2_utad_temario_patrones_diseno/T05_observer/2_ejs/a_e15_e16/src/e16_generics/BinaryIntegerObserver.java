package e16_generics;

public class BinaryIntegerObserver implements Observer<Integer>
{
    public void update(Subject<Integer> subject, Integer valor)
    {
        System.out.println("Pull Binario: " + Integer.toBinaryString(subject.getState()));
        System.out.println("Push Binario: " + Integer.toBinaryString(valor));
    }
}
