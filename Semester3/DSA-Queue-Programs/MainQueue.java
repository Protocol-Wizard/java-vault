import java.util.*;

class queue{
    int q[];
    int max;
    int f ;
    int r;
   
    queue (int m){
        max = m;
        f = 0;
        r=-1;
        q = new int[m];
    }

    boolean isEmpty(){
        if (f==0 && r==-1){
            return true;
        }
        else{
            return false;
        }
    }

    boolean isFull(){
        if (r==max-1){
            return true;
        }
        else{
            return false;
        }
    }

    void enqueue(int a){
        if (isFull()){
            System.out.println("Overflow");
        }
        else{
            r=r+1;
            q[r]=a;
        }
    }

    int dequeue(){
        if (isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        else if(f==r){
            int temp=q[f];
            f=0;
            r=-1;
            return temp;
        }
        else{
            int temp=q[f];
            f=f+1;
            return temp;
        }
    }
    
    void display(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            for (int i = f; i <= r; i++){
                System.out.println(q[i]);
            }
        }
    }
}

public class MainQueue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int m = sc.nextInt();
        queue q = new queue(m);
        int choice;
        do{
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1: System.out.print("Enter the element: ");
                        int a = sc.nextInt();
                        q.enqueue(a);
                        break;
                case 2:  int x = q.dequeue();
                         if (x != -1){
                            System.out.println("Deleted element: " + x);
                         }
                         break;
                case 3: System.out.println("Queue elements:");
                        q.display();
                        break;
                case 4: System.out.println("Exiting...");
                        break;
                default: System.out.println("Invalid choice");
            }
        }
        while(choice != 4);
    }
}
