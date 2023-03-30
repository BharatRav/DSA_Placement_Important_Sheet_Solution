//Link:-https://my.newtonschool.co/playground/code/u529l0u177pu/
public class RobotBoundedInCircle {
    public boolean isRobotBounded(String instructions) {
        // enter your code here.

        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
        if (instructions.length()==0) {
            return false;
        }

        int x =0,y=0;

        String direction ="North";

        for (char ch: instructions.toCharArray()) {
            if (ch=='G') {
                if (direction.equals("North")) {
                    y+=1;
                }
                else if (direction.equals("South")) {
                    y-=1;
                }
                else if (direction.equals("East")) {
                    x+=1;
                }
                else {
                    x-=1;
                }
            }
            else if (ch=='L') {
                if(direction.equals("North")) {
                    direction="West";
                }
                else if(direction.equals("West")) {
                    direction ="South";
                }
                else if(direction.equals("South")) {
                    direction ="East";
                }
                else {
                    direction ="North";
                }
            }
            else if (ch=='R') {
                if(direction.equals("North")) {
                    direction="East";
                }
                else if(direction.equals("West")) {
                    direction ="North";
                }
                else if(direction.equals("South")) {
                    direction ="West";
                }
                else {
                    direction ="South";
                }
            }
        }

        if(x==0 && y==0) {
            return true;
        }

        if (direction.equals("North")) {
            return false;
        }
        return true;
    }
}
/*
Problem Statement
On an infinite plane, a robot initially stands at (0, 0) and faces north. Note that:

:> The north direction is the positive direction of the y- axis.
:> The south direction is the negative direction of the y- axis.
:> The east direction is the positive direction of the x- axis.
:> The west direction is the negative direction of the x- axis.

The robot can receive one of three instructions:

:> "G": go straight 1 unit.
:> "L": turn 90 degrees to the left (i. e., anti- clockwise direction).
:> "R": turn 90 degrees to the right (i. e., clockwise direction).

The robot performs the instructions given in order, and repeats them forever.

Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function isRobotBounded() that takes string "instructions" as parameter.

Constraints:
1 ≤ instructions.length ≤ 100
instructions[i] is 'G', 'L' or, 'R'.
Output
Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
starsASK AI
BETA
Simpler Explanation
Concepts Used
Example
Sample 1:
Input: instructions = "GGLLGG"
Output: true
Explanation: The robot is initially at (0, 0) facing the north direction.
"G": move one step. Position: (0, 1). Direction: North.
"G": move one step. Position: (0, 2). Direction: North.
"L": turn 90 degrees anti-clockwise. Position: (0, 2). Direction: West.
"L": turn 90 degrees anti-clockwise. Position: (0, 2). Direction: South.
"G": move one step. Position: (0, 1). Direction: South.
"G": move one step. Position: (0, 0). Direction: South.
Repeating the instructions, the robot goes into the cycle: (0, 0) --> (0, 1) --> (0, 2) --> (0, 1) --> (0, 0).
Based on that, we return true.

Sample 2:
Input: instructions = "GG"
Output: false
Explanation: The robot is initially at (0, 0) facing the north direction.
"G": move one step. Position: (0, 1). Direction: North.
"G": move one step. Position: (0, 2). Direction: North.
Repeating the instructions, keeps advancing in the north direction and does not go into cycles.
Based on that, we return false.

Sample 3:
Input: instructions = "GL"
Output: true
Explanation: The robot is initially at (0, 0) facing the north direction.
"G": move one step. Position: (0, 1). Direction: North.
"L": turn 90 degrees anti-clockwise. Position: (0, 1). Direction: West.
"G": move one step. Position: (-1, 1). Direction: West.
"L": turn 90 degrees anti-clockwise. Position: (-1, 1). Direction: South.
"G": move one step. Position: (-1, 0). Direction: South.
"L": turn 90 degrees anti-clockwise. Position: (-1, 0).
 */