Open your Eclipse IDE and follow the instructions below
Create a project called 'MyFirstInput'
Create a class called MyFirstInput
Add a main method to your app.
Make your code looks like the file shown below
package com.generation.java;
import java.io.Console;

class MyFirstInput {
 public static void main(String[] args) {
   Console console = System.console();
   System.out.println("Please enter your name ");
   String name = console.readLine();

   System.out.println("My name is "+ name);
 }
}
Run your application.
Notice the prompt on the IntelliJ console asking you to enter your name.
Have a discussion with your pair partner on what you think each line of the code above does.
Activity 2: My First Variable Naming
Open your IntelliJ Idea IDE and follow the instructions below
Create a project called MyFirstVariableNaming
Create a class titled "UserProfile"
Write code so that the app stores a users name, age, gender, job preference, nationality and blood type
Think about what variable names you want to assign to the properties above and variable name conventions to be followed.
Use the age to calculate the year when a user was born.
Print the values back to a user's console.
Extra features
If you're able to implement the steps above with time to spare, add the following features to your app.

Instead of storing values in the static variables (variables manually assigned to values), have it so that a few variables are entered by a user through the console.
Activity 3: Variable Naming and Type Casting
Open your IntelliJ Idea IDE and follow the instructions below
Create a project on IntelliJ. This time feel free to give it an appropriate name. hint We're going to be finding the area and perimeter of a circle.
Write a java application that prompts a user to enter the diameter of a circle and calculates the area and perimeter of the circle.
Perform a widening casting operation (integer to double) when storing the result of the operations.
Print out the results of the two operations in the console.
