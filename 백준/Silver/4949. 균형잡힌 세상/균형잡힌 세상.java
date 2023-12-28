import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        String input = "";

        while (true) {
            input = br.readLine();
            if(input.equals(".")) break;
            char[] sen = input.toCharArray();
            boolean stop = false;
            for (char i : sen) {
                if (stop == true) break;
                switch (i) {
                    case '(':
                        stack.push('(');
                        break;
                    case ')':
                        if(stack.isEmpty() || stack.peek() != '('){
                            stop = true;
                            break;
                        }
                        stack.pop();
                        break;
                    case '[':
                        stack.push('[');
                        break;
                    case ']':
                        if(stack.isEmpty() || stack.peek() != '['){
                            stop = true;
                            break;
                        }
                        stack.pop();
                        break;
                    default:
                        break;
                }
            }
            if(stack.isEmpty() && stop == false) sb.append("yes").append('\n');
            else sb.append("no").append('\n');
            stack.clear();
        }
        System.out.println(sb);
    }
}