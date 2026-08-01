import java.util.*;

class Stack{
    int s[];
    int top;
    int Max;

    Stack(){
        Max = 10;
        top = -1;
        s = new int[Max];
    }

    Stack(int m){
        Max = m;
        top = -1;
        s = new int[Max];
    }

    void push(int a){
        if(top >= Max - 1){
            System.out.println("Stack full");
        }
        else{
            s[++top] = a;
        }
    }

    int pop(){
        if(top == -1){
            return -1;
        }
        else{
            return(s[top--]);
        }
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }

    boolean isFull(){
        return top >= Max - 1;
    }

    void display(){
        if(!isEmpty()){
            for(int i = top; i >= 0; i--){
                System.out.print(s[i]+" ");
            }
            System.out.println();
        }
        else{
            System.out.println("empty");
        }
    }
}

class MainStack{
    public static void main(String[] args){
        int ch;
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of stack: ");
        size = sc.nextInt();
        Stack s = new Stack(size);
        for(int i = 0; i < size; i++){
            System.out.print("Enter elements of the Stack at index ["+i+"]: ");
            int item = sc.nextInt();
            s.push(item);
        }
        while(true){
            System.out.println();
            System.out.println("1. PUSH\n2. POP\n3.Display\n4. Exit");
            System.out.print("Enter: ");
            ch = sc.nextInt();
            switch(ch){
            case 1: if(s.isFull()){
                        System.out.println("Stack full");
                    }
                    else{
                        System.out.print("Enter element to enter: ");
                        int ele = sc.nextInt();
                        s.push(ele);
                    }
                    break;
            case 2: int m = s.pop();
                    if(m != -1){
                        System.out.println("Element popped is: "+m);
                    }
                    break;
            case 3: s.display();
                    break;
            case 4: sc.close();
                    return;
            default: System.out.println("Invalid choice");
                     break;
            }
        }
    }
}
