package e5_java_util_observable;

class HexadecimalObsever implements Observer
{
    public void update(Numero s)
    {
        System.out.println("Hexadecimal: " + Integer.toHexString(s.getValor()));
    }
}