package sorting;

public class CountingSort {
    
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    public static void countSort(int a[]){
        int max = 0;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        
        int count[] = new int[max+1];
        int out[] = new int[a.length];
        
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }
        
        for(int i=1;i<count.length;i++){
            count[i] += count[i-1];
        }
        
        for(int i=0;i<a.length;i++){
            out[count[a[i]]-1] = a[i];
            count[a[i]]--;
        }
        
        printArray(out);
    }
    
    public static void main(String[] args){
        int a[] = {32,12,1,45,5,67,54};
        System.out.println("Original Array:");
        printArray(a);
        
        System.out.println("Sorted Array:");
        countSort(a);
    }
    
}
