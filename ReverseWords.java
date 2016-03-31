import java.util.*;
import java.io.*;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int numberOfTests = in.nextInt();
		
		// jumps to first phrase
		in.nextLine();
		
		for (int testNumber = 1; testNumber <= numberOfTests; ++testNumber) {
			String phrase = in.nextLine();

			String[] words = phrase.split(" ");

			String reversedPhrase = "";
			for(int wordIndex = (words.length-1); wordIndex >= 0; wordIndex--){
				reversedPhrase += words[wordIndex] + " ";
			}
			System.out.println("Case #" + testNumber + ": " + reversedPhrase);
		}
	}
}
