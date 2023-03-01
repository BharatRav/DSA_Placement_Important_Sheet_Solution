import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/a4u07ln5agbz/
public class SuspenseString {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int tc = sc.nextInt() ;
        while(tc-->0){
            int n = sc.nextInt() ;
            sc.nextLine();
            String str = sc.nextLine() ;
            String newstr = "";
            String ans = "";
            String n1 = '1' + "" ;
            String n0 = '0' + "" ;
            for(int i=0; i<n+1/2; i++){
                newstr = newstr + str.charAt(i) ;
                newstr = newstr + str.charAt(n-1-i) ;
                System.out.println(newstr);
            }

            //if you like it plz give a star to the repository
            //it'll motivate us to do more question
            //http://github.com/bharatrav
            for(int i = 0; i<n; i++){
                if(i%2 == 0){
                    if(newstr.charAt(i) == '0')
                        ans = n0+ans ;
                    else
                        ans = ans+n1 ;
                }
                else{
                    if(newstr.charAt(i) == '0')
                        ans = ans+n0 ;
                    else
                        ans = n1+ans ;
                }
            }
            System.out.println(ans);
        }
    }
//    public static void main (String[] args) {
//        // Your code here
//        Scanner sc= new Scanner(System.in);
//        int tc = sc.nextInt();
//        StringBuilder result = new StringBuilder();
//        while (tc-->0) {
////            System.out.println(sb);
//            result.delete(0,result.length());
////            System.out.println(sb);
//            int n=sc.nextInt();
//            String s = sc.next();
//            StringBuilder str = new StringBuilder(s);
//
//            int i=0;
//            //They both take turns and Alice plays first.
//            boolean flag =true;     //true alice turn
//            while (i<str.length()) {
//                char ch= str.charAt(i);
////                System.out.println(ch);
//                if (result.isEmpty()) {
//                    result.append(ch);
//                    System.out.println(result);
//                    str.deleteCharAt(i);
//                    flag =!flag;
//                    continue;
//                }
//
//                if (flag) {
//                    //alice turn
//                    if (ch>str.charAt(i)) {
//                        result.append(ch);
//                    } else {
//                        result = result.insert(0,ch);
//                    }
//                } else {
//                    //bob turn
//                    if (ch<str.charAt(i)) {
//                        result.append(ch);
//                    } else {
//                        result = result.insert(0,ch);
//                    }
//                }
//                str.deleteCharAt(i);
//                flag = !flag;
//                System.out.println(str+ " / " + result);
//
//            }
//        }
//    }
}
/*
Problem Statement
Alice and Bob are playing a game with a binary string S of length N and an empty string T. They both take turns and Alice plays first. In Alice's turn, she picks the first character of string S, appends the character to either the front or back of string T and deletes the chosen character from string S. In Bob's turn, he picks the last character of string S, appends the character to either the front or back of string T and deletes the chosen character from string S. The game stops when S becomes empty. Alice wants the resultant string T to be lexicographically smallest, while Bob wants the resultant string T to be lexicographically largest possible. Find the resultant string T, if both of them play optimally.
Input
The first line of input will contain a single integer T, denoting the number of test cases. Each test case consists of multiple lines of input. The first line of each test case contains a single integer N - the length of the string S. The next line is the binary string S.

Constraints
1 ≤ T ≤ 100
1 ≤ N ≤ 1000
S can only contain the characters 0 or 1.
Output
For each test case, print the the resultant string T, if both of them play optimally.
Example
Sample Input :
4
2
10
4
0001
6
010111
10
1110000010

Sample Output :
10
0100
101101
0011011000

Explanation :
Alice picks the first bit which is 1 and appends it to the empty string T. Bob then picks the last bit 0 and appends it to the back of T making the resultant string to be 10.
Alice picks 0 and adds it to T. Thus, SS becomes 001 and T becomes 0.
Bob picks 1 and adds it to the front of T. Thus, S becomes 00 and T becomes 10.
Alice picks 0 and adds it to the front of T. Thus, S becomes 0 and T becomes 010.
Bob picks 0 and adds it to the back of T. Thus, S becomes empty and T becomes 0100.
 */