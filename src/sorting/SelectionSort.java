package sorting;

public class SelectionSort {

     public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
     
    public static void main(String[] args){
        int a[] = {33,54,12,3,43,66,1,5,98,25};
        System.out.println("Original Array:");
        printArray(a);
        int min = 0;
        int k = 0;
        
        for(int i=0;i<a.length-1;i++){
            min = a[i];
            for(int j=i+1;j<a.length;j++){
                if(min>a[j]){
                    min = a[j];
                    k = j;
                }
            }
            int temp = a[k];
            a[k] = a[i];
            a[i] = temp;
        }
        
        System.out.println("Sorted Array:");
        printArray(a);
    }
    
}
