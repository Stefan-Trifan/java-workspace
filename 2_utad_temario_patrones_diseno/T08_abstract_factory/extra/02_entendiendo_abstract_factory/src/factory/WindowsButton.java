package factory;

class WindowsButton implements Button
{
    public void render()
    {
        System.out.println("╭──────────╮");
        System.out.println("│ Ver Aquí │ Windows");
        System.out.println("╰──────────╯");
    }
}