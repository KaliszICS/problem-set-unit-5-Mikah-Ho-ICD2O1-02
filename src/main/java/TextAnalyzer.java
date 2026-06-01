/**
 * File: Problem Set 3 - Text Analyzer
 * Author: Mikah Ho
 * Date Created: May 12, 2026
 * Date Last Modified: May 15, 2026
 */

/**
 * i gave up
 * it's like an annual thing at this point
 * and know that it has nothing to do with you, your teaching or this class
 * i do really like the class the way it is
 * i'm just not a very good student
 * 
 * sometimes i wish i never grew up or knew as much as i do now                            //so here's me yapping about something completely unrelated to cs for way too long
 * i would've been so much more diligent and compliant when it came to school              //sorry i know you didn't come here to listen to me rant
 * and it's not like i don't want to improve
 * there's just something in my conscience that keeps me from doing so
 * something about school really doesn't sit right with me
 * i'm not trying to put all the blame on the system
 * but i feel that a part of it is deeply flawed
 * and i really wish there was something i could do about it
 * because i know for a fact that i'm not the only one who thinks so
 * i've only heard more and more complaints about school the older i've gotten
 * 
 * anyway, that's not really the point
 * i just need help on where to go from here
 * i'm fried for grade 12 if i keep giving up on everything
 * i really can't function like the average student
 * so how can i find a way to work with myself?
 */ 

import java.util.Scanner;
import java.util.Arrays;

public class TextAnalyzer {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		System.out.print("Welcome to the Text Analyzer.\n\nPlease enter a sentence or paragraph: ");
		String text = input.nextLine();

		String[] words = ((text.trim()).toLowerCase()).split(" ");

		System.out.println("\nTotal Characters: " + text.length() +
						   "\nTotal Words: " + words.length + 
						   "\nTotal Vowels: " + countVowels(text) +
						   "\nTotal Spaces: " + (words.length - 1) + //number of spaces is equal to number of words minus 1
						   "\n\nWord Frequency:\n\n"
		);
	}

	public static String[] splitWords(String text) {

		String[] words = ((text.trim()).toLowerCase()).split(" ");

		for (int i = 0; i < words.length; i++) {

			String checkWord = (words[i]);//.split(""); //sets current word being checked, splits characters

			// for (i = 0; i < checkWord.length; i++) {

				if (!(checkWord.charAt(checkWord.length()) >= 65 && checkWord.charAt(checkWord.length()) <= 90) || //capital letters
				!(checkWord.charAt(checkWord.length()) >= 97 && checkWord.charAt(checkWord.length()) <= 122)) { //lowercase

					words[i] = checkWord.substring(0,(checkWord.length() - 1));	//cuts off last index

				}
			// }

		}

		return words;
	}

	public static int countVowels(String text) {

		int numOfVowels = 0;

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == 'a' || text.charAt(i) == 'i' || text.charAt(i) == 'u' || text.charAt(i) == 'e' || text.charAt(i) == 'o') {

				numOfVowels++;
			}
		}

		return numOfVowels;
	}

	public static String[] getWordFrequency(String[] words) { 

		String[] wordFrequency = new String[words.length];

		for (int i = 0; i < words.length; i++) { //i don't even remember what i was trying to do here

			if (i == 1) {

			}
		}

		return wordFrequency;
	} 

}
