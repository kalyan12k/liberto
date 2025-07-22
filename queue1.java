
package demo;
import java.util.LinkedList;
import java.util.Queue;
public class Queue1 {
	
			public static void main(String[] args) {
			Queue<String> students=new LinkedList<String>();
			students.add("student 1");
			students.add("student 2");
			students.add("student 3");
			students.add("student 4");
			System.out.println(students);
			String firstOut=students.poll();
			System.out.println(firstOut);
			System.out.println(students);
		}

	}

