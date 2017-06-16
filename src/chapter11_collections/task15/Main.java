package chapter11_collections.task15;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String expression = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            switch (currentChar) {
                case '+':
                    stack.push(expression.charAt(++i));
                    break;
                case '-':
                    System.out.print(stack.pop());
                    break;
            }
        }
    }
}
