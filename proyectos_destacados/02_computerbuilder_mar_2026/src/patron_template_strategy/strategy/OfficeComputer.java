package patron_template_strategy.strategy;

public class OfficeComputer implements ComputerConfigurationStrategy
{
    public int getRAM()
    {
        return 8;
    }   
    public int getAlmacenamiento()
    {
        return 16;
    }
    public String toString()
    {
        return "Office Computer";
    }
}
