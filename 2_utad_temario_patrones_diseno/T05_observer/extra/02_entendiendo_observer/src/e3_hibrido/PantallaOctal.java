package e3_hibrido;

class OctalObsever implements Observer
{
    public void update(Numero s)
    {
        System.out.println("Octal: " + Integer.toOctalString(s.getValor()));
    }
}