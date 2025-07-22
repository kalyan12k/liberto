
package demo;

public class LinearSearchExample {
	public static void main(String[] args) {
	
		
				int[] numbers= {2,4,5,6,8,9};
				int target=9;
				boolean found=false;
				for(int i=0;i<numbers.length;i++) {
					if(numbers[i]==target) {
					System.out.println("found"+" "+target +"at index"+i);
					found=true;
					break;
				}
				}
				if(!found) {
					System.out.println("number"+target+"notfound");
				}

			}

		}
