package e4_efecto_cascada;

class HexadecimalObsever implements Observer
{
    public void update(Numero s)
    {
        System.out.println("Hexadecimal: " + Integer.toHexString(s.getValor()));
    }
}