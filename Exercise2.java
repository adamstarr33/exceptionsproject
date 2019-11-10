/*
	Exercise2.java
	- WRITE A SINGLE DO LOOP THAT DOES THE FOLLOWING UNTIL THE USER ENTERS AN INT IN 1..100 INCLUSIVE
	- 	USE TRY CATCH TO READ AN INT FROM THE KBD SUCH THAT IF USER ENTERS "FOO" IT DOES NOT CRASH
	- 	BE SURE TO MANUALLY THROW AN EXCEPTION & CATCH IT FOR THE CASE OF USER ENTERING AN VALID 
	-	INT THAT HAPPENS TO BE OUT OF RANGE.

*/
import java.io.*;
import java.util.*;

public class Exercise2
{
	public static void main( String args[] )
	{
	Scanner input = new Scanner(System.in);
	int num;
	String entered;
	boolean integer;
		do
		{
		try
		{
			integer = true;
			System.out.print("Enter int in range 1..100 inclusive: ");
			entered = input.nextLine();
			num = Integer.parseInt(entered);
			if(num > 100 || num < 1)
			{
				System.out.println("Number:" + num + " out of range. Must be in 1..100");
				
				integer = false;
			}

			else
			{
				System.out.format("\nThank you. You entered %d", num );
			}
		}
			catch(Exception e)
		{
			System.out.println("Input was not an integer");
			integer = false;
		}
		// ADD LOOP CODE, ADD TRY CATCH BLOCK(S) AS NEEDED BELOW
		// BE SURE TO LEAVE THESE 3 LINES IN THERE SOMEWHERE  
		// SINCE THEY CONTAIN THE EXACT EXPECTED OUTPUT TEXt
	}while(integer == false); //END main
}
} //END CLSS