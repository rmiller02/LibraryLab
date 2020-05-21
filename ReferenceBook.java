public class ReferenceBook extends Book {
    boolean fiction, nonfiction;
    String subject;

    public ReferenceBook(String genre, String author, Integer pages, int retailPrice, int releaseDate,
            String bookLocation, String stocked, boolean fiction, boolean nonfiction, String subject) {
        super(genre, author, pages, retailPrice, releaseDate, bookLocation, stocked);
        this.fiction = fiction;
        this.nonfiction = nonfiction;
        this.subject = subject;
    }

    public boolean isFiction() {
        return fiction;
    }

    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }

    public boolean isNonfiction() {
        return nonfiction;
    }

    public void setNonfiction(boolean nonfiction) {
        this.nonfiction = nonfiction;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    
    
}