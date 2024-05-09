//package Praktikum07;
import java.util.Scanner;

public class PostfixDemo {
    public static void main(String[] args) {
        String infix = "5*4^(1+2)%3";
        System.out.println("Infinix: " + infix);
        System.out.println("Postifix: " + konverensi(infix));
    }

    public static boolean isOperand(char c) {
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')
                || (c >= '0' && c <= '9') || c == ' ' || c == '.');
    }

    public static boolean isOperator(char c) {
        return (c == '^' || c == '%' || c == '*' || c == '-' || c == '+');
    }

    public static int getDerajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '*':
            case '/':
                return 2;
            case '-': 
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public static String konverensi(String infix) {
        Stack2 oepartors = new Stack2(infix.length());
        String postfix = "";
        char c;

        for (int i = 0; i < infix.length(); i++) {
            c = infix.charAt(i);

            if (isOperand(c)) {
                postfix = postfix + c;
            } else if (c == '(') {
                oepartors.push(c);
            } else if (c == ')') {
                while (oepartors.peek() != '(') {
                    postfix = postfix + oepartors.pop();
                }

                oepartors.pop();
            } else if (isOperator(c)) {
                while (!oepartors.isEmpty() && getDerajat(oepartors.peek()) >= getDerajat(c)) {
                    postfix = postfix + oepartors.pop();
                }

                oepartors.push(c);
            }
        }

        while (!oepartors.isEmpty()) {
            postfix += oepartors.pop();
        }

        return postfix;
    }
}
