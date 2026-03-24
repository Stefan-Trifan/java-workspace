package e15;
class BinarioObserver implements Observer
{
    private Numero subject;

    public BinarioObserver(Numero subject)
    {
        this.subject = subject;
    }

    public void update()
    {
        System.out.println("Binario: " + Integer.toBinaryString(subject.getValor()));
    }
}