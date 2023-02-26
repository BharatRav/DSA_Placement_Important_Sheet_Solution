import java.util.Scanner;

public class Buildings {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        String temp[]=sc.nextLine().split(" ");
        int[] arr=new int[n];
        int ans=1;
        arr[0]=Integer.parseInt(temp[0]);
        int max =arr[0];	//assuming
        for(int i=1;i<n;i++){
            arr[i]=Integer.parseInt(temp[i]);

            if(max<arr[i]){
                ans++;
                max=arr[i];
            }
        }
        System.out.println(ans);
    }
}

/*
Problem Statement
There are N buildings in a row with different heights H[i] (1 <= i <= N).

You are standing on the left side of the first building .From this position you can see the roof of a building i if no building to the left of the ith building has a height greater than or equal to the height of the ith building.

You are asked to find the number of buildings whose roofs you can see.
Input
The first line contains N denoting number of buildings.
The next line contains N space seperated integers denoting heights of the buildings from left to right.


Constraints
1 <= N <= 100000
1 <= H[i] <= 1000000000000000
Output
The output should contain one integer which is the number of buildings whose roofs you can see.
Example
Sample input:
5
1 2 2 4 3

Sample output:
3

Explanation:-
the building at index 3 will hide before building at index 2 and building at index 5 will hide before building at index 4

Sample input:
5
1 2 3 4 5

Sample output:
5

 */