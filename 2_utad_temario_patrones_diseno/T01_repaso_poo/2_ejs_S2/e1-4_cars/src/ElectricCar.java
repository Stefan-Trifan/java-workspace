public class ElectricCar
{
    // _______________________________ Atributos
    private String marca;
    private String modelo;
    private String color;
    private Engine mEngine;

    // ___________________ Constructor Principal
    public ElectricCar(String marca, String modelo, String color)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.mEngine = new Engine();
    }

    // ________________ Constructores Auxiliares
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
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

    // ________________________ Métodos Privados
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        ElectricCar mElectricCar = new ElectricCar(
            "Tesla", 
            "Model 3", 
            "rojo");
            
        mElectricCar.encender();
        mElectricCar.avanzar();

        System.out.println("\n_______________________END\n");
    }
}
