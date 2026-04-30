public class HerencyElectricCar extends Car
{
    // ------------------------------- Atributos
    // ___________________ Constructor Principal
    public HerencyElectricCar(String marca, String modelo, String color)
    {
        super(marca, modelo, color, new Engine());
    }
    // ________________ Constructores Auxiliares
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    // ------------------------ Métodos Privados 
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Car miNuevoCar = new HerencyElectricCar(
            "Tesla", 
            "Model 3", 
            "rojo");

        miNuevoCar.encender();
        miNuevoCar.avanzar();

        System.out.println("\n_______________________END\n");
    }
}
