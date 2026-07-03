package singletone;

public class singletoneExample {

    private static singletoneExample instance;

    private singletoneExample() {
    }

    public static singletoneExample getInstance() {
        if (instance == null) {
            instance = new singletoneExample();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Pattern");
    }
}