public class Library
{
    // _______________________________ Atributos
    private BookAlarm bookAlarm;

    // ___________________________ Constructores
    public Library()
    {
        this.bookAlarm = new BookAlarm();
    }
    // _________________________________ Getters
    public BookAlarm getBookAlarm()
    {
        return bookAlarm;
    }
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public void returnBook(Book book)
    {
        if (book.getEstado() == BookState.BAD)
        {
            bookAlarm.setBook(book);
            bookAlarm.notifyObservers();
        }
    }
    // ________________________ Métodos Privados
}
