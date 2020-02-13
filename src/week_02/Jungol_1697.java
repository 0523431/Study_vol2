package week_02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Jungol_1697 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		// queue
		Queue<Integer> q = new LinkedList<>();
		
		while(n >0) {
			String command = scan.next();
			if(command.equals("i")) {
				int num = scan.nextInt();
				q.add(num);
			} else if(command.equals("o")) {
				if(q.isEmpty()) {
					System.out.println("empty");
				} else {
					System.out.println(q.peek());
					q.poll();
				}
			} else if(command.equals("c")) {
				System.out.println(q.size());
			}
			n--;
		}	
	}
}
