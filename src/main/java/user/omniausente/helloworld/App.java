package user.omniausente.helloworld;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String message = "Hello";
        System.out.println(message);
        String message_append = " World!";
        System.out.println(message_append);
        message = message + message_append;
        System.out.println(message);
    }
}
