package e2_pull;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Numero subject = new Numero();

        Observer binario = new BinarioObserver(subject);
        Observer octal = new OctalObsever(subject);
        Observer hexadecimal = new HexadecimalObsever(subject);

        subject.addObserver(binario, octal, hexadecimal);
        subject.setValor(10);

        System.out.println();

        subject.removeObserver(hexadecimal);
        subject.setValor(25);

        System.out.println("\n_______________________END\n");
    }
}