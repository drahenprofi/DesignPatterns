package Solutions.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private List<NewsObserver> observers = new ArrayList<>();

    public void addObserver(NewsObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(NewsObserver observer) {
        observers.remove(observer);
    }

    public void setNews(String news) {
        this.news = news;

        for (NewsObserver observer : observers) {
            observer.update(this.news);
        }
    }
}
