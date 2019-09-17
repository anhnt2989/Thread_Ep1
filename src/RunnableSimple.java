public class RunnableSimple implements Runnable {
    @Override
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        RunnableSimple runnableSimple = new RunnableSimple();
        Thread t = new Thread(runnableSimple);
        t.start();
    }
}
