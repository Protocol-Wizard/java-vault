public class ThreadSync {

    static boolean taskDone = false;

    synchronized static void producerTask() {
        System.out.println("Producer Thread : Starting task...");
        try {
            System.out.println("Producer Thread : Working... (sleeping for 10 seconds)");
            Thread.sleep(10000); // sleep for 10 seconds
            taskDone = true;
            System.out.println("Producer Thread : Task done! Notifying Consumer...");
            ThreadSync.class.notify(); // notify the waiting consumer thread
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted!");
        }
    }

    synchronized static void consumerTask() {
        try {
            while (!taskDone) {
                System.out.println("Consumer Thread : Waiting for Producer to finish...");
                ThreadSync.class.wait(); // wait until producer notifies
            }
            System.out.println("Consumer Thread : Producer finished! Now processing result.");
        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted!");
        }
    }

    public static void main(String[] args) {

        Thread producer = new Thread(() -> producerTask());
        Thread consumer = new Thread(() -> consumerTask());

        producer.setName("Producer");
        consumer.setName("Consumer");

        System.out.println("--- Program Started ---");

        consumer.start(); // start consumer first so it waits
        producer.start(); // producer starts working

        try {
            producer.join(); // main waits for producer to finish
            consumer.join(); // main waits for consumer to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        System.out.println("--- Program Ended ---");
    }
}