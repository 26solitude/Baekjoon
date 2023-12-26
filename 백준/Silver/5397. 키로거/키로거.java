import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String a = br.readLine();
            calcPass(a, sb);
        }

        System.out.println(sb.toString());
    }

    private static void calcPass(String a, StringBuilder sb) {
        LinkedList<Character> ls = new LinkedList<>();
        ListIterator<Character> iter = ls.listIterator();
        char[] ans = a.toCharArray();
        int index = 0;
        for (char i : ans) {
            if (i == '<') {
                if (iter.hasPrevious()) iter.previous();
            } else if (i == '>') {
                if (iter.hasNext()) iter.next();
            } else if (i == '-') {
                if (iter.hasPrevious()) {
                    iter.previous();
                    iter.remove();
                }
            } else {
                iter.add(i);
            }
        }
        for (char j : ls) {
            sb.append(j);
        }
        sb.append('\n');
    }
}