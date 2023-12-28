import java.util.Scanner;
import java.util.Stack;

public class RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (!stack.isEmpty() && stack.peek() == currentChar) {
                stack.pop();
            } else {
                stack.push(currentChar);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        if (result.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(result);
        }
    }
}