import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s," ");

        for(int i=0; i<size; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = Integer.parseInt(br.readLine());
        int match = 0;
        boolean[] nums = new boolean[1000000];
        for(int i=0; i<size; i++){
            int num = arr[i];
            if(result-num<0 || result-num==arr[i] || result-num>1000000)
                continue;
            if(nums[result - num] == true) match++;
            nums[num] = true;
        }

        System.out.println(match);

    }
}
