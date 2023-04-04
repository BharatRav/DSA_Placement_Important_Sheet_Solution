import java.util.ArrayList;
import java.util.List;

//Link:-https://my.newtonschool.co/playground/code/qf95m9ci5v99/
public class SwapAdjacentInLRAdjacent {
    public boolean canTransform(String start, String end) {
        // enter your code here.
        String startStr = start.replace("X", "");
        String endStr = end.replace("X", "");

        if(!(startStr.equals(endStr)) ) return false;
        List<Integer> startL = new ArrayList<>();
        List<Integer> startR = new ArrayList<>();
        List<Integer> endL = new ArrayList<>();
        List<Integer> endR = new ArrayList<>();


        for(int i=0; i<start.length(); i++){
            if(start.charAt(i) == 'L')
                startL.add(i);
            else if(start.charAt(i) == 'R')
                startR.add(i);
        }

        for(int i=0; i<end.length(); i++){
            if(end.charAt(i) == 'L')
                endL.add(i);
            else if(end.charAt(i) == 'R')
                endR.add(i);
        }

        // check L positions are correct
        for(int i=0; i<startL.size(); i++){
            if(startL.get(i) < endL.get(i))
                return false;
        }

        // check R positions are correct
        for(int i=0; i<startR.size(); i++){
            if(startR.get(i) > endR.get(i))
                return false;
        }

        return true;
    }
}
/*
Problem Statement

In a string composed of 'L', 'R', and 'X' characters, like "RXXLRXRXL", a move consists of either replacing one occurrence of "XL" with "LX", or replacing one occurrence of "RX" with "XR". Given the starting string start and the ending string end, return True if and only if there exists a sequence of moves to transform one string to the other.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function canTransform() that takes strings "start" and "end" as parameters.

Constraints:
1 ≤ start. length ≤ 104
start. length == end. length
Both start and end will only consist of characters in 'L', 'R', and 'X'.
Output
Return true if and only if there exists a sequence of moves to transform one string to the other otherwise, return false.
ai_logoASK NEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample 1:
Input: start = "RXXLRXRXL", end = "XRLXXRRLX"
Output: true
Explanation: We can transform start to end following these steps:
RXXLRXRXL - > XRXLRXRXL - > XRLXRXRXL - > XRLXXRRXL - > XRLXXRRLX

Sample 2:
Input: start = "X", end = "L"
Output: false
 */