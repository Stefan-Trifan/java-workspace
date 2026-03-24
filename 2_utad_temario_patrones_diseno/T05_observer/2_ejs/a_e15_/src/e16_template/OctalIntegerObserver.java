package e16_template;

public class OctalIntegerObserver implements Observer
{
    public void update(Subject subject, int valor)
    {
        System.out.println("Pull Binario: " + Integer.toOctalString(subject.getValor()));
        System.out.println("Push Binario: " + Integer.toOctalString(valor));
    }
}
