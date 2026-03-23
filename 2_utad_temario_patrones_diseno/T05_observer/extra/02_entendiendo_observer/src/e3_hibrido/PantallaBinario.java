package e3_hibrido;

class BinarioObserver implements Observer
{
    public void update(Numero s)
    {
        System.out.println("Binario: " + Integer.toBinaryString(s.getValor()));
    }
}