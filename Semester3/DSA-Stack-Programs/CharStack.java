import java.util.*;

class CStack{
    char s[];
    int top;
    int Max;

    CStack(){
        Max = 10;
        top = -1;
        s = new char[Max];
    }

    CStack(int m){
        Max = m;
        top = -1;
        s = new char[Max];
    }

    void push(char a){
        if (top >= Max - 1) {
            System.out.println("Stack full");
        } else {
            s[++top] = a;
        }
    }

    char pop(){
        if (top == -1) {
            return '\0';
        } else {
            return s[top--];
        }
    }

    boolean isEmpty(){
        return top == -1;
    }

    boolean isFull(){
        return top >= Max - 1;
    }

    void display(){
        if (!isEmpty()){
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(s[i]);
            }
        }
        else{
            System.out.println("Stack is empty");
        }
    }
}

class CharStack{
    public static void main(String[] args){
        int ch, size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of stack: ");
        size = sc.nextInt();
        CStack s = new CStack(size);
        for(int i = 0; i < size; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            char item = sc.next().charAt(0);
            s.push(item);
        }
        while(true){
            System.out.println();
            System.out.println("1. PUSH\n2. POP\n3.Display\n4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1: if(s.isFull()){
                            System.out.println("Stack full");
                        }
                        else{
                            System.out.print("Enter character to push: ");
                            char ele = sc.next().charAt(0);
                            s.push(ele);
                        }
                        break;
                case 2: char m = s.pop();
                        if(m != '\0'){
                            System.out.println("Element popped is: " + m);
                        }
                        else{
                            System.out.println("Stack is empty");
                        }
                        break;
                case 3: s.display();
                        break;
                case 4: sc.close();
                        return;
                default: System.out.println("Invalid choice!");
            }
        }
    }
}