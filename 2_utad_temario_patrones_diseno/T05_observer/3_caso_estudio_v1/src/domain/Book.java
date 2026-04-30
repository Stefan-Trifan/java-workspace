package domain;

public class Book
{
    // ------------------------------- Atributos

    private String titulo;
    private String autor;

    // --------------------------- Constructores

    public Book(String titulo, String autor)
    {
        this.titulo = titulo;
        this.autor = autor;
    }

    // --------------------------------- Getters

    public String getTitulo()
    {
        return titulo;
    }

    public String getAutor()
    {
        return autor;
    }
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    // ------------------------ Métodos Privados
}
