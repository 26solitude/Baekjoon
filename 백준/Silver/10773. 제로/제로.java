import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();

        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            int a = Integer.parseInt(br.readLine());
            if(a == 0) st.pop();
            else st.push(a);
        }

        int total = 0;
        for(int i: st){
            total += i;
        }

        System.out.println(total);
    }
}