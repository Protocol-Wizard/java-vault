import java.util.*;

class circleq{
    int cq[];
    int max;
    int f ;
    int r;
   
    circleq (int m){
        max = m;
        f = 0;
        r=-1;
        cq = new int[m];
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
        if (f==0 && r==-1){
            return false;
        }
        else if (f==(r+1)%max){
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
            r=(r+1)%max;
            cq[r]=a;
        }
    }

    int dequeue(){
        if (isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        else if(f==r){
            int temp=cq[f];
            f=0;
            r=-1;
            return temp;
        }
        else{
            int temp=cq[f];
            f=(f+1)%max;
            return temp;
        }
    }
    
    void display(){
        if (isEmpty()){
            System.out.println("Underflow");
        }
        else if(f<=r){
            for(int i=f;i<=r;i++){
                System.out.println(cq[i]);
            }
        }
        else{
            for(int k=f;k<=max-1;k++){
                System.out.println(cq[k]);
            }
            for(int j=0;j<=r;j++){
                System.out.println(cq[j]);
            }
        }
    }
}

public class MainCircularQueue{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the circular queue: ");
        int m = sc.nextInt();
        circleq cq = new circleq(m);
        int choice;
        do{
            System.out.println("\n----- CIRCULAR QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1: System.out.print("Enter the element: ");
                        int a = sc.nextInt();
                        cq.enqueue(a);
                        break;
                case 2: int x = cq.dequeue();
                        if (x != -1){
                        System.out.println("Deleted element: " + x);
                        }
                        break;
                case 3: System.out.println("Queue elements:");
                        cq.display();
                        break;
                case 4: System.out.println("Exiting...");
                        break;
                default: System.out.println("Invalid choice");
            }
        }
        while(choice != 4);
    }
}
