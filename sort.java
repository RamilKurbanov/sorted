public class sort {
    public static void main(String[] args) {
        int[] array = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
 
        System.out.println("Перед сортировкой кучи");
        printArray(array);
 
        heapSort(array);
 
        System.out.println("После сортировки кучей");
        printArray(array);
    }
 
    public static void heapSort(int[] array) {
        int n = array.length;
 
        
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);
 
        
        for (int i = n - 1; i >= 0; i--) {
            
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
 
            
            heapify(array, i, 0);
        }
    }
 

    public static void heapify(int[] array, int n, int i) {
        int largest = i; 
        int l = 2 * i + 1;
        int r = 2 * i + 2;
 
        
        if (l < n && array[l] > array[largest])
            largest = l;
 
        
        if (r < n && array[r] > array[largest])
            largest = r;
 
        
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
 
            
            heapify(array, n, largest);
        }
    }
 
    
    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}