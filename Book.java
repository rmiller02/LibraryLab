//class properties
public class Book extends LibraryItem implements Reservable, Loanable {
    private int retailPrice;
    private int releaseDate;
    private String bookLocation;
    private String stocked;

    // Properties given contructors
    public Book(String genre, String author, Integer pages, int retailPrice, int releaseDate, String bookLocation,
            String stocked) {
        super(genre, author, pages);
        this.retailPrice = retailPrice;
        this.releaseDate = releaseDate;
        this.bookLocation = bookLocation;
        this.stocked = stocked;

    }

    
public int getRetailPrice() {
    return retailPrice;
}

public void setRetailPrice(int retailPrice) {
    this.retailPrice = retailPrice;
}

public int getReleaseDate() {
    return releaseDate;
}

public void setReleaseDate(int releaseDate) {
    this.releaseDate = releaseDate;
}

public String getBookLocation() {
    return bookLocation;
}

public void setBookLocation(String bookLocation) {
    this.bookLocation = bookLocation;
}

public String getStocked() {
    return stocked;
}

public void setStocked(String stocked) {
    this.stocked = stocked;
}

@Override
    public boolean isReservable() {
        return true;
    }

    @Override
    public int getReservationTime() {
        return 7;
    }

    @Override
    public boolean isLoanable() {
        return true;
    }









}