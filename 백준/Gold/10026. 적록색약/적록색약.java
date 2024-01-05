import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Pair> Q = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        char[][] arr = new char[N][N];
        boolean[][] vis = new boolean[N][N];
        boolean[][] vis2 = new boolean[N][N];


        for (int i = 0; i < N; i++) {
            char[] input = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                arr[i][j] = input[j];
            }
        }

        sb.append(bfs(Q, N, arr, vis)).append(" ");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(arr[i][j] == 'G') arr[i][j] = 'R';
            }
        }

        sb.append(bfs(Q, N, arr, vis2));
        System.out.println(sb);
    }

    private static int bfs(Queue<Pair> Q, int N, char[][] arr, boolean[][] vis) {
        int num = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (vis[i][j]) continue;
                char color = arr[i][j];
                Q.add(new Pair(i, j));
                vis[i][j] = true;

                num++;

                while (!Q.isEmpty()) {
                    Pair cur = Q.poll();
                    for (int dir = 0; dir < 4; dir++) {
                        int x = cur.x + dx[dir];
                        int y = cur.y + dy[dir];

                        if (x < 0 || x >= N || y < 0 || y >= N) continue;
                        if (arr[x][y] != color || vis[x][y]) continue;

                        Q.add(new Pair(x, y));
                        vis[x][y] = true;
                    }
                }
            }
        }

        return num;
    }

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
