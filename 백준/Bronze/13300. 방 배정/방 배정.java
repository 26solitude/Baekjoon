import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int stdNum = Integer.parseInt(st.nextToken());
        int roomNum = Integer.parseInt(st.nextToken());

        int[][] arr = new int[2][7];

        for (int i = 0; i < stdNum; i++) {
            st = new StringTokenizer(br.readLine());
            arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]++;
        }

        int totalRoom = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                if (arr[i][j] == 0) continue;

                if (arr[i][j] % roomNum != 0) totalRoom++;
                totalRoom += arr[i][j] / roomNum;
            }
        }

        System.out.println(totalRoom);
    }
}
