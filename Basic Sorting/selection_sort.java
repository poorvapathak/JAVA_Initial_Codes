public class selection_sort {
    public static void printArray(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         System.out.print(var0[var1] + " ");
      }

      System.out.println();
   }

    public static void main(String[] args) {
        int arr [] = {7,8,3,1,2};
        // Selection Sort Algorithm
        for (int i=0; i<arr.length-1;i++){
            int smallest = i;
            for (int j=i+1; j<arr.length;j++){
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            // Swap the found smallest element with the first element
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        // Print the sorted array
        printArray(arr);
    }    
}
