package e16_template;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Subject subject = new Numero();

        Numero ConcreteSubject = (Numero) subject;

        // Crea los observadores
        Observer binaryIntegerObserver = new BinaryIntegerObserver();
        Observer hexaIntegerObserver = new HexaIntegerObserver();
        Observer octalIntegerObserver = new OctalIntegerObserver();

        ConcreteSubject.addObserver(binaryIntegerObserver);
        ConcreteSubject.addObserver(hexaIntegerObserver);
        ConcreteSubject.addObserver(octalIntegerObserver);

        System.out.println("First valor value ***************");
        System.out.println("Valor decimal value: 11");

        ConcreteSubject.setValor(11);

        System.out.println("Second valor value ***************");
        System.out.println("Valor decimal value: 14");

        ConcreteSubject.setValor(14);

        System.out.println("\n_______________________END\n");
    }
}
