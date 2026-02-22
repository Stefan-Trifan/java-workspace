public abstract class GeometricFigure implements Figure
{
    // _______________________________ Atributos
    private String tag;

    // ___________________ Constructor Principal
    public GeometricFigure(String tag)
    {
        this.tag = tag;
    }

    // ________________ Constructores Auxiliares
    // _________________________________ Getters
    public final String getTag()
    {
        return tag;
    }

    // _________________________________ Setters
    public final void setTag(String tag)
    {
        this.tag = tag;
    }

    // ________________________ Métodos Públicos
    public final String printDescription()
    {
        return "Tag: " + getTag()
            + "\nFigure Type: " + getFigureType()
            + "\nArea: " + area();
    }
    // ________________________ Métodos Privados

}
