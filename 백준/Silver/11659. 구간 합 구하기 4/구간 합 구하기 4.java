import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String init = br.readLine();
        StringTokenizer inst = new StringTokenizer(init);
        
        int N = Integer.parseInt(inst.nextToken());
        int[] arr = new int[N];
        int rep = Integer.parseInt(inst.nextToken());

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        arr[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < rep; i++) {
            String range = br.readLine();
            StringTokenizer ranst = new StringTokenizer(range);

            int ran1 = Integer.parseInt(ranst.nextToken()) - 2;
            int ran2 = Integer.parseInt(ranst.nextToken()) - 1;

            if (ran1 < 0) sb.append(arr[ran2]).append("\n");
            else sb.append(arr[ran2] - arr[ran1]).append("\n");
        }

        System.out.println(sb);
    }
}

