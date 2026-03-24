// package e16;

// public class Main
// {
//     public static void main(String[] args)
//     {
//         System.out.println("\n_______________________START\n");

//         Subject subject = new Numero();

//         Observer binario = new BinarioObserver(subject);
//         Observer octal = new OctalObsever(subject);
//         Observer hexadecimal = new HexadecimalObsever(subject);

//         subject.addObserver(binario, octal, hexadecimal);
//         subject.setValor(11);

//         System.out.println();

//         subject.removeObserver(hexadecimal);
//         subject.setValor(14);

//         System.out.println("\n_______________________END\n");
//     }
// }