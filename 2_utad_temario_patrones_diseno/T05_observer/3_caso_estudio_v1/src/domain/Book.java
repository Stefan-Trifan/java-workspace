package domain;

public class Book
{
    // _______________________________ Atributos

    private String titulo;
    private String autor;

    // ___________________________ Constructores

    public Book(String titulo, String autor)
    {
        this.titulo = titulo;
        this.autor = autor;
    }

    // _________________________________ Getters

    public String getTitulo()
    {
        return titulo;
    }

    public String getAutor()
    {
        return autor;
    }
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    // ________________________ Métodos Privados
}
