package e16_template;

public class OctalIntegerObserver implements Observer
{
    public void update(Subject subject, int valor)
    {
        Numero numero = (Numero) subject;
        System.out.println("Pull Binario: " + Integer.toOctalString(numero.getValor()));
        System.out.println("Push Binario: " + Integer.toOctalString(valor));
    }
}
