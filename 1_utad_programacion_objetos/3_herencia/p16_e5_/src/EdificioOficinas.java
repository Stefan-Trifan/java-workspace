public class EdificioOficinas implements Edificio
{
    // _______________________________ Atributos
    double numOficinas;
    double superficie;
    // ___________________ Constructor Principal
    public EdificioOficinas(double superficie, double numOficinas)
    {
        this.superficie = superficie;
        this.numOficinas = numOficinas;
    }
    // ________________ Constructores Auxiliares
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public double getSuperficieEdificio()
    {
        return this.superficie;
    }
}
