public class EdificioOficinas implements Edificio
{
    // ------------------------------- Atributos
    double numOficinas;
    double superficie;
    // ___________________ Constructor Principal
    public EdificioOficinas(double superficie, double numOficinas)
    {
        this.superficie = superficie;
        this.numOficinas = numOficinas;
    }
    // ________________ Constructores Auxiliares
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public double getSuperficieEdificio()
    {
        return this.superficie;
    }
}
