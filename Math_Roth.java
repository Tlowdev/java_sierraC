/*
Name:Tylor Roth
date:04/20/2023
description:Math question using array
self grade:
*/
import java.util.*;
public class Math_Roth 
{

}
class MathQuiz
{
public static void main(String[] args)
{
prep();
}
/*
This method declares 3 arrays to hold questions, answers and the points for each
question.
calls the method populate to fill in the three arrays with math questions,
answers and points
follow thw given algorithm line by line to implemnet the code
*/
public static void prep()
{
//1. declare an array of type string with the size 5 to hold the math
//questions
//2. declare an int array of size 5 to hold the answer in each math question
//3. declare an array of int with size 5 to hold the points for each question
//4. create a random object
//5.create a Scanner object
boolean repeat = true;
while(repeat)
{
//6. generate a random number between 11 and 20
//7. generate a random number between 5 and 10
//8. call the method populate and pass the variables declared at steps
//1,2,3,6,7
//9.call the method test and pass the variables declared at step 1,2,3 .
// method test returns an it so make sure to store the result in a
//variable
//10. display the result that you got at step 9. this is the score thefore
//display a message to the user
//11. ask the user if they want to play again and store it in a variable
//12. if the user's answer equals to no (you need to use equals method
//from the string clas
// then set the repeat to false
}
}
/* This method generates math expressions randomly, the operations used are /+ *
% -
each math expression will be stored in the array called quiz, the correct answer
for each expression will be stored
in the array answe, and the points for each question will be stored in the array
points.
max and min are used to generate a random number between min and max for each
number.
Valid operations are stored in the array operation. a random number between 0
and 3 must be generated
to pick a random operation
and assign points for each question in the array values*/
public static void populate(String[] quiz, int[] answer, int[] points, int max,
int min)
{
char[] operation = {'*', '/', '+','-'}; // valid operations
//create a Random object
for(int i = 0; i < quiz.length; i++)
{
//1. generate a random number between min nad max and store it in a
//variable of type int
//2. generate another random number between min and max and store it in a
//variable of type int
//3. generate a randon number between 1 and 4 store it in a variable called
//index: this would be the index for the array operation to choose a random operation
//4. declare a variable of type char, and assign operation[index] to it
//5. build the expression using the randon munbers generated and the
//random operation created in step 4
//6. assign the string that you built in step 5 to quiz[i]
//7. asnwers[i] = calculate(variable declared in step1, variable created
//at step 4, vaiable created at step 2)
//8. generate a random number between 1-10 and assign it to points[i]
}
}
public static int calculate(int num1, char op, int num2)
{
switch(op)
{
case '*' :
return num1 * num2;
case '/' :
return num1/num2;
case '+' :
return num1 + num2;
case '-' :
return num1 - num2;
default :
return -1;
}
}
/* this method gets the three arrays containg the questions, the correct answer
for each question and the points for each question
this method displays one question at a time for the user to answer, verifies the
user's answer
by comparint it to the proper index in the answers array
if the person's answer is correct then the correct poits will be added to the
user's score
return the score at the end*/
public static int test(String[] questions, int[] answers, int[] values)
{
//1. declare an int variable to hold the score, set it to zero
int score = 0;
//2. create a Scanner object
for(int i = 0; i < answers.length; i++)
{
//3. display the question in the questions array at the index i
//4. declare an int variable and to store the user's answer
//if the user's answer is equal to the answers[i]
{
//add the valuies[i] to the score, this is a cumulative sum: score =
//score + values[i]
//display a message the points that the user gained answerin this
//question
}
// else
//display a message indicating that the answer was wrong
}
return score;
}
}