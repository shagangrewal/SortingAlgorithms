package sorting;

public class MergeSort {

    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    public static void sort(int a[], int low, int high){
        int temp[] = new int[a.length];
        mSort(a, temp, low, high);
    }
    
    public static void mSort(int a[], int temp[], int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            
            mSort(a,temp,low,mid);
            mSort(a,temp,mid+1,high);
            merge(a,temp,low,mid,high);
        }
    }
    
    public static void merge(int a[], int temp[], int low, int mid, int high){
        int i = low;
        int j = mid+1;
        int k = low;
        
        while(i<=mid && j<=high){
            temp[k++] = a[i]<a[j]?a[i++]:a[j++];
        }
        while(i<=mid){
            temp[k++] = a[i++];
        }
        while(j<=high){
            temp[k++] = a[j++];
        }
        
        for(int m=low;m<=high;m++){
            a[m] = temp[m];
        }
        
    }
    
    public static void main(String[] args){
        int a[] = {12,43,21,1,6,39,87,56};
        System.out.println("Original Array");
        printArray(a);
        
        sort(a,0,a.length-1);
        System.out.println("Sorted Array:");
        printArray(a);
                
    }
    
}
