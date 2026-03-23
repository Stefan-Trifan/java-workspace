package e1_push;
class HexadecimalObsever implements Observer
{
    public void update(int valor)
    {
        System.out.println("Hexadecimal: " + Integer.toHexString(valor));
    }
}