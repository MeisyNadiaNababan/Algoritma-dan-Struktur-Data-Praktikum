import java.util.Scanner;
public class PostfixTugasDemo {
    public static void main(String[] args) {
        String infix = "5*4^(1+2)%3";
        System.out.println("Infix: " + infix);
        String postfix = konversi(infix);
        System.out.println("Postfix: " + postfix);
        System.out.println("Hasil evaluasi: " + evaluatePostfix(postfix));
    }

    public static boolean isOperand(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')
                || (c >= '0' && c <= '9') || c == ' ' || c == '.';
    }

    public static boolean isOperator(char c) {
        return (c == '^' || c == '%' || c == '*' || c == '-' || c == '+');
    }

    public static int getDerajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
            case '*':
            case '/':
                return 2;
            case '-':
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public static String konversi(String infix) {
        StackTugas operators = new StackTugas(infix.length());
        StringBuilder postfix = new StringBuilder();
        char c;

        for (int i = 0; i < infix.length(); i++) {
            c = infix.charAt(i);

            if (isOperand(c)) {
                postfix.append(c);
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (operators.peek() != '\0' && operators.peek() != '(') {
                    postfix.append(operators.pop());
                }
                operators.pop(); 
            } else if (isOperator(c)) {
                while (!operators.isEmpty() && getDerajat(operators.peek()) >= getDerajat(c)) {
                    postfix.append(operators.pop());
                }
                operators.push(c);
            }
        }
        while (!operators.isEmpty()) {
            postfix.append(operators.pop());
        }

        return postfix.toString();
    }

    public static int evaluatePostfix(String postfix) {
        StackTugas operands = new StackTugas(postfix.length());
        char c;

        for (int i = 0; i < postfix.length(); i++) {
            c = postfix.charAt(i);

            if (isOperand(c)) {
                operands.push(c);
            } else if (isOperator(c)) {
                int operand2 = operands.pop() - '0'; 
                int operand1 = operands.pop() - '0'; 
                int result = performOperation(operand1, operand2, c);
                operands.push((char) (result + '0')); 
            }
        }

        return operands.pop() - '0'; 
    }

    public static int performOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '^':
                return (int) Math.pow(operand1, operand2);
            case '%':
                return operand1 % operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            case '-':
                return operand1 - operand2;
            case '+':
                return operand1 + operand2;
            default:
                return 0;
        }
    }
}