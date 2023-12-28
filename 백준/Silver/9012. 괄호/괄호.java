import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        int num = Integer.parseInt(br.readLine());

        while(num --> 0){
            char[] input = br.readLine().toCharArray();
            int count = 0;
            for(char i : input){
                if(i=='(') count++;
                else if(i==')') count--;

                if(count<0){
                    break;
                }
            }
            if(count != 0 || count < 0){
                sb.append("NO").append('\n');
            }else{
                sb.append("YES").append('\n');
            }
        }
        System.out.println(sb);
    }
}