package week_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Jungol_2863 {
	public static void main(String[] args) throws IOException {
		int[] numbers = new int[20];
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i +1;
		}
		
//		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt =10;
		while(cnt > 0) {
			cnt--;
			String area = br.readLine();
			StringTokenizer st = new StringTokenizer(area);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int mid = (b-a+1)/2 +a-1;
			
			int temp =0;
			for(int i=a-1; i<mid; i++) {
				temp = numbers[i];
//				System.out.println("temp"+(i+1)+"="+temp);
				numbers[i] = numbers[--b];
				numbers[b] = temp;
			}
			
			if(cnt ==0) {
				for(int num : numbers) {
					System.out.print(num+" ");
				}
			}
		}
	}
}
