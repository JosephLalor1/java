public class LibraryDriver 
{
    public static void main(String args[])
        {
            LibraryItem[] list = new LibraryItem[2];
            Book book = new Book("W11", "Book", "JRR Tolkien", "The Lord Of the Rings", 200);
            CD cd = new CD("W12", "CD", "The Pogues", "Rum, Sodomy and the Lash", 12);
            list[0] = book;
            list[1] = cd;

            list[0].calculatePrice();
        }
}
