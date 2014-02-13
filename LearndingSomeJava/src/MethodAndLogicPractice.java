import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MethodAndLogicPractice {
	/**
	 * Source of quotes: http://www.imdb.com/title/tt0285403/quotes
	 */
	private static List<String> scrubsQuotes = new ArrayList<String>(
			Arrays.asList(
					"Dr. Cox: [in response to something J.D. just said] Oh, my God! I care so little, I almost passed out!",
					"Carla: [about a male intern] You're right; he definitely has a cute little butt.\nElliot: It's almost like it's been sculpted.\nJ.D.: Who cares? Everyone has a cute butt; I have a cute butt.\nCarla: You should bring it in someday.",
					"Turk: How can you make love to your wife if she's at fat camp?\nDr. Kelso: The real question is: how can I make love to her when she's *not* at fat camp?",
					"Carla: Christopher!\nChris Turk: Christopher? You only call me Christopher when you're mad or when we're having sex... Baby, are you mad when we're having sex?\nCarla: Sometimes.",
					"[Somebody streaked in the hospital]\nChris Turk: I know it wasn't you last night. Look I'm not proud of this but I can pick your puff and stuff out of a line-up\nJ.D.: He changed since the last time you saw him. He got a haircut.",
					"Dr. Cox: [on the phone] Sure, Jordan, you can take over the master bathroom. Just make sure you leave my sleeping pills out. So that I could, you know, swallow about 300 of them...",
					"Janitor: Hey, Idiot.\n[J.D. turns around]\nJanitor: Heh. I said idiot and you turned around.",
					"Todd: [Todd is playing Pacman] Oh, Miss Pacman, I would sex that bow right off your head. Eat those dots you naughty, naughty girl.",
					"Jordan: I don't dislike you, I nothing you.\nJ.D.: That's special.",
					"J.D.: [after Janitor pops up behind him] Why do you have to jump out and scare me all the time?\nJanitor: I don't jump out and scare you. I follow you around all day. I only got about an hour and a half of work around here, and the rest of the time I track you, like an animal."
					));

	private final static String EXIT_MESSAGE = "exit"; 
	/**
	 * This assignment should help teach some separation of logic, passing of parameters between methods, and general increase of knowledge for Java
	 * You should read about and learn the method: String.format().  Remember to look at the API documentation
	 * 
	 * TODO:
	 * Write three methods:
	 *  1) one that handles all console output prefixed with ~ (see below example output for clarification), and calls the other methods 
	 *  2) one that searches through the array above for a user provided word (make sure this case insensitive of course)
	 * 	3) and one that let's the user know whether or not the index of where the quote was found is prime or not.
	 * 
	 * Three suggested method names:
	 * searchAndAnalyzeWord
	 * indexForSearchWord
	 * isPrime
	 * 
	 * Example output:
	 * lines prefixed with '$' are being printed in the static main() method
	 * lines prefixed with '~' are being printed in the searchAndAnalyzeWord() method
	 * lines prefixed with nothing are from the users input
	 * 
	 * 
		$ Enter word to search:
		hello
		~ Search word 'hello' could not be found.
		$ Enter word to search:
		word
		~ Search word 'word' could not be found.
		$ Enter word to search:
		cox
		~ Search word 'cox' found at 0.
		~ And search word's index '0' is not a prime number.
		$ Enter word to search:
		turk
		~ Search word 'turk' found at 2.
		~ And search word's index '2' is a prime number.
		$ Enter word to search:

		$ Invalid output, please enter one word to search.
		$ Enter word to search:
		hey you
		$ You can only enter one word searches at a time
		$ Enter word to search:

	 * 
	 * We will reuse the scrubs quotes from the last assignment
	 * Go ahead and copy over some of your console running logic from the previous assignment
	 * @param args
	 */

	public static void main(String[] args) {
		boolean x = true; 
		Scanner scanner = new Scanner(System.in);
		while(x){
			System.out.println ("$ Enter word to search.");
			String userInput = scanner.nextLine();
			int index = searchAndAnalyzeWord(userInput);
			boolean prime = isPrime(index);
			if(index > -1){	 
				System.out.println("Search word " + userInput +" found at " + index);
			}
			else {
				System.out.println("~Search word " + "'"+userInput+"'" + " could not be found");
			}
			if(prime == true){
				System.out.println("And search word's index " + "'"+index+"'" + " is a prime number");
			}
			else{
				System.out.println("And search word's index " + "'"+index+"'" + " is not a prime number");
			}

		}


	}
	/** 
	 * method that searches through the array above for a user provided word (make sure this case insensitive of course)
	 */
	private static int searchAndAnalyzeWord (String word){
		//word = word +":";
			
		for(int n = 0; n< scrubsQuotes.size(); n++){
			if(word.length() < scrubsQuotes.get(n).length()){
				String substr = scrubsQuotes.get(n).substring(0, scrubsQuotes.get(n).indexOf(':'));
				if(substr.toLowerCase().startsWith(word.toLowerCase())){	
					
					return n;
				}
			}
		}
		return -1;

	}
	/**
	 * determine if the returned value is actually prime or not
	 * @param n
	 * @return
	 */
	static boolean isPrime(int n) {
		//check if n is a multiple of 2
		if (n%2==0) return true;
		//if not, then just check the odds
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0)
				return true;
		}
		return false;
	}


}