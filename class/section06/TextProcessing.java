package section06;

import java.util.Arrays;

public class TextProcessing {

	public static void main(String[] args) {
		// (M)cCain, (O)bama, (I)ndependent
		String voteText = "MOOOOOOMMMMMOOOOOOMOMMIMOMMIMOMMIO";
		tallyVotes(voteText);


	}
	
	public static void tallyVotes(String votes) {
	    int[] tallies = new int[3];   // M -> 0, O -> 1, I -> 2

	    for(int i = 0; i < votes.length(); i++) {
	        if(votes.charAt(i) == 'M') {
	            tallies[0]++;////M이면 tallies 가 1 커짐 즉 M의 개수 세는 것임
	        } else if(votes.charAt(i) == 'O') {
	            tallies[1]++;
	        } else {                  // votes.charAt(i) == 'I'
	            tallies[2]++;
	        }
	    }

	    System.out.println("Votes: " + Arrays.toString(tallies));
	}
}
