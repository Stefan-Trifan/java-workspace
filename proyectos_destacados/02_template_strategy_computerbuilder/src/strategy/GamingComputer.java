package strategy;

public class GamingComputer implements ComputerConfigurationStrategy
{
    public int getRAM()
    {
        return 64;
    }

    public int getAlmacenamiento()
    {
        return 2048;
    }

    public String toString()
    {
        return "Gaming Computer";
    }
}
