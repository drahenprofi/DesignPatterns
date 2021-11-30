package Exercises.Observer;

public class Main {
    public static void main(String[] args) {
        // TODO: Create NewsAgency and NewsChannel object
        NewsAgency agency = null;
        NewsChannel channel = null;

        // TODO: Add channel to list of agency observers

        // Expected output: News channel received news: 'Some very important news'
        agency.setNews("Some very important news");
    }
}
