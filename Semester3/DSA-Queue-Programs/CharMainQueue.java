import java.util.*;

class charqueue{
    char q[];
    int max;
    int f;
    int r;

    charqueue(int m){
        max = m;
        f = 0;
        r = -1;
        q = new char[m];
    }

    boolean isEmpty(){
        if (f == 0 && r == -1){
            return true;
        }
        else{
            return false;
        }
    }

    boolean isFull(){
        if (r == max - 1){
            return true;
        }
        else{
            return false;
        }
    }

    void enqueue(char a){
        if (isFull()){
            System.out.println("Overflow");
        }
        else{
            r = r + 1;
            q[r] = a;
        }
    }

    char dequeue(){
        if (isEmpty()){
            System.out.println("Underflow");
            return '\0';
        }
        else if (f == r){
            char temp = q[f];
            f = 0;
            r = -1;
            return temp;
        }
        else{
            char temp = q[f];
            f = f + 1;
            return temp;
        }
    }

    void display(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            for (int i = f; i <= r; i++) {
                System.out.println(q[i]);
            }
        }
    }
}

public class CharMainQueue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int m = sc.nextInt();
        charqueue q = new charqueue(m);
        int choice;
        do{
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter the character: ");
                    char a = sc.next().charAt(0);
                    q.enqueue(a);
                    break;
                case 2:
                    char x = q.dequeue();
                    if (x != '\0') {
                        System.out.println("Deleted element: " + x);
                    }
                    break;
                case 3:
                    System.out.println("Queue elements:");
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}