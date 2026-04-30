public abstract class GeometricFigure implements Figure
{
    // ------------------------------- Atributos
    private String tag;

    // ___________________ Constructor Principal
    public GeometricFigure(String tag)
    {
        this.tag = tag;
    }

    // ________________ Constructores Auxiliares
    // --------------------------------- Getters
    public final String getTag()
    {
        return tag;
    }

    // --------------------------------- Setters
    public final void setTag(String tag)
    {
        this.tag = tag;
    }

    // ------------------------ Métodos Públicos
    public final String printDescription()
    {
        return "Tag: " + getTag()
            + "\nFigure Type: " + getFigureType()
            + "\nArea: " + area();
    }
    // ------------------------ Métodos Privados

}
