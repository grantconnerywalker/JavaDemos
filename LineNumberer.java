package fall2012;
import java.io.*;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class LineNumberer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader = null;
		Scanner in = null;
		String inFile = null;

		if (args.length >= 1)
		{
			inFile = args[0];
		}
		/*
		JFileChooser chooser = new JFileChooser();
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
		{
			File selectedFile = chooser.getSelectedFile();
			reader = new FileReader(selectedFile);
		}
		*/
		//System.out.print("Enter the input file name: ");
		//Scanner scan = new Scanner(System.in);		
		//inFile=scan.next();

		//inFile = "srcCode.txt";
		reader = new FileReader(inFile);
		
		in = new Scanner(reader);
		
		String outFile = "output.txt";
		PrintWriter out = new PrintWriter(outFile);
		int lineNumber = 1;
		while (in.hasNextLine())
		{
			String line = in.nextLine();
			out.println("/* " + lineNumber + "*/ " + line);
			lineNumber++;
		}
		out.close();

	}

}
