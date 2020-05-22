public class Magazine extends Periodical {
    String Topic, Articles;

    public Magazine(String topic, String articles, String genre, String author, int pages, Boolean audio) {
        super(genre, author, pages, audio);
        Topic = topic;
        Articles = articles;
    }

    public String getTopic() {
        return Topic;
    }

    public void setTopic(String topic) {
        Topic = topic;
    }

    public String getArticles() {
        return Articles;
    }

    public void setArticles(String articles) {
        Articles = articles;
    }

    
}