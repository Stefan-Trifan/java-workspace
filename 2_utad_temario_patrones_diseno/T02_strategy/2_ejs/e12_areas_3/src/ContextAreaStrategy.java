// Contexto

public class ContextAreaStrategy
{
    // _______________________________ Atributos
    GeometricArea miGeometricArea;

    // ___________________________ Constructores
    public ContextAreaStrategy(GeometricArea miGeometricArea)
    {
        this.miGeometricArea = miGeometricArea;
    }

    // ________________________ Métodos Públicos
    public double getArea()
    {
        return miGeometricArea.getArea();
    }

    public String toString()
    {
        return miGeometricArea.toString();
    }
}
