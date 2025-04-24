package driver;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Driver //testing
{
	public static int counter = 0;
	
	public static void main(String[] args) throws FileNotFoundException
	{
	readCreditCards("numbers.txt");
	System.out.println();
	System.out.println("There are " + counter + " cards that are valid.");
	
	}
		//Scanner userStringInput = new Scanner(System.in);
		//System.out.println("Please put in a credit card number");
		//String card = userStringInput.nextLine();
		
		//int sum = 0;
		
		//for (int i = 0; i < card.length(); i++)
		//{
			//int num = Integer.parseInt(card.substring(i, i + 1));
			
			//if (i % 2 == 0)
			//{
				//num = num * 2;
			//}
			
			//if (num >= 10) 
			//{
				//num = (num / 10) + (num % 10);
			///}
			
			//sum = sum + num;
		//}
			
			//if (sum % 10 == 0)
			//{
				//System.out.println("This credit card may be valid.");
			//}
			
			//else
			//{
				//System.out.println("This credit card is not valid. You can't scam me!");
			//}
		
		//}

//private int numbers;
		
	//}

public static void readCreditCards(String fileName) throws FileNotFoundException
{
	File digits = new File ("numbers");
	Scanner input = new Scanner (digits);
	
	while (input.hasNextLine())
	{
		String card = input.nextLine();
		boolean valid = check(card);
		
		if (valid)
		{
			System.out.println(card + " may be valid");
		}
		
		else
		{
			System.out.println(card + " is not valid. You can't trick me!");
		}
	}
input.close();

}

public static int doubleNumber(int num)
{
	int result = num * 2;
	
	if (result >= 10)
	{
		result = (result / 10) + (result % 10);
	}
	return result;
}

public static boolean check(String card)
{
	int sum = 0;
	
	for (int i = 0; i < card.length(); i++)
	{
		int num = Integer.parseInt(card.substring(i, i +1));
		
		if (i % 2 == 0)
		{
			num = num * 2;
			
			if (num >= 10)
			{
				num = (num / 10) + (num % 10);
			}
		}
		sum += num;
	}
	
	if (sum % 10 == 0)
	{
		counter++;
		return true;
		
	}
	
	else 
		
	{
		return false;
	}
}
}
