public class CD extends LibraryItem implements LoanItem
{
    private String band;
    private String title;
    private int numTracks;

    public CD(String ID, String type, String band, String title, int numTracks)
        {
            super(ID, type);
            setBand(band);
            setTitle(title);
            setNumTracks(numTracks);
        }

    public String getBand() {
        return band;
    }

    public void setBand(String author) {
        this.band = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumTracks() {
        return numTracks;
    }

    public void setNumTracks(int numPages) {
        this.numTracks = numPages;
    }
    public void calculatePrice()
        {
            System.out.println("Price is " + (getNumTracks() * 1));
        }
}

