public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Library library = new Library();

        // Instancia los departamentos Stock, Admin y Compras como observadores
        Observer stock = new Stock();
        Observer compras = new Compras();
        Observer admin = new Administracion();

        // provoca que los departamentos se suscriban a la biblioteca
        library.getBookAlarm().attach(stock, compras, admin);

        Book bookBad = new Book(
            "Programar sin patrones",
            "desconocido",
            BookState.BAD);
        Book bookGood = new Book(
            "Gang of four Design patterns",
            "Erich Gamma, Richard Helm",
            BookState.GOOD);

        System.out.println("Alarma notifica bajo protocolo PULL-PUSH");

        library.returnBook(bookGood);
        library.returnBook(bookBad);

        // Provoca que el departamento de compras borre su suscripción.
        library.getBookAlarm().detach(compras);

        System.out.println("Alarma vuelve a notificar bajo protocolo PULL-PUSH");
        Book otherBookBad = new Book(
            "Programar sin pensar",
            "desconocido",
            BookState.BAD);
        library.returnBook(otherBookBad);

        System.out.println("\n_______________________END\n");
    }
}