public class Employee
{
    // Atributos
    private double salary;

    // Constructores
    public Employee(double salary)
    {
        this.salary = salary;
    }

    // Getters
    public double getSalary()
    {
        return salary;
    }

    // Setters

    // Métodos públicos
    public void raiseSalary(double percent)
    {
        if (percent >= 0)
        {
            this.salary += this.salary * percent;
        }
    }

    // Métodos privados
}
