import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = N - 1;
        int sol1 = 0;
        int sol2 = 0;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (Math.abs(sum) < min) {
                min = Math.abs(sum);
                sol1 = arr[i];
                sol2 = arr[j];
            }

            if (sum > 0) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println(sol1 + " " + sol2);
    }
}
