package week_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jungol_1214 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int hCnt = scan.nextInt();
		int[] h = new int[hCnt];
		for(int i=0; i<h.length; i++) {
			h[i] = scan.nextInt();
		}
		int bline =1;
		List area = new ArrayList();
		// h가 크거나 같은지 비교
		for(int i=0; i<h.length; i++) {
			bline =1; // 초기화
			for(int j=i+1; j<h.length; j++) {
				if(h[i] <= h[j]) {
					bline++;
					area.add(h[i] * bline);
				} else {
					break;
				}
			}
		}
		for(Object a : area) {
			System.out.println("넓이 : "+a);
		}
		int maxArea =0;
		for(int i=0; i<area.size()-1; i++) {
			if(i ==0) {
				maxArea = (int)area.get(i);
			}
			if(maxArea < (int)area.get(i+1)) {
				maxArea = (int)area.get(i+1);
			}
		}
		
		// 제일 긴 h의 길이
		int maxH =0;
		for(int i=0; i<h.length-1; i++) {
			if(i ==0) {
				maxH = h[i];
			}
			if(maxH < h[i+1]) {
				maxH = h[i+1];
			}		
		}
		
		// 마무리
		System.out.println(maxArea>maxH? maxArea:maxH);
		
//		Scanner scan = new Scanner(System.in);
//		
//		int hCnt = scan.nextInt();
//		int[] h = new int[hCnt];
//		for(int i=0; i<h.length; i++) {
//			h[i] = scan.nextInt();
//		}
//		int bline =1;
//		int[] area = new int[hCnt];
//		// h가 크거나 같은지 비교
//		for(int i=0; i<h.length-1; i++) {
//			bline =1; // 초기화
//			for(int j=i+1; j<h.length; j++) {
//				if(h[i] <= h[j]) {
//					bline++;
//					area[i] = h[i] * bline;
//				//	System.out.println(i+"넓이 : "+area[i]);
//				} else {
//					break;
//				}
//			}
//		}
//		
//		int maxArea =0;
//		for(int i=0; i<area.length-1; i++) {
//			if(i ==0) {
//				maxArea = area[i];
//			}
//			if(maxArea < area[i+1]) {
//				maxArea = area[i+1];
//			}
//		}
//		
//		// 제일 긴 h의 길이
//		int maxH =0;
//		for(int i=0; i<h.length-1; i++) {
//			if(i ==0) {
//				maxH = h[i];
//			}
//			if(maxH < h[i+1]) {
//				maxH = h[i+1];
//			}		
//		}
//		
//		// 마무리
//		System.out.println(maxArea>maxH? maxArea:maxH);		
	}
}
