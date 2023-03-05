import java.util.Arrays;
import java.util.Scanner;

public class MaxFlags {
    private static int[]  maxFlagArry(int[] inputArray, int m , int n) {
        int[] result  = new int[n];
        Arrays.sort(inputArray);

        int max=0;
        for (int i=0;i<m;i++) {
            int data =inputArray[i];

            if (inputArray[i]>n) {
                Arrays.fill(result, max);
            } else {
                result[data-1]++;
                max = Math.max(max,result[data-1]);
            }
        }
        return result;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0) {
            int n =sc.nextInt();
            int m =sc.nextInt();

            int[] inputArray = new int[m];

            for (int i=0;i<m;i++) {
                inputArray[i] = sc.nextInt();
            }

            int[] result =maxFlagArry(inputArray, m, n);
            for (int data: result) {
                System.out.print(data+ " ");
            }
        }
    }
}
