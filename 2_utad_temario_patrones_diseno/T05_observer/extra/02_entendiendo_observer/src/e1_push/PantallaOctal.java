package e1_push;
class OctalObsever implements Observer
{
    public void update(int valor)
    {
        System.out.println("Octal: " + Integer.toOctalString(valor));
    }
}