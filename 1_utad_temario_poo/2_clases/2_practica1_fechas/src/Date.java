import java.util.Calendar;

public class Date
{
    // _________________________________________
    // Atributos
    private int day;
    private int month;
    private int year;

    // _________________________________________
    // Constructor Principal
    public Date(Integer day, Integer month, Integer year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // _________________________________________
    // Constructores Auxiliares
    public Date()
    {
        this(currentDay(), currentMonth(), currentYear());
    }

    public Date(String day)
    {
        this(Integer.parseInt(day), currentMonth(), currentYear());
    }

    public Date(Integer day)
    {
        this(day, currentMonth(), currentYear());
    }

    public Date(Integer day, Integer month)
    {
        this(day, month, currentYear());
    }

    // _________________________________________
    // Getters
    public int getDay()
    {
        return this.day;
    }

    public int getMonth()
    {
        return this.month;
    }

    public int getYear()
    {
        return this.year;
    }

    // _________________________________________
    // Setters
    public void setDay(int day)
    {
        this.day = day;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    // _________________________________________
    // Métodos Públicos
    public String toString()
    {
        return "día "
            + this.day + " de " + this.monthToString() + " de "
            + this.year;
    }

    public int compareTo(Date otherDate)
    {
        if (this.year != otherDate.getYear())
            if (this.year > otherDate.getYear())
                return 1;
            else
                return -1;
        else if (this.month != otherDate.getMonth())
            if (this.month > otherDate.getMonth())
                return 1;
            else
                return -1;
        else if (this.day > otherDate.getDay())
            return 1;
        else if (this.day == otherDate.getDay())
            return 0;
        else
            return -1;
    }

    // Devuelve los días del mes indicado
    public Integer diasMes(Integer month)
    {
        switch (month) {
            case 1: return 31;
            case 2: return 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return -1;
        }
    }

    // Devuelve los días del mes actual
    public Integer diasMes()
    {
        return diasMes(this.month);
    }

    // _________________________________________
    // Métodos Privados
    private static int currentDay()
    {
        return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    }

    private static int currentMonth()
    {
        return Calendar.getInstance().get(Calendar.MONTH) + 1;
    }

    private static int currentYear()
    {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    private String monthToString()
    {
        switch (this.month) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return "Mes inválido";
        }
    }
}
