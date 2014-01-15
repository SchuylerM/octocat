import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class ScrubsQuotesConsole {

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

	/**
	 * ****
	 *  Write a program that interfaces with the console, and as you write any text it gives you a random scrubs quote
	 *  the program should only give a quote if it receives text (if it's given blank text, it should say 'you must talk in order to get a scrubs quote.')
	 *  the program will exit when the user types 'go away'.  Bonus points if it is case insensitive (GO AWAY and Go Away would make the program exit)
	 *  
	 *  To save you time, I have given you an ArrayList of scrubs quotes that you can use.
	 * ****
	 * @param args
	 * if (userInput ==  "/^$/")
	 * 
	 * 
	 * PROBLEMS:
	 * - When you start the console it would be a better experience if it told you 'please enter some text to receive a scrubs quote' or something like that.
	 *	 Otherwise, when you start it nothing actually happens until you navigate to the console and start typing
	 * - Already told you earlier, but the spacing is off and it makes it hard to read your code.  Code readability and formatting is really important
	 * - You should see a warning in eclipse that says resource leak, scanner is never closed. You just need to add this after the while loop:
	 * 		scanner.close(); 
	 * 
	 * Other than those areas looks alright, does what it should do, and good job figuring out the case insensitive part.
	 */
	
		public static void main(String[] args) {
			boolean x = true; 
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();
			while(x){
			String userInput = scanner.nextLine();

			if (userInput.toLowerCase().equals("go away" )){
				System.out.println("Good Bye");
				x = false; 
			}
			else if (userInput.equals("")){
				System.out.println ("You must talk in order to get a scrubs quote. ");
			}
			else {

				
				int a = random.nextInt(scrubsQuotes.size()); 
				System.out.println (scrubsQuotes.get(a));
			}
			}
		}
	
}

