import java.util.Arrays;
import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/wf1fof550osx/
public class FruitMarketContest {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        int m = sc.nextInt();

        int[] poly = new int[m];

        for (int i=0;i<m;i++) {
            poly[i] = sc.nextInt();
        }

        Arrays.sort(poly);

        int count=0;
        int j=m-1;
        while(n>0 && j>=0) {
            n-=poly[j--];
            count++;
        }

        System.out.println(count);
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
    }

}
/*
Problem Statement
You have N kilograms of fruits with you and M types of polybags to put the fruits into. The holding capacity of the ith polybag is pi. Find the minimum number of polybags required to carry all N kilograms of fruits.
Input
The first line contains two integers N and M.
The second line contains M space-separated integers.

Constraints:
1 ≤ N ≤ 1012
1 ≤ M ≤ 105
1 ≤ pi ≤ 108
Output
Print the minimum number of polybags required to carry all N-kilograms of fruits.
Example
Sample Input:
10 4
4 9 8 2

Sample Output:
2

Explaination:
We can carry fruits in polybag 1 and polybag 3. This will give us a total capacity of 4 + 8 = 12 kilograms which is more than that required to carry the fruits.
 */
