public class Magazine extends Periodical {
    String Topic, Articles;

    public Magazine(String topic, String articles) {
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