public class Car
{
    // Atributos
    private double speed = 0;

    // Constructores

    // Getters
    public double getSpeed()
    {
        return this.speed;
    }

    // Setters

    // Métodos públicos
    public void accelerate(int amount)
    {
        if (amount + speed <= 120)
        {
            speed += amount;
        }
        else
        {
            System.out.println("Velocidad máxima alcanzada");
        }
    }

    public void brake(int amount)
    {
        if (speed - amount >= 0)
        {
            speed -= amount;
        }
        else
        {
            System.out.println("No puedes frenar tanto es demasiado");
        }
    }

    // Métodos privados
}
