 class BubbleSort {  
    public int[] bubbleSort(int arr[]) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }             
                 }  
         }  
         return arr;
    }   
} 
public class Assignment1Q8 {
	public static void main(String[] args) {  
        int arr[] ={3,60,35,2,45,320,5};  
         
        System.out.println("Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }    
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
         
        System.out.println("\nAfter Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  

} 
}
