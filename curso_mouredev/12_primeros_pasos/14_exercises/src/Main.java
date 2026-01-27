public class Main {
    public static void main(String[] args) {
        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("1");
        System.out.println("Stefan Trifan\n");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.

        System.out.println("2");
        System.out.println("Hola" + "\n" + "Mundo\n");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.out.println("6");
        System.out.flush();
        System.err.println("Error\n");

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("7");
        System.out.println("Frase 1");
        System.out.println("Frase 2\n");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("8");
        System.out.println(":)\n");

        // 9. Intenta ejecutar el programa sin el métødo main y observa el error.
        System.out.println("9");

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        System.out.println("10");
    }
}