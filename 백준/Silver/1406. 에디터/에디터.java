import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Character> ls = new LinkedList<>();
        ListIterator<Character> iter = ls.listIterator();

        char[] s = br.readLine().toCharArray();
        for (char i : s) {
            iter.add(i);
        }

        int num = Integer.parseInt(br.readLine());
        while (num-- > 0) {
            String com = br.readLine();
            StringTokenizer st = new StringTokenizer(com);
            switch (st.nextToken().charAt(0)) {
                case 'L':
                    if (iter.hasPrevious()) iter.previous();
                    break;

                case 'D':
                    if (iter.hasNext()) iter.next();
                    break;

                case 'B':
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;

                case 'P':
                    iter.add(st.nextToken().charAt(0));
                    break;

            }
        }
        for (char i : ls) {
            sb.append(i);
        }

        System.out.println(sb);

    }
}