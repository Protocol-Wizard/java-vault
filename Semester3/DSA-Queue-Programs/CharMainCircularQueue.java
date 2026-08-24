import java.util.*;

class charcircleq{
    char cq[];
    int max;
    int f;
    int r;

    charcircleq(int m){
        max = m;
        f = 0;
        r = -1;
        cq = new char[m];
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
        if (f == 0 && r == -1){
            return false;
        }
        else if (f == (r + 1) % max){
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
            r = (r + 1) % max;
            cq[r] = a;
        }
    }

    char dequeue(){
        if (isEmpty()){
            System.out.println("Underflow");
            return '\0';
        }

        else if (f == r){
            char temp = cq[f];
            f = 0;
            r = -1;
            return temp;
        }

        else{
            char temp = cq[f];
            f = (f + 1) % max;
            return temp;
        }
    }

    void display(){
        if (isEmpty()){
            System.out.println("Underflow");
        }
        else if (f <= r){
            for (int i = f; i <= r; i++){
                System.out.println(cq[i]);
            }
        }

        else{
            for (int k = f; k <= max - 1; k++){
                System.out.println(cq[k]);
            }
            for (int j = 0; j <= r; j++){
                System.out.println(cq[j]);
            }
        }
    }
}

public class CharMainCircularQueue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the circular queue: ");
        int m = sc.nextInt();
        charcircleq cq = new charcircleq(m);
        int choice;
        do{
            System.out.println("\n----- CIRCULAR QUEUE MENU -----");
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
                    cq.enqueue(a);
                    break;
                case 2:
                    char x = cq.dequeue();
                    if (x != '\0') {
                        System.out.println("Deleted element: " + x);
                    }
                    break;
                case 3:
                    System.out.println("Queue elements:");
                    cq.display();
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