public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("\n_______________________START\n");

        Punto origenCoordenadas = new Punto();
        System.out.println("Objeto centro: " + origenCoordenadas.toString());

        Punto punto3 = new Punto(3, 0);
        System.out.println("Objeto centro: " + punto3.toString());

        Punto punto55 = new Punto(5, 5);
        System.out.println("Objeto centro: " + punto55.toString());

        System.out.println(
            "Distancia euclidea del centro al punto (3,0) = "
                + origenCoordenadas.distanciaEuclidea(punto3));

        System.out.printf(
            "Distancia euclidea del centro al punto (5,5) = %.2f%n",
            origenCoordenadas.distanciaEuclidea(punto55));

        System.out.println(
            "Distancia Manhattan del centro al punto (3,0) = "
                + origenCoordenadas.distanciaManhattan(punto3));

        System.out.printf(
            "Distancia Manhattan del centro al punto (5,5) = %.2f%n",
            origenCoordenadas.distanciaManhattan(punto55));

        System.out.println("\n_______________________END\n");
    }
}