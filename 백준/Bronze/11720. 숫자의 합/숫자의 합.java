//import java.util.Scanner;
//
//public class Main {
//    static int[] arr;
//    static int N, M;
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        N = s.nextInt();
//        M = s.nextInt();
//
//        arr = new int[M];
//
//        dfs(0);
//    }
//
//    private static void dfs(int depth) {
//        if(depth == M){
//            for(int i=0; i<M; i++){
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//            return;
//        }
//
//        for(int i=1; i<=N; i++){
//            arr[depth] = i;
//            dfs(depth+1);
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int total = 0;
        char[] input = br.readLine().toCharArray();

        for(int i=0; i<N; i++){
            total += Integer.parseInt(String.valueOf(input[i]));
        }

        System.out.println(total);
    }
}

