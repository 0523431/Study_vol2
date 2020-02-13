package week_01;

import java.util.Scanner;

public class Prog_42576 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total = scan.nextInt();
		
		String[] participant = new String[total];
		String[] completion = new String[total-1];
		
		for(int i=0; i<participant.length; i++) {
			participant[i] = scan.next();
		}
		
		for(int i=0; i<completion.length; i++) {
			completion[i] = scan.next();
		}
		
		for(int i=0; i<participant.length; i++) {
			for(int j=0; j<completion.length; j++) {
				if(participant[i].equals(completion[j])) {
					
				}
			}

		}
	}
}
