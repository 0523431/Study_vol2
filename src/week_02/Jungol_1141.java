package week_02;

import java.util.Scanner;

public class Jungol_1141 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] cowheight = new int[N];
		
		for(int i=0; i<cowheight.length; i++) {
			cowheight[i] = scan.nextInt();
		}
		
		int cansee =0;
		for(int i=0; i<cowheight.length-1; i++) {
			for(int j=i+1; j<cowheight.length; j++) {
				if(cowheight[i] > cowheight[j]) {
					cansee++;
					//System.out.println("확인 "+(i+1)+"번 소 : "+(j+1)+"번 소");
				} else if(cowheight[i] < cowheight[j]){
					break;
				}
			}
		}
		System.out.println(cansee);
	}
}
