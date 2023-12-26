import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < num; i++) {
            String input = br.readLine();
            StringTokenizer s = new StringTokenizer(input);
            String command = s.nextToken();
            if (Objects.equals(command, "push")) st.push(Integer.parseInt(s.nextToken()));
            else if (Objects.equals(command, "pop")) {
                if (st.isEmpty()) sb.append(-1).append('\n');
                else sb.append(st.pop()).append('\n');
            } else if (Objects.equals(command, "size")) sb.append(st.size()).append('\n');
            else if (Objects.equals(command, "empty")) {
                if (st.isEmpty()) sb.append(1).append('\n');
                else sb.append(0).append('\n');
            } else if (Objects.equals(command, "top")) {
                if (st.isEmpty()) sb.append(-1).append('\n');
                else sb.append(st.peek()).append("\n");
            }
        }

        System.out.println(sb);
    }
}