package e4_efecto_cascada;

class OctalObsever implements Observer
{
    public void update(Numero s)
    {
        System.out.println("Octal: " + Integer.toOctalString(s.getValor()));
    }
}