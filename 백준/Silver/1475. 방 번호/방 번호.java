import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        String[] s = br.readLine().split("");

        for (String i : s) {
            if (Integer.parseInt(i) == 9)
                arr[6]++;
            else
                arr[Integer.parseInt(i)]++;
        }
        arr[6] = (int)Math.ceil(arr[6]/2.0);

        int max = 0;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }

        System.out.println(max);
    }
}
