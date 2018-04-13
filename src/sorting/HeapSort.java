package sorting;

public class HeapSort {
    
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    public static void Heapify(int a[], int high, int low){
        int largest = low;
        int l = 2*largest+1;
        int r= 2*largest+2;
        
        if(l<high && a[l]>a[largest] )
            largest = l;
        
        if(r<high && a[r]>a[largest])
            largest = r;
        
        if(largest != low){
            int temp = a[largest];
            a[largest] = a[low];
            a[low] = temp;
            Heapify(a,high, largest);
        }
        
        
    }
    
    public static void Hsort(int a[],int high){
        for(int i=a.length/2-1;i>=0;i--){
            Heapify(a,a.length,i);
        }
        
        for(int i=high-1;i>=0;i--){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            
            Heapify(a,i,0);
        }
    }
    
    public static void main(String[] args){
        int a[] = {21,11,13,45,1,76,8,55};
        System.out.println("Original Array:");
        printArray(a);
        
        Hsort(a,a.length);
        System.out.println("Sorted Array:");
        printArray(a);
    }
    
}
