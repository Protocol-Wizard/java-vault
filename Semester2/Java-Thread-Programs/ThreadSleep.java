public class ThreadSleep extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number : " + i);
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }

    public static void main(String[] args) {
        ThreadSleep t = new ThreadSleep();
        t.start();
    }
}