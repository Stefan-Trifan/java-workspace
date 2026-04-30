public class Library
{
    // ------------------------------- Atributos
    private BookAlarm bookAlarm;

    // --------------------------- Constructores
    public Library()
    {
        this.bookAlarm = new BookAlarm();
    }
    // --------------------------------- Getters
    public BookAlarm getBookAlarm()
    {
        return bookAlarm;
    }
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public void returnBook(Book book)
    {
        if (book.getEstado() == BookState.BAD)
        {
            bookAlarm.setBook(book);
            bookAlarm.notifyObservers();
        }
    }
    // ------------------------ Métodos Privados
}
