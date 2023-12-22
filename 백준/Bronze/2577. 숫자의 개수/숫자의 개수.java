import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int Tot = A * B * C;
        int[] arr = new int[10];
        while (Tot > 9) {
            arr[Tot % 10]++;
            Tot /= 10;
        } arr[Tot]++;

        for (int a : arr) {
            sb.append(a).append("\n");
        }
        System.out.println(sb);
    }
}
