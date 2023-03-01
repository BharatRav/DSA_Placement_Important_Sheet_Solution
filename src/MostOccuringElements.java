import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

//Link:-https://my.newtonschool.co/playground/code/0o7pgfk09xmd/
public class MostOccuringElements {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++) {
            int data =sc.nextInt();
            map.put(data,map.getOrDefault(data,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());
//        System.out.println(list);

        Collections.sort(list,(a,b) -> {
            if (map.get(a)==map.get(b)) {
                return a-b;
                // because i want same occurence increasing order by their comming time
            } else {
                return map.get(b)- map.get(a);
                //because i want more occurence element first
            }
        });
//        System.out.println(list);

        for (int i=0;i<3;i++) {
            if (i<list.size()) {
                System.out.print(list.get(i)+" ");
            } else {
                System.out.print(-1+" ");
            }
        }




        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

    }
}
/*
Problem Statement
Given an integer array of size n. Print the three most occurring element. print them in order of their number of occurrence. If the number of occurrence is same then print the smaller number before.
Input
First line contains n.
Next line contains n space separated integers.

Constraints
3 <= n < = 105
1 <= arr[i] <= 105
Output
Output three integers. if there are not enough integers then print -1 for that place.
Example
Input:
6
1 2 1 2 2 1

Output:
1 2 -1

Explanation:
number of occurrence of 1 = 3
number of occurrence of 2 = 3
so 1 is printed before 2.
there are only 2 elements so we print -1 as third number.
 */
