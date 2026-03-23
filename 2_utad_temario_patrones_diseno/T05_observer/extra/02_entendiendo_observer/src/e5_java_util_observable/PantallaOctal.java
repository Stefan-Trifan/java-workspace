package e5_java_util_observable;

class OctalObsever implements Observer
{
    public void update(Numero s)
    {
        System.out.println("Octal: " + Integer.toOctalString(s.getValor()));
    }
}