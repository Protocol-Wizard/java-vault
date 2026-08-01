import java.util.*;

class PStack{
    char s[];
    int top;
    int Max;

    PStack(int m){
        Max = m;
        top = -1;
        s = new char[Max];
    }

    void push(char a){
        if(top >= Max - 1){
            System.out.println("Stack Full");
        }
        else{
            s[++top] = a;
        }
    }

    char pop(){
        if (top == -1){
            return '\0';
        }
        else{
            return s[top--];
        }
    }

    boolean isEmpty(){
        return top == -1;
    }

    void display(){
        if(!isEmpty()){
            for (int i = top; i >= 0; i--) {
                System.out.print(s[i] + " ");
            }
            System.out.println();
        }
        else{
            System.out.println("Stack Empty");
        }
    }
}

class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        PStack s = new PStack(word.length());
        for(int i = 0; i < word.length(); i++){
            s.push(word.charAt(i));
        }
        boolean palindrome = true;
        for(int i = 0; i < word.length(); i++){
            char ch = s.pop();
            if(word.charAt(i) != ch){
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println(word + " is a Palindrome.");
        }
        else{
            System.out.println(word + " is not a Palindrome.");
        }
        sc.close();
    }
}