public class SingletonSoup
{
    // ------------------------------- Atributos
    private static SingletonSoup singletonSoup = new SingletonSoup();
    // --------------------------- Constructores
    private SingletonSoup() {}  // privado
    // --------------------------------- Setters
    // --------------------------------- Getters
    public static SingletonSoup getInstance() {
        return singletonSoup;
    }
    // ------------------------ Métodos Públicos
    public void ready() {
        System.out.println("Singleton Soup is ready");
    }

    public void ready(String info) {
        System.out.println("Singleton Soup is ready with " + info);
    }
}
