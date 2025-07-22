
package demo;
public class MergeSortExample {

        void merge(int arr[], int left, int mid, int right) {
        int len1 = mid - left + 1;
        int len2 = right - mid;

        int leftArr[] = new int[len1];
        int rightArr[] = new int[len2];

        System.arraycopy(arr, left, leftArr, 0, len1);
        System.arraycopy(arr, mid + 1, rightArr, 0, len2);

        int i = 0, j = 0;
        int k = left;

                while (i < len1 && j < len2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

            while (i < len1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        
        while (j < len2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    
    void sort(int arr[], int left, int right) {
        if (left < right) {
            
            int mid = left + (right - left) / 2;

            
            sort(arr, mid + 1, right);

            
            merge(arr, left, mid, right);
        }
    }

      static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given array is");
        printArray(arr);

        MergeSortExample ob = new MergeSortExample();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        printArray(arr);
    }
}
