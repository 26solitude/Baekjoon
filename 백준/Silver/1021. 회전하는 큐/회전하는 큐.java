import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new ArrayDeque<>();

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            dq.add(i + 1);
        }

        String b = br.readLine();
        StringTokenizer st2 = new StringTokenizer(b);

        int result = 0;
        while (M --> 0) {
            int target = Integer.parseInt(st2.nextToken());
            int num = 0;
            while (true) {
                if (dq.getFirst() != target) {
                    int prev = dq.removeFirst();
                    dq.addLast(prev);
                    num++;
                } else {
                    break;
                }
            }
            result += Math.min(num, dq.size() - num);
            dq.removeFirst();
        }

        System.out.println(result);
    }
}

