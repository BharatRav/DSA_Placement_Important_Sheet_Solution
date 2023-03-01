import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class RectangularArea {
    static  long mod = (long)1e9+7;
    public static void main (String[] args) {
        // Your code here

        //only 2 cases working others get Runtime Error
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        int[][] rectangle = new int[n][4];

        for (int i=0;i<n;i++) {
            for (int j=0;j<4;j++) {
                rectangle[i][j] =sc.nextInt();
            }
        }

        TreeSet<Integer> x = new TreeSet<>();
        TreeSet<Integer> y = new TreeSet<>();

        for (int[] col:rectangle) {
            x.add(col[0]);
            x.add(col[2]);

            y.add(col[1]);
            y.add(col[3]);
        }

        ArrayList<Integer> xValues =new ArrayList<>();
        ArrayList<Integer> yValues = new ArrayList<>();
        xValues.addAll(x);
        yValues.addAll(y);

        HashMap<Integer,Integer> cordX =new HashMap<>();
        HashMap<Integer,Integer> cordY =new HashMap<>();
        for (int i=0;i<xValues.size();i++) {
            cordX.put(xValues.get(i),i);
        }
        for (int i=0;i<yValues.size();i++) {
            cordY.put(xValues.get(i),i);
        }
        boolean[][] visited = new boolean[xValues.size()][yValues.size()];

        long answer =0;
        for (int rect=0;rect<n;rect++) {
            long pre =answer;
            for (int i=cordX.get(rectangle[rect][0]);i<cordX.get(rectangle[rect][2]);i++) {
                for (int j=cordY.get(rectangle[rect][1]);j<cordY.get(rectangle[rect][3]);j++) {
                    if (!visited[i][j]) {
                        int width =xValues.get(i+1)-xValues.get(i);
                        int height =yValues.get(j+1)-yValues.get(j);
                        long curr = (width*height)%mod;
                        answer =(answer+curr)% mod;
                        visited[i][j]= true;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
/*
Problem Statement
You are given a 2D array of axis- aligned rectangles. Each rectangle[i] = [xi1, yi1, xi2, yi2] denotes the ith rectangle where (xi1, yi1) are the coordinates of the bottom- left corner, and (xi2, yi2) are the coordinates of the top- right corner.

Calculate the total area covered by all rectangles in the plane. Any area covered by two or more rectangles should only be counted once.

Return the total area. Since the answer may be too large, return it modulo 10^9 + 7.
Input
There is an integer n(size of ractangles, 2d array) is given as input.
In next n lines coordinates of each rectangle are given as input.

Constraints
1 <= rectangles.length <= 200
rectanges[i].length == 4
0 <= xi1, yi1, xi2, yi2 <= 109
Output
Return the total area. Since the answer may be too large, return it modulo 10^9 + 7.
Example
Sample Input:
3
0 0 2 2
1 0 2 3
1 0 3 1

Sample Output:
6

Explanation: A total area of 6 is covered by all three rectangles, as illustrated in the picture.
From (1, 1) to (2, 2), the green and red rectangles overlap.
From (1, 0) to (2, 3), all three rectangles overlap.
Example 2:

Input: rectangles =
 */
