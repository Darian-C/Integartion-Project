import java.util.Random;
import java.util.Scanner;

public class Integration {
		 
		  public static void main(String[] args) { 
		    // Darian Colon 
		    // PS1 
		    // Create project - executable Java application with a main method 
		    // Add your name as a comment at top 
		    // Add a description of the program as a comment at top 
		    // Produce console output - display a greeting / introduction to the user 
		 
		    System.out.println("Hello, this is my integration project!"); 
		 
		    // A list and description of Java built-in data types within the user interface or in comments 
		    // Use the four main types of variables (boolean, int, double, String) with appropriate names 
		    // and define (in English) variable and scope 
		    // Use final and describe what it means in a comment 
		 
		    System.out.println( 
		        "You should know 8 primitive data types called: byte, short, int, long, float, double, " 
		            + "boolean, and char"); 
		 
		    System.out.println( 
		        "A byte is data type that has a length of 8 bits, a minimum value of -128, and a maximum of 127 (inclusive)."); 
		 
		    System.out.println( 
		        "A short is a 64 bit data type with a minimum of -32,768 and a maximium of 32,767."); 
		 
		    System.out.println( 
		        "Int is a 32 bit data type that has a minimum value of -2^31 and a maximum value of 2^31."); 
		 
		    System.out 
		        .println("Long has a 64 bit lenght with a min value of -2^63 and a max value of 2^63."); 
		 
		    System.out 
		        .println("Float is a single-precision 32 bit data type with a large range of values."); 
		 
		    System.out.println("Double is a double-precision 64 bit data type. "); 
		 
		    System.out.println("Boolean is a data type with only two outcomes or possible values."); 
		 
		    System.out.println("Char has a single 16 bit unicode charater."); 
		 
		    System.out.println("A variable holds value. Its like a box that you can put things in." 
		        + "When you use the variable name, the value assigned to it is automatically used"); 
		 
		    System.out.println("Scope is the section of code in which a variable can be accessed."); 
		 
		    System.out.println("I will now demestrate some examples."); 
		 
		    String myName = "Darian"; 
		 
		    int myAge = 20; 
		 
		    double myHeight = 5.4; 
		 
		    boolean trueVariable = true; 
		 
		 
		    System.out.println(myName + " is " + myAge + " and " + myHeight + " feet tall."); 
		 
		    System.out 
		        .println("Final is a keyword used to make a variables value constant or unchangable."); 
		 
		    final int x = 10; 
		 
		    System.out.println("Darian has " + x + " fingers."); 
		 
		    // Casting is changing one object type into another object type. 
		 
		    System.out.println("This is an example of casting"); 
		 
		    double a = 2.5; 
		    int b = (int) a; 
		 
		    System.out.println(b);  
		  } 
		 
		  // ------------------------------------------------------------------------------ 
		  // PS2 
		  public static int examples(int x){
			Scanner input = new Scanner (System.in);
	        int age;
	        System.out.println("Enter your age:");
	        age = input.nextInt();
			
	        //Example of if/else 
	        //Relational operators
			if (age > 21) {
				System.out.println("You are ok to drink alcholhol.");
				}
			else if (age <= 21) {
				System.out.println("You are not allowed to drink alcholhol.");
			}
			//switch
			switch(age) {
				case 18: 
					System.out.println("At 18 you are considered an adult but "
						+ "you cannot drink.");
				case 19:
					System.out.println("At 19 you are an adult but you cannot drink.");
				case 20:
					System.out.println("At 20 you cannot drink yet.");
				case 21:
					System.out.println("Your are allowed to drink at 21");
				default:
					System.out.println("Unless you are 21 or older, "
							+ "you cannot drink.");
			}
			
			System.out.println("I will show you how to randomly generate a"
			+ " number between 0 an 20.");
			Random generator = new Random();
			int num = generator.nextInt(20);
			System.out.println(num);
			
			//Example of Math class
			int m = -5;
			System.out.println("We will find the absolute vale"
					+ "of -5. ");
			System.out.println(Math.abs(m));
			
			//while loops
			System.out.println("I will now show you examples "
					+ "of while loops.");
			int i = 0;
			
			//Operators
			System.out.println("What is zero minus one? " + --i);
			System.out.println("What is 11 plus 11? " + 2+2);
			System.out.println("What about three divded by one? " + 3/1);
			System.out.println("What is eight times two? " + 8*2);
			System.out.println("What is the remainder of nine "
					+ "divided by four? " + 9%4);
			//operator precedence is a bunch of rules that describe which procedures to 
			//perform and in what order to evaluate an expression 
			
			System.out.println("Count how many fingers do i have?");
			//for loop with a continue
			for (int t = 1;t <= 10;++t ) {
				System.out.println(t);
				continue;
			}
			
			System.out.println("We will start counting to three.");
			//while loop with a break
			while (i < 3) {
				System.out.println(++i);
				break;
				}
			
			System.out.println("Now count from 3 to 5.");
			//Do while loop
			int d = 3;
			do {
				System.out.println(d);
				++d;
			} while (d <= 5);
			return x;
		}
	}
