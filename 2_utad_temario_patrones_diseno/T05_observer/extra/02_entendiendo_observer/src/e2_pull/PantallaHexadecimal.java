package e2_pull;

class HexadecimalObsever implements Observer
{
    private Numero subject;

    public HexadecimalObsever(Numero subject)
    {
        this.subject = subject;
    }

    public void update()
    {
        System.out.println("Hexadecimal: " + Integer.toHexString(subject.getValor()));
    }
}