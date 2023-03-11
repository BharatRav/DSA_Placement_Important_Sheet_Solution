//Link:-https://my.newtonschool.co/playground/code/qew8addsnyah/
function oddball_sum(array){
// write code here
// use console.log to display the output
const newArray =array.filter((i) => {
    return i%2!==0
})
let sum=0;
newArray.map(item=> {
    sum =sum +item;
})
    console.log(sum)
}
//if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav


/*
Problem Statement
Write a function called oddball_sum which takes in a list of numbers and returns the sum of all the odd elements.
Try to solve with and without reduce function.
Input
An array containing numbers
Output
Sum of all the odd numbers in that array
Example
Sample Input:-
1 3 5 4

Sample output:-
9

Explanation-
1+3+5=9
*/
