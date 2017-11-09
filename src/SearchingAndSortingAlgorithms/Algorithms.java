package SearchingAndSortingAlgorithms;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 1. Create a method that will find return the first index of a broken egg */
public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int a;
		for (a = 0; a <= eggs.size(); a++) {
			System.out.println();
			if (eggs.get(a).equals("cracked")) {
				return a;
			}
		}
		return -1;
		// <- this needs changing
	}

	// Add other methods here:
	/* 2. Count how many oysters contain pearls. */
	public static int countPearls(List<Boolean> oysters) {
		int Pearls = 0;
		for (int b = 0; b < oysters.size(); b++) {
			if (oysters.get(b).equals(true)) {
				Pearls = Pearls + 1;
			}
		}
		return Pearls;
	}

	/* 3. Create a method that will return the height of the tallest person. */
	public static double findTallest(List<Double> peeps) {
		double d = 0;
		for (int c = 0; c < peeps.size(); c++) {
			if (peeps.get(c) > d) {
				d = peeps.get(c);
			}
			// d = peeps.get(c);
		}
		return d;
	}

	/* 4. Create a method that will find the longest word. */
	public static String findLongestWord(List<String> words) {
		String f = "";
		for (int e = 0; e < words.size(); e++) {
			if (words.get(e).length() > f.length()) {
				f = words.get(e);
			}
			// f = words.get(e);
		}
		return f;
	}

	/*
	 * 5. The Morse code for SOS is "... --- ..." Create a method that can tell if
	 * SOS is contained in a message.
	 */
	public static boolean containsSOS(List<String> message) {
		for (int g = 0; g < message.size(); g++) {
			if (message.get(g).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	/* 6. Write a morse code translator to read the messages. Just kidding! */ // √

	/* 7. Sort the exam results from lowest to highest. */
	public static List<Double> sortScores(List<Double> results) {

		for (int h = 0; h < results.size(); h++) {
			for (int i = h + 1; i < results.size(); h++)
				if (results.get(h) > results.get(i)) {
					results.set(h, results.get(i));
				} else {
				}
		}
		return results;
	}

	/* 8. Sort the DNA sequences by length from shortest to longest. */

	public static List<String> sortDNA(List<String> unsortedDNA) {

		for (int j = 0; j < unsortedDNA.size(); j++) {
			for (int k = j + 1; k < unsortedDNA.size(); k++) {
				System.out.println(unsortedDNA.get(k));
				System.out.println(unsortedDNA.get(j));
				if (unsortedDNA.get(j).length() > unsortedDNA.get(k).length()) {
					String temp = unsortedDNA.get(j);
					unsortedDNA.set(j, unsortedDNA.get(k));
					unsortedDNA.set(k, temp);

				} else {

				}

			}
		}
		System.out.println(unsortedDNA);
		return unsortedDNA;
	}

	/*
	 * 9. Sort the words in alphabetical order. Your teacher may need to explain
	 * compareTo.
	 */

	public static List<String> sortWords(List<String> sortWords){
		
		for (int l = 0; l < sortWords.size(); l++) {
			for(int m = l+1; m < sortWords.size(); m++) {
				//int n = sortWords.get(l).compareTo(sortWords.get(m));
		if(sortWords.get(l).compareTo(sortWords.get(m)) > 0) {
					String o = sortWords.get(l);
					sortWords.set(l, sortWords.get(m));
					sortWords.set(m, o);
				}
				else {
					
				}
			}
		}
		
		return sortWords;
	}

}
