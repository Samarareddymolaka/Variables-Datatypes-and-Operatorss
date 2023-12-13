package practiceJava.Variables_Datatrype_Operators;
import java.util.Scanner;
public class MyFirstInput {
	

	 public static void main(String[] args) {
	   Scanner sce = new Scanner(System.in);
	   System.out.println("Please enter your name: ");
	   String name = sce.next();

	   System.out.println("Your name is "+ name);
	   sce.close();
	 }
	}


