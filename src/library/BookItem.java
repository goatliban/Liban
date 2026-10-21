package library;

public class BookItem extends LibraryItem  {
    public BookItem(String title, int daysLate){
        super(title,daysLate);
    }

    @Override
    public long calculateFine() {
        return daysLate * 2;
    }
}
