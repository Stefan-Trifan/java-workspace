package e3_hibrido;

class HexadecimalObsever implements Observer
{
    public void update(Numero s)
    {
        System.out.println("Hexadecimal: " + Integer.toHexString(s.getValor()));
    }
}