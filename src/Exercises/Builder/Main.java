package Exercises.Builder;

public class Main {
    public static void main(String[] args) {
        // TODO: Create a new user using the UserBuilder class
        // the created user should have following properties:
        // firstName: John; lastName: Doe; age: 20; phone: 1234567890; address: null (not set)
        User user = null;

        // Expected output: User{firstName='John', lastName='Doe', age=20, phone='1234567890', address='null'}
        System.out.println(user);
    }
}
