import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            q.add(i + 1);
        }

        while (q.size() != 1) {
            q.remove();
            int n = q.poll();
            q.add(n);
        }

        System.out.println(q.peek());
    }
}