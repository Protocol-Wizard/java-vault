class Stack{
    char s[];
    int top;
    int Max;

    Stack(){
        Max = 10;
        top = -1;
        s = new char[Max];
    }

    Stack(int m){
        Max = m;
        top = -1;
        s = new char[Max];
    }

    void push(char a){
        if(top >= Max - 1){
            System.out.println("Stack full");
        }
        else{
            s[++top] = a;
        }
    }

    char pop(){
        if(top == -1){
            return '\0';
        }
        else{
            return s[top--];
        }
    }

    boolean isEmpty(){
        return top == -1;
    }
}

public class PostfixStack{
    public static void main(String[] args){
        Stack S = new Stack(10);
        String postfix = "123*+#"; //Enter your postfix expression here
        int i = 0;
        char c;
        char op1, op2;
        while ((c = postfix.charAt(i)) != '#'){
            if(Character.isDigit(c)){
                S.push(c);
            }
            else{
                op2 = S.pop();
                op1 = S.pop();
                int val1 = op1 - '0';
                int val2 = op2 - '0';
                int result;
                switch(c){
                    case '+': result = val1 + val2; break;
                    case '-': result = val1 - val2; break;
                    case '*': result = val1 * val2; break;
                    case '/': result = val1 / val2; break;
                    default:
                        System.out.println("Unknown operator: " + c);
                        return;
                }
                S.push((char)(result + '0'));
            }
            i++;
        }
        if(!S.isEmpty()){
            System.out.println(S.pop());
        }
    }
}