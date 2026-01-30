public class Product
{
    // Atributos
    private double price;

    // Setter
    public void setPrice(double price)
    {
        if (price >= 0)
        {
            this.price = price;
        }
    }

    // Getter
    public double getPrice()
    {
        return this.price;
    }
}
