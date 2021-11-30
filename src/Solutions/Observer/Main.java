package Solutions.Observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        NewsChannel channel = new NewsChannel();

        agency.addObserver(channel);

        // Expected output: News channel received news: 'Some very important news'
        agency.setNews("Some very important news");
    }
}
