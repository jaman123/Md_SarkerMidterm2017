package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        for(int i =1; i< array.length; i++){

        }



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long endTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        for(int i=0; i<array.length; i++){
            for(int j= 1; j<array.length - i; j++){
                if(array[j-1]>array[j]){
                    int temp = array[j-1];
                    array[j-1]= array[j];
                    array[j]=temp;
                }
            }
        }
        
        
        
        
        
        
        return list;
    }
    

    public int [] mergeSort(int [] array){
        final long endTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        if(low <high){
            int middle = (low + high)/2;
            mergeSort(array,low,middle);
            mergeSort(array,middle + 1, high);
            mergeSort(array,low,middle,high);
        }
        
        

        return list;
    }
    

    public int [] quickSort(int [] array){
       // final long endTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
        

       // return list;
    }
    
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;



    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;




    }

    public static int[] printSortedArray(int [] array){
        int [] list=array;

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        return list;
    }
}
