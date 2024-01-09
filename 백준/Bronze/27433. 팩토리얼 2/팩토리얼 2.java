import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long result = func(N);
        System.out.println(result);
    }

    public static long func(int n){
        if(n<=1) return 1;
        return n * func(n-1);
    }
}