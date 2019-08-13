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
        String message = "Hello World!";
        message = message + " Additional string";
        System.out.println(message);
    }
}
