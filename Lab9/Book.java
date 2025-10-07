public class Book extends LibraryItem implements LoanItem
{
    private String author;
    private String title;
    private int numPages;

    public Book(String ID, String type, String author, String title, int numPages)
        {
            super(ID, type);
            setAuthor(author);
            setTitle(title);
            setNumPages(numPages);
        }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    public void calculatePrice()
        {
            System.out.println("Price is " + (getNumPages() * 0.5));
        }
}
