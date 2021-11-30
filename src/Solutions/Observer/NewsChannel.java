package Solutions.Observer;

public class NewsChannel implements NewsObserver {
    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        System.out.println("News channel received news: '" + news + "'");
    }
}
