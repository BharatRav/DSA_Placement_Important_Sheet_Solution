import java.util.*;
//Link:-https://my.newtonschool.co/playground/code/81atlx5m9mwk/
public class RectangularArea {

    static class Node {
        int start, end;
        Integer[] X;
        Node left, right;
        int count;
        long total;

        public  Node(int start, int end, Integer[] X) {
            this.start = start;
            this.end = end;
            this.X = X;
            left = null;
            right = null;
            count = 0;
            total = 0;
        }

        public int getRangeMid() {
            return start + (end - start) / 2;
        }

        public Node getLeft() {
            if (left == null) left = new Node(start, getRangeMid(), X);
            return left;
        }

        public Node getRight() {
            if (right == null) right = new Node(getRangeMid(), end, X);
            return right;
        }

        public long update(int i, int j, int val) {
            if (i >= j) return 0;
            if (start == i && end == j) {
                count += val;
            } else {
                getLeft().update(i, Math.min(getRangeMid(), j), val);
                getRight().update(Math.max(getRangeMid(), i), j, val);
            }

            if (count > 0) total = X[end] - X[start];
            else total = getLeft().total + getRight().total;

            return total;
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][4];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = areaOfRectangle(arr);
        System.out.print(ans);

        //if you like it plz give a star to the repository
        //it'll motivate us to do more questions for you
    }

    public static int areaOfRectangle(int rectangles[][]) {
        int OPEN = 1, CLOSE = -1;
        int[][] events = new int[rectangles.length * 2][];
        Set<Integer> Xvals = new HashSet();
        int t = 0;

        for (int[] rec: rectangles) {
            if ((rec[0] < rec[2]) && (rec[1] < rec[3])) {
                events[t++] = new int[]{rec[1], OPEN, rec[0], rec[2]};
                events[t++] = new int[]{rec[3], CLOSE, rec[0], rec[2]};
                Xvals.add(rec[0]);
                Xvals.add(rec[2]);
            }
        }

        Arrays.sort(events, 0, t, (a, b) -> Integer.compare(a[0], b[0]));

        Integer[] X = Xvals.toArray(new Integer[0]);
        Arrays.sort(X);
        Map<Integer, Integer> Xi = new HashMap();
        for (int i = 0; i < X.length; ++i)
            Xi.put(X[i], i);

        Node active = new Node(0, X.length - 1, X);
        long ans = 0;
        long cur_x_sum = 0;
        int cur_y = events[0][0];

        for (int[] event: events) {
            if (event == null) break;
            int y = event[0], typ = event[1], x1 = event[2], x2 = event[3];
            ans += cur_x_sum * (y - cur_y);
            cur_x_sum = active.update(Xi.get(x1), Xi.get(x2), typ);
            cur_y = y;
        }

        ans %= 1_000_000_007;
        return (int) ans;
    }
//    static  long mod = (long)1e9+7;
//    public static void main (String[] args) {
//        // Your code here
//
//        //only 2 cases working others get Runtime Error
//        Scanner sc =  new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[][] rectangle = new int[n][4];
//
//        for (int i=0;i<n;i++) {
//            for (int j=0;j<4;j++) {
//                rectangle[i][j] =sc.nextInt();
//            }
//        }
//
//        TreeSet<Integer> x = new TreeSet<>();
//        TreeSet<Integer> y = new TreeSet<>();
//
//        for (int[] col:rectangle) {
//            x.add(col[0]);
//            x.add(col[2]);
//
//            y.add(col[1]);
//            y.add(col[3]);
//        }
//
//        ArrayList<Integer> xValues =new ArrayList<>();
//        ArrayList<Integer> yValues = new ArrayList<>();
//        xValues.addAll(x);
//        yValues.addAll(y);
//
//        HashMap<Integer,Integer> cordX =new HashMap<>();
//        HashMap<Integer,Integer> cordY =new HashMap<>();
//        for (int i=0;i<xValues.size();i++) {
//            cordX.put(xValues.get(i),i);
//        }
//        for (int i=0;i<yValues.size();i++) {
//            cordY.put(xValues.get(i),i);
//        }
//        boolean[][] visited = new boolean[xValues.size()][yValues.size()];
//
//        long answer =0;
//        for (int rect=0;rect<n;rect++) {
//            long pre =answer;
//            for (int i=cordX.get(rectangle[rect][0]);i<cordX.get(rectangle[rect][2]);i++) {
//                for (int j=cordY.get(rectangle[rect][1]);j<cordY.get(rectangle[rect][3]);j++) {
//                    if (!visited[i][j]) {
//                        int width =xValues.get(i+1)-xValues.get(i);
//                        int height =yValues.get(j+1)-yValues.get(j);
//                        long curr = (width*height)%mod;
//                        answer =(answer+curr)% mod;
//                        visited[i][j]= true;
//                    }
//                }
//            }
//        }
//        System.out.println(answer);
//    }
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
