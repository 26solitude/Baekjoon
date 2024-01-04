import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nm = br.readLine();
        StringTokenizer st = new StringTokenizer(nm);

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        int[][] dis = new int[N][M];
        boolean[][] vis = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            char[] input = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                arr[i][j] = input[j] - '0';
                dis[i][j] = 0;
            }
        }

        Queue<Pair> Q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] != 1 || vis[i][j]) continue;
                Q.add(new Pair(i, j));
                vis[i][j] = true;
                while (!Q.isEmpty()) {
                    Pair cur = Q.poll();
                    for (int dir = 0; dir < 4; dir++) {
                        int x = cur.x + dx[dir];
                        int y = cur.y + dy[dir];

                        if (x < 0 || x >= N || y < 0 || y >= M) continue;
                        if (arr[x][y] != 1 || vis[x][y]) continue;

                        Q.add(new Pair(x, y));
                        vis[x][y] = true;
                        if (dis[x][y] == 0) dis[x][y] = dis[cur.x][cur.y] + 1;
                    }
                }
            }
        }

        System.out.println(dis[N - 1][M - 1] + 1);

    }

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}