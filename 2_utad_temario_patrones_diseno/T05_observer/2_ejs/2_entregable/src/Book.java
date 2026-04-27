public class Book
{
    // _______________________________ Atributos
    private String    nombre;
    private String    autor;
    private BookState estado;

    // ___________________________ Constructores
    public Book(String nombre, String autor, BookState estado)
    {
        this.nombre = nombre;
        this.autor = autor;
        this.estado = estado;
    }

    // _________________________________ Getters
    public BookState getEstado()
    {
        return estado;
    }

    // _________________________________ Setters
    // ________________________ Métodos Públicos
    @Override
    public String toString()
    {
        return "nombre: " + this.nombre + "| autor: " + this.autor;
    }
    // ________________________ Métodos Privados
}
