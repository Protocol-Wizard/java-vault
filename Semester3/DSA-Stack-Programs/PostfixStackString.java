class Expr{
    String exp;
    int prec;

    Expr(String e, int p){
        exp = e;
        prec = p;
    }
}

class CStack{
    Expr s[];
    int top;
    int Max;

    CStack(){
        Max = 30;
        top = -1;
        s = new Expr[Max];
    }

    CStack(int m){
        Max = m;
        top = -1;
        s = new Expr[Max];
    }

    void push(Expr a){
        if (top >= Max - 1){
            System.out.println("Stack Full");
        }
        else{
            s[++top] = a;
        }
    }

    Expr pop(){
        if (top == -1){
            return null;
        }
        else{
            return s[top--];
        }
    }

    boolean isEmpty(){
        return top == -1;
    }
}

public class PostfixStackString{
    static int precedence(char op){
        switch (op){
            case '=':
                return 1;
            case '|':
                return 2;
            case '&':
                return 3;
            case '<':
            case '>':
                return 4;
            case '+':
            case '-':
                return 5;
            case '*':
            case '/':
            case '%':
                return 6;
            case '^':
                return 7;
            default:
                return 100;
        }
    }
    static boolean isRightAssociative(char op){
        return op == '^';
    }
    public static void main(String[] args){
        CStack S = new CStack(50);
        String postfix = "abc*+de^-#"; //Enter your postfix expression here
        int i = 0;
        char c;
        while ((c = postfix.charAt(i)) != '#'){
            if (Character.isLetterOrDigit(c)){
                S.push(new Expr(String.valueOf(c), 100));
            }
            else{
                Expr op2 = S.pop();
                Expr op1 = S.pop();
                int p = precedence(c);
                String left = op1.exp;
                String right = op2.exp;

                if (op1.prec < p){
                    left = "(" + left + ")";
                }

                if (op2.prec < p || (op2.prec == p && !isRightAssociative(c))){
                    right = "(" + right + ")";
                }

                String result = left + c + right;
                S.push(new Expr(result, p));
            }
            i++;
        }
        System.out.println("Infix Expression : " + S.pop().exp);
    }
}