public abstract class LibraryItem implements LoanItem
{
    private String type;
    private String ID;

    public LibraryItem(String ID, String type) {
        setID(ID);
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String toString()
        {
            return "Type: " + getType() + "ID: " + getID();
        }
    public abstract void calculatePrice();
}
