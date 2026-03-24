package e5_java_util_observable_;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Numero subject = new Numero();

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
	1.	💣 Efecto cascada
	2.	⚡ Observer vs polling o POLLING vs NOTIFICACIÓN
	3.	📡 Difusión (broadcast)
	4.	🌍 Uso real (eventos, sistemas reactivos) o OBSERVER COMO SISTEMA DE EVENTOS
	5.	🔁 Híbrido bien entendido VARIANTE PULL/PUSH COMPLETA (MUY IMPORTANTE)
	6.	🧩 UML mental completo
	7.	🔀 Comparación con otros patrones
*/