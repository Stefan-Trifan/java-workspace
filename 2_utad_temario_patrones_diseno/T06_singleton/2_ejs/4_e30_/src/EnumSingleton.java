public enum EnumSingleton
{
    INSTANCE("enum singleton data");
    // ------------------------------- Atributos
    private String info;
    // --------------------------- Constructores
    private EnumSingleton(String info) {
        this.info = info;
    }
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
