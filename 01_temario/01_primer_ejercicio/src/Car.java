public class Car {
    private String marca;
    private String modelo;
    private String color;

    public Car(String marca, String modelo, String color) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void avanzar() {
        System.out.println("avanzando...");
    }

    public void parar() {
        System.out.println("Parado");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Peugeot", "208", "rojo");
        Car yourCar = new Car("Land Rover", "Discovery", "gris");
        // movemos el Peugeot
        myCar.avanzar();
    }
}
