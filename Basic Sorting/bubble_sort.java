public class bubble_sort {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {7,8,3,1,2};
        
        //Bubble Sort Algorithm
        for(int i=0; i<arr.length-1; i++){   //i is just the counter
            for(int j=0; j<arr.length-i-1; j++){ //j is the index of element to be compared.len-i-1 so last sorted is not checked again
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr [j];
                    arr [j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }
    
    }
