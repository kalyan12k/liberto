
package demo;

public class BubbleSortOnStrings {
		public static void main(String[] args) {
			String[] S= {"Afreen","Sana","suraj","Arif","Riya"};
			for(int i=0;i<S.length-1;i++) {
				for(int j=0;j<S.length-1;j++) {
					if (S[j].compareTo(S[j + 1]) > 0) { 
						String temp = S[j];
						S[j] = S[j+1];
						S[j+1] = temp;
					}
				}
			}
			System.out.println("Sorted List");
			for(String num : S) {
				System.out.println(num + " ");
			}
		}

	}
