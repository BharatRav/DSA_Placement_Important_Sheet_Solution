import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/5sem4afaxu7w/
public class BoundaryTraversalOfAMatrix {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int tc= sc.nextInt();
        while (tc-->0) {
            int n=sc.nextInt();
            int m=sc.nextInt();

            int[][] arr = new int[n][m];
            for (int i=0;i<n;i++) {
                for (int j=0;j<m;j++) {
                    arr[i][j]= sc.nextInt();
                }
            }

            boundaryTraversal(arr,n,m);
            System.out.println();
        }
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
    }
    private static void boundaryTraversal(int[][] arr, int n, int m) {
        //edg cases
        if(n==1 && m==1) {
            System.out.print(arr[0][0]);
            return;
        }
        //upper boundary
        for (int j=0;j<m;j++) {
            System.out.print(arr[0][j]+ " ");
        }
        if(n==1) {
            return;
        }

        //right boundary
        for (int i=1;i<n-1;i++) {
            System.out.print(arr[i][m-1]+ " ");
        }

        //bottom boundary
        for (int j=m-1;j>=0;j--) {
            System.out.print(arr[n-1][j]+ " ");
        }

        if (m==1) {
            return;
        }

        //left boundary
        for (int i=n-2;i>0;i--) {
            System.out.print(arr[i][0]+ " ");
        }
    }
    //my second method i used it previously
    /*
    public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int tc= sc.nextInt();
		while(tc>0){
			int rows_length= sc.nextInt();
			int cols_length= sc.nextInt();
			int[][] arr= new int[rows_length][cols_length];
			for(int row=0;row<rows_length;row++){
				for(int cols=0;cols<cols_length;cols++){
					arr[row][cols]= sc.nextInt();
				}
			}

			if(rows_length==1){
				for(int i=0;i<cols_length;i++){
					System.out.print(arr[0][i]+" ");
				}
			}else if(cols_length==1){
				for(int i=0;i<rows_length;i++){
					System.out.print(arr[i][0]+" ");
				}
			}
			else{
					// for first row
				for(int i=0;i<cols_length;i++){
					System.out.print(arr[0][i]+" ");
				}
				// for right column
				for(int i=1;i<rows_length-1;i++){
					System.out.print(arr[i][cols_length-1]+" ");

				}
				//last row
				for(int i=cols_length-1;i>=0;i--){
					System.out.print(arr[rows_length-1][i]+" ");
				}
				// for left column
				for(int i=rows_length-2;i>0;i--){
					System.out.print(arr[i][0]+" ");
				}
			}
			System.out.println();
			tc--;
		}
	}
    */
}
/*
Problem Statement
You are given a matrix A of dimensions n x m. The task is to perform boundary traversal on the matrix in clockwise manner.
Input
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase two lines of input. The first line contains dimensions of the matrix A, n and m. The second line contains n*m elements separated by spaces.

Constraints:
1 <= T <= 100
1 <= n, m <= 30
0 <= A[i][j] <= 100
Output
For each testcase, in a new line, print the boundary traversal of the matrix A.
Example
Input:
4
4 4
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
3 4
12 11 10 9 8 7 6 5 4 3 2 1
1 4
1 2 3 4
4 1
1 2 3 4

Output:
1 2 3 4 8 12 16 15 14 13 9 5
12 11 10 9 5 1 2 3 4 8
1 2 3 4
1 2 3 4

Explanation:
Testcase1: The matrix is:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
The boundary traversal is 1 2 3 4 8 12 16 15 14 13 9 5
Testcase 2: Boundary Traversal will be 12 11 10 9 5 1 2 3 4 8.
Testcase 3: Boundary Traversal will be 1 2 3 4.
Testcase 4: Boundary Traversal will be 1 2 3 4.
 */
