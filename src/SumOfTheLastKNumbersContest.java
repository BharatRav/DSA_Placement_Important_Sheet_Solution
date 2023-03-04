import java.util.ArrayList;
import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/pboivg74o0gr/
public class SumOfTheLastKNumbersContest {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k =sc.nextInt();

        long DataBase =0;
        ArrayList<Integer> dbArray = new ArrayList<>();
        while(sc.hasNext()) {
            int query =sc.nextInt();
            if (query==1) {
                int data = sc.nextInt();
                DataBase+=data;
                dbArray.add(data);
                if (dbArray.size()>k) {
                    DataBase-=dbArray.get(dbArray.size()-k-1);
                }
                System.out.println(" DataBase: "+DataBase + " data:" +data+" "+dbArray);
            } else {
                System.out.println(DataBase);
            }
            //if you like it plz give a star to the repository
            //it'll motivate us to do more question
            //http://github.com/bharatrav

        }
    }
}
/*
Problem Statement
Given an integer Q representing the number of queries and an integer K. There are two types of queries:
(i) 1 x : Add the number x to the stream
(ii) 2 : Print the sum of last K numbers of the stream. If there are less than K numbers in the stream, print the sum of current stream.
Process all the queries.
Input
First line contains two integers Q and K.
Next Q lines contains the queries.

Constraints
1 <= Q <= 10^5
1 <= x <= 10^5
1 <= K <= Q
There is atleast one query of 2nd type.
Output
For each query of type 2, print the sum of last K numbers of the stream on a new line.
Example
Sample Input 1:
5 2
1 4
2
1 1
1 3
2

Output
4
4

Explanation:
Initial Stream = {}
Add 4. Stream = {4}
Sum of last two elements = 4
Add 1. Stream = {4, 1}
Add 3. Stream = {4, 1, 3}
Sum of last two elements = 4

Sample Input 2:
3 1
1 1
2
2

Output
1
1

Explanation
Initial Stream = {}
Add 1. Stream = {1}
Sum of last element = 1
Sum of last element = 1
 */