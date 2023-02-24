import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Permutation1 {
    // static ArrayList<String> list =new ArrayList<>();

    //github.com/bharatrav
    static TreeSet<String> list =new TreeSet<>();
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.next();

        printResult(str,0,str.length()-1);
        // Collections.sort(list);
        //if im using treeset then no need of sort thats hy line 14 is commented
        //if you like it plz give a star to my repository
        for (String val: list) {
            System.out.print(val+" ");
        }
    }
    private static void printResult(String str, int l,int r) {
        if (l==r) {
            // System.out.print(str+" ");
            //Bharat name to suna hi hoga
            list.add(str);

        } else {
            for (int i=l;i<=r;i++) {
                str =swap(str,l,i);
                printResult(str,l+1,r);
                str =swap(str,l,i);
            }
        }
    }

    private static String swap(String a, int i, int j) {
        char temp;
        char[] charArray=a.toCharArray();
        temp =charArray[i];
        charArray[i] =charArray[j];
        charArray[j] =temp;
        return String.valueOf(charArray);
    }
}


/*
Problem Statement
    Given a string S. The task is to print all permutations of the characters in the given string.
Input
    The only line of input contains a string S with all distinct uppercase letters of the English alphabet.

Constraints:-
    1<=|S|<=8
Output
    Print all permutations of a given string S with single space and all permutations should be in lexicographically increasing order.

Example
    Sample Input:
    ABC

    Sample Output:
    ABC ACB BAC BCA CAB CBA
 */