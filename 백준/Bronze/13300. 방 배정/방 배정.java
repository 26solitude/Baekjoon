import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int stdNum = Integer.parseInt(st.nextToken());
        int roomNum = Integer.parseInt(st.nextToken());

        int[][] arr = new int[2][7];

        for(int i=0; i<stdNum; i++){
            String stdinput = br.readLine();
            String[] stdinputs = stdinput.split(" ");
            arr[Integer.parseInt(stdinputs[0])][Integer.parseInt(stdinputs[1])]++;
        }

        int totalRoom = 0;
        for(int i=0; i<2; i++){
            for(int j=0; j<7; j++){
                if(arr[i][j] != 0){
                    if(arr[i][j]>roomNum) totalRoom += arr[i][j]/roomNum+1;
                    else totalRoom++;
                }
            }
        }

        System.out.println(totalRoom);
    }
}
