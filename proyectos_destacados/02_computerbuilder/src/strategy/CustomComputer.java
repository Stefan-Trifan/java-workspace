package strategy;

public class CustomComputer implements ComputerConfigurationStrategy
{
    private int ram;
    private int almacenamiento;

    public CustomComputer(int ram, int almacenamiento)
    {
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public int getRAM()
    {
        return ram;
    }

    public int getAlmacenamiento()
    {
        return almacenamiento;
    }

    public String toString()
    {
        return "Custom";
    }
}
