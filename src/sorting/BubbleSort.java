package sorting;

public class BubbleSort {
    
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int a[] = {32,43,12,3,66,45,1,21};
        System.out.println("Original Array:");
        printArray(a);
        
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
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
