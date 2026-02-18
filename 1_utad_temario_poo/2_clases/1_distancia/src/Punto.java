public class Punto
{
    // Atributos
    private double x;
    private double y;

    // Constructores
    public Punto()
    {
        this.x = 0;
        this.y = 0;
    }

    public Punto(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    // Setters
    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    // Métodos públicos
    @Override
    public String toString()
    {
        return "(x = " + x + "),(y = " + y + ")";
    }
    
    public double distanciaEuclidea(Punto punto)
    {
        double distancia = 0;

        distancia = Math.sqrt(
            Math.pow((punto.getX() - this.x), 2) + 
            Math.pow((punto.getY() - this.y), 2)
        );
        
        return distancia;
    }

    public double distanciaManhattan(Punto punto)
    {
        double distancia = 0;

        distancia = 
            Math.abs(punto.getX() - this.x) + 
            Math.abs(punto.getY() - this.y);
        
        return distancia;
    }

    // Métodos privados
}
