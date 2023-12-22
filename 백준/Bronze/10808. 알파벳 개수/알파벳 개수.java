import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int[] alpha = new int[26];

        for (char c : input.toCharArray()) {
            alpha[c - 'a']++;
        }

        for (int count : alpha) {
            sb.append(count).append(" ");
        }
        System.out.println(sb);
    }
}
