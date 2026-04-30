public enum EnumClassDay
{
    LUNES(19,21),
    MARTES(19,21),
    VIERNES(19,21);

    // ------------------------------- Atributos
    private int hora_comienzo;
    private int hora_salida;

    // --------------------------- Constructores
    private EnumClassDay(int hora_comienzo, int hora_salida)
    {
        this.hora_comienzo = hora_comienzo;
        this.hora_salida = hora_salida;
    }
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public int getStartHour()
    {
        return this.hora_comienzo;
    }
    // ------------------------ Métodos Privados
}
