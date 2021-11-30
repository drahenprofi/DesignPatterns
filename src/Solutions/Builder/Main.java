package Solutions.Builder;

public class Main {
    public static void main(String[] args) {
        User user = new UserBuilder("John", "Doe")
                .age(20)
                .phone("1234567890")
                .build();

        // Expected output: User{firstName='John', lastName='Doe', age=20, phone='1234567890', address='null'}
        System.out.println(user);
    }
}
