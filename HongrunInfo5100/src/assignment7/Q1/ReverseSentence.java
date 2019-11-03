package assignment7.Q1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ReverseSentence {
	public static String ReverseSentence(String inputString){
		String[] words = inputString.split("\\s");
		String outputString = "";
		for (int i=words.length-1;i>=0;i--){
			outputString=outputString+ words[i] + " ";
		}
		return outputString;
	}
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input sentence:");
		String inputString = sc.nextLine();
		String outputString = ReverseSentence(inputString);
		System.out.println("Input:"+ inputString);
		System.out.println("Output:"+ outputString);
		PrintWriter writer = new PrintWriter("ReverseSentence.txt","UTF-8");
		writer.println(inputString);
		writer.println(outputString);
		writer.close();
	}
}
