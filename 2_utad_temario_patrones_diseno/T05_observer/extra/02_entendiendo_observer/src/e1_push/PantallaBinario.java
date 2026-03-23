package e1_push;
class BinarioObserver implements Observer
{
    public void update(int valor)
    {
        System.out.println("Binario: " + Integer.toBinaryString(valor));
    }
}