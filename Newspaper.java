public class Newspaper extends Periodical {
    private String location, reporter;

    public Newspaper(String location, String reporter) {
        this.location = location;
        this.reporter = reporter;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }
    
    
    
}