package e16_template;

public class BinaryIntegerObserver implements Observer
{
    public void update(Subject subject, int valor)
    {
        Numero numero = (Numero) subject;
        System.out.println("Pull Binario: " + Integer.toBinaryString(numero.getValor()));
        System.out.println("Push Binario: " + Integer.toBinaryString(valor));
    }
}
