public class insertion_sort {
     public static void printArray(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         System.out.print(var0[var1] + " ");
      }

      System.out.println();
   }
    public static void main(String[] args) {
        int arr[]= {7, 8, 3, 1, 2};

        //Insertion Sort Algorithm
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Place the current element at its correct position in the sorted part of the array
            arr[j + 1] = current;
            
        }
        // Print the sorted array
        printArray(arr);
    }
}
