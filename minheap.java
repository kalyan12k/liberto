
package demo;
import java.util.Collections;
import java.util.PriorityQueue;


public class MinHeap{
		public static void main(String[] args) {
			PriorityQueue<Integer> minheap=new PriorityQueue<Integer>();
			minheap.add(20);
			minheap.add(5);
			minheap.add(15);
			minheap.add(10);
			System.out.println("MIN Heap output");
			while(!minheap.isEmpty()) {
				System.out.println(minheap.poll());
			}
			PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
			maxheap.add(20);
			maxheap.add(5); 
			maxheap.add(15);
			maxheap.add(10);
			System.out.println("MAX Heap Output");
			while(!maxheap.isEmpty()) {
				System.out.println(maxheap.poll());
			}
		}

	}
