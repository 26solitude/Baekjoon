import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int max = 0;

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) max = arr[i];
        }

        double total = 0;
        for (int i = 0; i < N; i++) {
            total += ((double) arr[i] / max * 100);
        }

        System.out.println(total/N);
    }
}

