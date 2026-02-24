public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        TextFormatter formatter = new CapTextFormatter();
        TextEditor editor = new TextEditor(formatter);
        editor.fmt("Testing text in caps formatter");

        formatter = new LowerTextFormatter();
        editor = new TextEditor(formatter);
        editor.fmt("Testing text in lower formatter");

         System.out.println("\n_______________________END\n");
    }
}
