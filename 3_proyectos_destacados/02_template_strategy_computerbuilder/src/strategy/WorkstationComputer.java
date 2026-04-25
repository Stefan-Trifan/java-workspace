package strategy;

public class WorkstationComputer implements ComputerConfigurationStrategy
{
    public int getRAM()
    {
        return 32;
    }

    public int getAlmacenamiento()
    {
        return 1024;
    }

    public String toString()
    {
        return "Workstation Computer";
    }
}
