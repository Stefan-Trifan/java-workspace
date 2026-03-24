package e16_generics;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Subject<Integer> subject = new Numero();

        // Crea los observadores
        Observer<Integer> binaryIntegerObserver = new BinaryIntegerObserver();
        Observer<Integer> hexaIntegerObserver = new HexaIntegerObserver();
        Observer<Integer> octalIntegerObserver = new OctalIntegerObserver();

        subject.addObserver(binaryIntegerObserver);
        subject.addObserver(hexaIntegerObserver);
        subject.addObserver(octalIntegerObserver);

        System.out.println("First valor value ***************");
        System.out.println("Valor decimal value: 11");

        subject.setState(11);

        System.out.println("Second valor value ***************");
        System.out.println("Valor decimal value: 14");

        subject.setState(14);

        System.out.println("\n_______________________END\n");
    }
}
