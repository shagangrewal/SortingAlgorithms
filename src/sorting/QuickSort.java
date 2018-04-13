package sorting;

public class QuickSort {
    
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    public static void sort(int a[], int low, int high){
        if(low<high){
            int pivot = qSort(a, low, high);
            
            sort(a,low,pivot-1);
            sort(a,pivot+1,high);
        }
    }
    
    public static int qSort(int a[], int low, int high ){
        int j = low-1;
        int piv = a[high];
        
        for(int i = low;i<high;i++){
            if(a[i]<piv){
                j++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        
        int temp2 = a[j+1];
        a[j+1] = a[high];
        a[high] = temp2;
        
        return j+1;
    }
    
    public static void main(String[] args){
        int a[] = {44,24,34,55,76,56,1,8,11,71,17};
        System.out.println("Original Array:");
        printArray(a);
        
        sort(a, 0, a.length-1);
        System.out.println("Sorted Array:");
        printArray(a);
    }
    
}
