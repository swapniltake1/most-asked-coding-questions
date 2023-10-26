package Java;

public class DynamicThreadExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            
            // Creating threads dynamically using lambda expression
            Thread thread = new Thread(() -> {
                System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
            });
            thread.start(); // Start the thread
        }
    }
}

