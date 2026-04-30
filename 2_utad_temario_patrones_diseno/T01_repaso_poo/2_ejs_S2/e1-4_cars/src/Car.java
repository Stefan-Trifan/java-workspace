public class Car
{
    // ------------------------------- Atributos
    private String marca;
    private String modelo;
    private String color;
    private Engine mEngine;

    // ___________________ Constructor Principal
    public Car(String marca, String modelo, String color, Engine mEngine)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.mEngine = mEngine;
    }

    // ________________ Constructores Auxiliares
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public void encender()
    {
        mEngine.encender();
    }

    public void avanzar()
    {
        System.out.println(toString() + " avanzando");
    }

    @Override
    public String toString()
    {
        return marca + " " + modelo + " " + color;
    }
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Engine electricEngine = new Engine("Electric");

        Car mCar = new Car("Tesla", 
            "Model 3", 
            "rojo",
            electricEngine);

        mCar.encender();
        mCar.avanzar();

        System.out.println("\n_______________________END\n");
    }
}
