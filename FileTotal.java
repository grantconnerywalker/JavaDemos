package fall2012;
import java.io.*;
import java.util.Scanner;

public class FileTotal {

	public static void main(String[] args) {
		FileReader reader = null;
		Scanner in = null;
		String inFile = "numbers.txt";
		try {
			reader = new FileReader(inFile);
			in = new Scanner(reader);

		} catch (FileNotFoundException e)
		{
			//System.out.println("File not found! " + inFile);
			//e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
		}

		int total = 0;
		String strNum = null;
		try {

			while (in.hasNext())
			{
				strNum = in.next();
				int num = Integer.parseInt(strNum);
				if (num < 0)
					//throw new NegativeNumberException("Error: value can't be < 0, input = " + num);
					throw new NegativeNumberException(num);
				total += num;
			}
		} catch (NumberFormatException e)
		{
			System.out.println("Error, non-numeric value found " + e.getMessage());
		}
		catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This will always be done");
		}
		/*
		while (in.hasNextInt())
		{
			int num = in.nextInt();
			total += num;
		}
		 */
		System.out.println("total " + total);
	}

}
