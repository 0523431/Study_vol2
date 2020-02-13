package week_02;

import java.util.Scanner;
import java.util.Stack;

public class back_9012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		Stack<Character> s = new Stack<>();
		
		boolean right = true;
		while(t >0) {
			// √ ±‚»≠
			s = new Stack<>();
			right = true;
			
			String left = scan.next();
			for(int i=0; i<left.length(); i++) {
				Character c = left.charAt(i);
				
				if(c.equals('(')) {
					s.push(c);
				} else if(c.equals(')')) {
					if(s.empty()) {
						System.out.println("NO");
						right = false;
						break;
					} else {
						s.pop();
					}
				}
			}
			if(s.empty()) { // &&∑Œ right∏¶ π≠¿∏∏È æ»µ .....
				if(right !=false) {
					System.out.println("YES");
				}
			} else System.out.println("NO");
			t--;
		}
	}
}
