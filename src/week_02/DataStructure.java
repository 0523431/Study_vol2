package week_02;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class DataStructure {
	public static void main(String[] args) {
		
		// FILO
		Stack<Integer> stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.pop();
		//stack.peek();
		
		// FIFO
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.poll();
		queue.peek();
		
		// 양쪽으로 넣고 빼고 가능
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addFirst(1);
		deque.addLast(2);
		deque.pollFirst();
		//deque.pollLast();
		
		// 우선 순위를 정하고 우선 순위가 높은 것부터 출력
		PriorityQueue<Integer> prique = new PriorityQueue<>();
		
		PriorityQueue<int[]> prique1 =
				new PriorityQueue<>(new Comparator<int[]>() {
					@Override
					public int compare(int[] o1, int[] o2) {
						return o1[1] - o2[1];
					}
				});
	}
}
