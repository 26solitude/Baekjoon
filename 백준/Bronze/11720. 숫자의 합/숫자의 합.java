import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int total = 0;
        char[] input = br.readLine().toCharArray();

        for(int i=0; i<N; i++){
            total += Integer.parseInt(String.valueOf(input[i]));
        }

        System.out.println(total);
    }
}

