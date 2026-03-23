package e1_push;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        NumSubject subject = new NumSubject();

        Observer binario = new BinarioObserver();
        Observer octal = new OctalObsever();
        Observer hexadecimal = new HexadecimalObsever();

        subject.addObserver(binario, octal, hexadecimal);
        subject.setValor(10);

        System.out.println();

        subject.removeObserver(hexadecimal);
        subject.setValor(25);

        System.out.println("\n_______________________END\n");
    }
}

/*
    Tareas ChatGPT Ignora esto:
        remove observer
        pull vs push
*/