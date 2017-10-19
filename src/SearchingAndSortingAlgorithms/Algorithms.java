package SearchingAndSortingAlgorithms;

import java.util.List;

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

	public static int countPearls(List<Boolean> oysters) {
		int Pearls = 0;
		for (int b = 0; b < oysters.size(); b++) {
			if (oysters.get(b).equals(true)) {
				Pearls = Pearls + 1;
			}
		}
		return Pearls;
	}

	public static double findTallest(List<Double> peeps) {
			double p = 0;
		 for (int c = 0; c < peeps.size(); c++) {
			 if (peeps.get(c) > p) {
				p = peeps.get(c);
			} 
			p = peeps.get(c);
		}
		 return p;
	 }
	public static boolean containsSOS(List<String> message) {
		if(message.contains("... --- ...")) {
			return true;
		}

	}
}