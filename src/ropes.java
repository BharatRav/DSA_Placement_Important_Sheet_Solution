import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

    // don't change the name of this class
// you can add inner classes if needed
class ropes {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        double[] rope =new double[n];

        for (int i=0;i<n;i++) {
            rope[i]=sc.nextDouble();
        }

        double left=0;
        double right =1e9;

        while (right-left >0.000001) {
            double mid =left + (right-left)/2;
            int piece =0;
            for (int i=0;i<n;i++) {
                piece+= rope[i]/mid;
            }

            if (piece>=k) {
                left=mid;
            } else {
                right=mid;
            }
        }
        System.out.format("%.6f",left);
    }
}
