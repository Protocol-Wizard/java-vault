public class ThreadDetails extends Thread {

    public void run() {
        System.out.println("--- Inside Thread ---");
        System.out.println("Thread Name     : " + Thread.currentThread().getName());
        System.out.println("Thread Priority : " + Thread.currentThread().getPriority());

        if (Thread.currentThread().getPriority() == Thread.MIN_PRIORITY) {
            System.out.println("This is the LOW  PRIORITY thread (MIN = 1)");
        } else if (Thread.currentThread().getPriority() == Thread.MAX_PRIORITY) {
            System.out.println("This is the HIGH PRIORITY thread (MAX = 10)");
        } else {
            System.out.println("This is the NORMAL PRIORITY thread (NORM = 5)");
        }
    }

    public static void main(String[] args) {

        ThreadDetails t1 = new ThreadDetails();
        ThreadDetails t2 = new ThreadDetails();
        ThreadDetails t3 = new ThreadDetails();

        t1.setName("Low Priority Thread");
        t2.setName("Normal Priority Thread");
        t3.setName("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        System.out.println("--- Before Start ---");
        System.out.println("T1 Name     : " + t1.getName() + " | Priority : " + t1.getPriority());
        System.out.println("T2 Name     : " + t2.getName() + " | Priority : " + t2.getPriority());
        System.out.println("T3 Name     : " + t3.getName() + " | Priority : " + t3.getPriority());
        System.out.println("MIN Priority : " + Thread.MIN_PRIORITY);
        System.out.println("MAX Priority : " + Thread.MAX_PRIORITY);
        System.out.println();

        t1.start();
        t2.start();
        t3.start();
    }
}
