

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*; 
/**
 * The test class SelectionSortTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SelectionSortTest
{
    /**
     * Default constructor for test class SelectionSortTest
     */
    public SelectionSortTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
            @Test
    public void TestSelectionSort()
    {
        SelectionSort<Integer> q=new SelectionSort();
        SelectionSort qs = new SelectionSort();
        Integer [] arr=new Integer [] {9, 0, 1, 3, 4, 5, 2, 9, 8, 7, 6, 5, 9, 1, 0, 9};
        Integer [] arr2=new Integer [] {0, 0, 1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 9, 9};
        qs.sort(arr); 
        assertEquals(Arrays.toString(arr), Arrays.toString(arr2));
    }
    
        @Test
    public void TestSelectionSortInt()
    {
        SelectionSort q=new SelectionSort();
        SelectionSort qs = new SelectionSort();
        int [] arr=new int [] {9, 0, 1, 3, 4, 5, 2, 9, 8, 7, 6, 5, 9, 1, 0, 9};
        int [] arr2=new int [] {0, 0, 1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 9, 9};
        qs.sort(arr); 
        assertEquals(Arrays.toString(arr), Arrays.toString(arr2));
    }
}
