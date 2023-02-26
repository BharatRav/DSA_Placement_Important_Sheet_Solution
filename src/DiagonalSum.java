import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        long primary=0,secondary=0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                int data=sc.nextInt();
                if (i==j) {
                    primary+=data;
                }
                if (i==(n-j-1)) {
                    secondary+=data;
                }
            }
        }
        System.out.print(primary+" "+secondary);
    }
}
