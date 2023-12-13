package practiceJava.Variables_Datatrype_Operators;
/*
Activity 2: My First Variable Naming
Open your IntelliJ Idea IDE and follow the instructions below
Create a project called MyFirstVariableNaming
Create a class titled "UserProfile"
Write code so that the app stores a users name, age, gender, job preference, nationality and blood type
Think about what variable names you want to assign to the properties above and variable name conventions to be followed.
Use the age to calculate the year when a user was born.
Print the values back to a user's console.
*/
import java.time.LocalDate;
import java.util.Scanner;

public class UserProfile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Please Enter Your name:");
		String usersName = sc.nextLine();
		System.out.println("Please Enter Your age:");
		int age = sc.nextInt();
		System.out.println("Please Enter Your Gender:");
		String gender = sc.nextLine();
		System.out.println("Please Enter Your JobPreference:");
		String jobpreference = sc.nextLine();
		System.out.println("Please Enter Your Nationality:");
		String nationality = sc.nextLine();
		System.out.println();
		System.out.println("Please Enter Your BloodType:");
		String BloodType = sc.next();		
		
		LocalDate cr = LocalDate.now();
		int birthYear = cr.getYear()-age;
		System.out.println("Here your details are: /n" +"Name:"+ usersName+ "/n"+"Age: "+ age+"/n");
	  System.out.println("Your Date of birth year:"+birthYear);
		sc.close();
		
	}

}
	
