public class GeneralBook extends Book {
    String type;

    public GeneralBook(String genre, String author, Integer pages, int retailPrice, int releaseDate,
            String bookLocation, String stocked, String type) {
        super(genre, author, pages, retailPrice, releaseDate, bookLocation, stocked);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    
}