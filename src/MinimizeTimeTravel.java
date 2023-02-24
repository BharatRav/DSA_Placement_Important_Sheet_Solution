import java.util.Scanner;

public class MinimizeTimeTravel {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        System.out.println((a+Math.min(b,c))>(b+c)?(b+c):(a+Math.min(b,c)));
    }
}