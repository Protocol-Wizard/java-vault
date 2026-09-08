public class ThreadNaming extends Thread {

    public void run() {
        System.out.println("Running Thread : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadNaming t1 = new ThreadNaming();
        ThreadNaming t2 = new ThreadNaming();

        t1.setName("First Thread");
        t2.setName("Second Thread");

        t1.start();
        t2.start();
    }
}