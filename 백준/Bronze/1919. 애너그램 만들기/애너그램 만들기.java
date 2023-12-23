import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        int[] spell = new int[26];

        if (a.length > 0 && a.length < 1001) {
            for (char i : a) {
                spell[i - 'a']++;
            }
        }

        if (b.length > 0 && b.length < 1001) {
            for (char j : b) {
                spell[j - 'a']--;
            }
        }

        int res = 0;
        for (int k : spell) {
            if(k != 0) res += Math.abs(k);
        }

        System.out.println(res);
    }
}
