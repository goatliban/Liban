package library;

public abstract class LibraryItem {
    protected String title;
    protected int daysLate;

    public LibraryItem() {
        this.title = "Unknown";
        this.daysLate = 0;
    }

    public LibraryItem(String title, int daysLate) {
        this();
        this.title = title;
        this.daysLate = daysLate;
    }

    public String getTitle() {
        return title;
    }

    public abstract long calculateFine();
}
