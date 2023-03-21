import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//Link:-https://my.newtonschool.co/playground/code/fiuzfr571qy6/
public class ReverseStack {
    static Stack <Integer> St = new Stack();
    static void Reverse_Stack(){
//Enter your code here
        Queue<Integer> queue = new LinkedList<>();
        while(!St.isEmpty()) {
            queue.add(St.pop());
        }

        while(!queue.isEmpty()) {
            St.push(queue.remove());
        }
    }
    //if you like it plz give a star to the repository
    //it'll motivate us to do more question
    //http://github.com/bharatrav
}
/*
Problem Statement
Given a stack containing some integers, your task is to reverse the given stack.

Note:- Try to do this question using recursion, do not use any loop.
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions Reverse_stack() that takes no parameter.

Constraints:
1 <= Elements in stack <= 100

Custom Input:
First line of input should contain the number of elements N of the stack, the next line of input should contain N space separated integers depicting the elements of the stack.
Output
You don't need to return or print anything just complete the given function.

Note:- For the custom input if your code is correct then the elements will be printed in the same order.
Example
Sample Input:-
Stack = {1, 2, 3, 4, 5}, where top = 5

Sample Output:-
Stack = {5, 4, 3, 2, 1} where top = 1
 */