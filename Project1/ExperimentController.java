import java.util.*; 
import java.io.*; 
/**
 * Abstract class for the Experiment Controller for Reference Type Data  
 *
 * @author Tafita Rakotozandry & Khalid Al-Motaery
 * @version1
 */
public abstract class ExperimentController<T extends Comparable <? super T>>
{

    public T [] array; // the array the will contain all the data 

    public  Integer[] numberOfElements; //the container of the different number of elements
    public   Integer currentNumbers; //the actual type of array used 
    public  Integer min=0; //minimum number generated 
    public  Integer max=100000; //maximum number generated
    public  Integer seeds=56153333; //the seeds of the random 

    public  ExperimentController(){}

    /**
     * Print The arrays 
     */
    public  void printArray() {
        System.out.println(Arrays.toString(array)); 
    }

    /**
     * Print Data into a csv file 
     * use only when to export data into file 
     * 
     */
    public  void writeCSV()throws FileNotFoundException{
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        System.setOut(out); 
    }

    /**
     * Runs tests on insertion sort with different array charactaristics 
     * 
     */
    public  void testInsertionSort() {
        System.out.println("ReverseSorted Array For InsertionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){

            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeInsertionSort());
        }  
        System.out.println("Sorted Array For InsertionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeInsertionSort());
        }  
        System.out.println("RandomListArray InsertionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeInsertionSort());
        }  
        System.out.println("HalfSortedArray InsertionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeInsertionSort());
        }  
        System.out.println("DuplicateElementsArray InsertionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeInsertionSort());
        }  

    }   

    /**
     * Runs tests on Bubble sort with different array charactaristics 
     * 
     */
    public  void testBubbleSort() {
        System.out.println("ReverseSorted Array For BubbleSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeBubbleSort());
        }  
        System.out.println("Sorted Array For BubbleSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeBubbleSort());
        }  
        System.out.println("RandomListArray BubbleSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeBubbleSort());
        }  
        System.out.println("HalfSortedArray BubbleSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeBubbleSort());
        }  
        System.out.println("DuplicateElementsArray BubbleSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeBubbleSort());
        }  

    } 

    /**
     * Runs tests on Merge sort with different array charactaristics 
     * 
     */
    public  void testMergeSort() {
        System.out.println("ReverseSorted Array For MergeSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){

            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeMergeSort());
        }  
        System.out.println("Sorted Array For MergeSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeMergeSort());
        }  
        System.out.println("RandomListArray MergeSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeMergeSort());
        }  
        System.out.println("HalfSortedArray MergeSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeMergeSort());
        }  
        System.out.println("DuplicateElementsArray MergeSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeMergeSort());
        }  

    } 

    /**
     * Runs tests on Selection sort with different array charactaristics 
     * 
     */
    public  void testSelectionSort() {
        System.out.println("ReverseSorted Array For SelectionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){

            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeSelectionSort());
        }  
        System.out.println("Sorted Array For SelectionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeSelectionSort());
        }  
        System.out.println("RandomListArray SelectionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeSelectionSort());
        }  
        System.out.println("HalfSortedArray SelectionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeSelectionSort());
        }  
        System.out.println("DuplicateElementsArray SelectionSort");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeSelectionSort());
        }  

    } 

    /**
     * Runs tests on QuickSortRandomPivot sort with different array charactaristics 
     * 
     */
    public  void testQuickSortRandomPivot() {
        System.out.println("ReverseSorted Array For QuickSortRandomPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){

            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortRandomPivot());
        }  
        System.out.println("Sorted Array For QuickSortRandomPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortRandomPivot());
        }  
        System.out.println("RandomListArray QuickSortRandomPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortRandomPivot());
        }  
        System.out.println("HalfSortedArray QuickSortRandomPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortRandomPivot());
        }  
        System.out.println("DuplicateElementsArray QuickSortRandomPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortRandomPivot());
        }  

    } 

    /**
     * Runs tests on QuickSortFrontPivot sort with different array charactaristics 
     * 
     */
    public  void testQuickSortFrontPivot() {
        System.out.println("ReverseSorted Array For QuickSortFrontPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){

            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortFrontPivot());
        }  
        System.out.println("Sorted Array For QuickSortFrontPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortFrontPivot());
        }  
        System.out.println("RandomListArray QuickSortFrontPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortFrontPivot());
        }  
        System.out.println("HalfSortedArray QuickSortFrontPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortFrontPivot());
        }  
        System.out.println("DuplicateElementsArray QuickSortFrontPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortFrontPivot());
        }  

    } 

    /**
     * Runs tests on QuickSortMedianPivot sort with different array charactaristics 
     * 
     */
    public  void testQuickSortMedianPivot() {
        System.out.println("ReverseSorted Array For QuickSortMedianPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){

            generateReverseSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortMedianPivot());
        }  
        System.out.println("Sorted Array For QuickSortMedianPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortMedianPivot());
        }  
        System.out.println("RandomListArray QuickSortMedianPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateRandomListArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortMedianPivot());
        }  
        System.out.println("HalfSortedArray QuickSortMedianPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateHalfSortedArray(); 
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortMedianPivot());
        }  
        System.out.println("DuplicateElementsArray QuickSortMedianPivot");
        for (currentNumbers=0; currentNumbers<numberOfElements.length;currentNumbers++){
            generateDuplicateElementsArray() ;
            System.out.println(numberOfElements[currentNumbers]+","+timeQuickSortMedianPivot());
        }  

    }       

    /**
     * Generate array with random items  
     * 
     */
    public  void generateRandomListArray() {
        Random random = new Random(seeds);

    }

    /**
     * Generate array with sorted items  
     * 
     */
    public  void generateSortedArray() {

    }    

    /**
     * Generate array with reverse sorted items
     * 
     */
    public  void generateReverseSortedArray() {

    } 

    /**
     * Generate array with partially sorted array 
     * 
     */
    public  void generateHalfSortedArray() {

    } 

    /**
     * Generate array with random items  
     * 
     */
    public  void generateDuplicateElementsArray() {

    }

    /**
     * Returns time to quick sort an array using a random number as pivot 
     *
     */
    public  long timeQuickSortRandomPivot() {
        QuickSortRandomPivot quickSortRandom = new QuickSortRandomPivot();//create the quicksort object 
        long startTime = System.currentTimeMillis(); //take initial time 
        quickSortRandom.sort(array);// run the sorting 
        long  stopTime = System.currentTimeMillis(); //take final time 
        return stopTime - startTime; //return the time 
    }

    /**
     * Returns time to quick sort an array using a front number as pivot 
     *
     */
    public  long timeQuickSortFrontPivot() {
        QuickSortFrontPivot quickSortRandom = new QuickSortFrontPivot();//create the quicksort object 
        long startTime = System.currentTimeMillis(); //take initial time 
        quickSortRandom.sort(array);// run the sorting 
        long  stopTime = System.currentTimeMillis(); //take final time 
        return stopTime - startTime; //return the time 
    }

    /**
     * Returns time to quick sort an array using a front median as pivot 
     *
     */
    public  long timeQuickSortMedianPivot() {
        QuickSortMedianPivot quickSortRandom = new QuickSortMedianPivot();//create the quicksort object 
        long startTime = System.currentTimeMillis(); //take initial time 
        quickSortRandom.sort(array);// run the sorting 
        long  stopTime = System.currentTimeMillis(); //take final time 
        return stopTime - startTime; //return the time difference
    }

    /**
     * Returns time to merge sort an array 
     * 
     */
    public  long timeMergeSort() {
        MergeSort mergeSort = new MergeSort();
        long startTime = System.currentTimeMillis(); // Saves initial time 
        mergeSort.sort(array);
        long  stopTime = System.currentTimeMillis(); // Saves final time 
        return stopTime - startTime; //return the time difference 
    }

    /**
     * Returns time to merge sort an array 
     * 
     */
    public   long timeSelectionSort() {
        SelectionSort selection = new SelectionSort();
        long startTime = System.currentTimeMillis(); // Saves initial time 
        selection.sort(array);
        long  stopTime = System.currentTimeMillis(); // Saves final time 
        return stopTime - startTime; //return the time difference 
    }

    /**
     * Returns time to merge sort an array 
     * 
     */
    public  long timeInsertionSort() {
        InsertionSort insertion = new InsertionSort();
        long startTime = System.currentTimeMillis(); // Saves initial time 
        insertion.sort(array);
        long  stopTime = System.currentTimeMillis(); // Saves final time 
        return stopTime - startTime; //return the time difference 
    }

    /**
     * Returns time to merge sort an array 
     * 
     */
    public  long timeBubbleSort() {
        BubbleSort bubble = new BubbleSort();
        long startTime = System.currentTimeMillis(); // Saves initial time 
        bubble.sort(array);
        long  stopTime = System.currentTimeMillis(); // Saves final time 
        return stopTime - startTime; //return the time difference 
    }
}
