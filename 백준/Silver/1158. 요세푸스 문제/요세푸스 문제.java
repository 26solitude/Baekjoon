import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        StringBuilder sb = new StringBuilder();

        LinkedList<Integer> ls = new LinkedList<>();

        int manNum = Integer.parseInt(st.nextToken());
        int yosNum = Integer.parseInt(st.nextToken());

        for (int i = 0; i < manNum; i++) {
            ls.add(i + 1);
        }

        int index = 0;
        sb.append("<");
        while (!ls.isEmpty()) {
            index = (index + yosNum - 1) % (ls.size());
            sb.append(ls.get(index)).append(", ");
            ls.remove(index);
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(">");

        System.out.println(sb);
    }
}