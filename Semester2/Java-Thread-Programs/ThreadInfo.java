public class ThreadInfo extends Thread {
    public void run() {
        System.out.println("--- Inside Thread ---");
        System.out.println("Thread Name     : " + Thread.currentThread().getName());
        System.out.println("Thread Priority : " + Thread.currentThread().getPriority());
        System.out.println("Thread State    : " + Thread.currentThread().getState());
    }
    public static void main(String[] args) {
        ThreadInfo t = new ThreadInfo();
        t.setName("MyThread");
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
    }
}