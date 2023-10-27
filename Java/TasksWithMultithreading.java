package Java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TasksWithMultithreading {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 2; i++) {
            es.execute(new MyTask1());
            es.execute(new MyTask2());
        }
        es.shutdown();
    }
}

class MyTask1 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(900);
            System.out.println("Task 1 just ran...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyTask2 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(700);
            System.out.println("Task 2 just ran...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
