public class Rectangle extends GeometricFigure
{
    // _______________________________ Atributos
    private int base;
    private int altura;

    // ___________________ Constructor Principal
    public Rectangle(String tag, int base, int altura)
    {
        super(tag);
        this.base = base;
        this.altura = altura;
    }

    // ________________ Constructores Auxiliares
    // _________________________________ Getters
    public int getBase()
    {
        return base;
    }

    public int getAltura()
    {
        return altura;
    }

    // _________________________________ Setters
    public void setBase(int base)
    {
        this.base = base;
    }

    public void setAltura(int altura)
    {
        this.altura = altura;
    }

    // ________________________ Métodos Públicos
    public String getFigureType()
    {
        return "Rectangle";
    }

    public Double area()
    {
        return (double) base * altura;
    }

    public void drawTxt()
    {
        for (int i = 0; i < altura; i++)
        {
            for (int j = 0; j < base; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // ________________________ Métodos Privados
}
