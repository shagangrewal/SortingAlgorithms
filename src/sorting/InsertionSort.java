package sorting;

public class InsertionSort {

     public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
     
    public static void main(String[] args){
        int a[] = {32,12,45,34,1,76,8,98,65};
        System.out.println("Original Array:");
        printArray(a);
        
        for(int i=1;i<a.length;i++){
            for(int j=i-1;j>=0;j--){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        
        System.out.println("Sorted Array:");
        printArray(a);
          
    }
    
}
