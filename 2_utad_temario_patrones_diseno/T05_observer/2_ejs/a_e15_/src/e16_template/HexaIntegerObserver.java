package e16_template;

public class HexaIntegerObserver implements Observer
{
    public void update(Subject subject, int valor)
    {
        Numero numero = (Numero) subject;
        System.out.println("Pull Binario: " + Integer.toHexString(numero.getValor()));
        System.out.println("Push Binario: " + Integer.toHexString(valor));
    }
}
