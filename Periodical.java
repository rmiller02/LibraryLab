public class Periodical extends LibraryItem {
    boolean Audio;

    public Periodical(String genre, String author, Integer pages, boolean audio) {
        super(genre, author, pages);
        Audio = audio;
    }

    public boolean isAudio() {
        return Audio;
    }

    public void setAudio(boolean audio) {
        Audio = audio;
    }

    
}