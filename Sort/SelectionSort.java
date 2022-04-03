package Sort;

import java.util.ArrayList;

public class SelectionSort extends Sorts{

    ArrayList sorted;
    int comparison = 0;
    int swap = 0;
    public SelectionSort(int size) {
        super(size);

    }


    public ArrayList<Integer> sort(ArrayList original) {
        ArrayList<Integer> arr;
        arr = original;
        int n = arr.size();
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr.get(j) < arr.get(min)) {
                    min = j;
                }
                comparison++;
            }

            // Swap the found minimum element with the first
            // element
            swap++;
            int temp = arr.get(min);
            arr.set(min, arr.get(i));
            arr.set(i, temp);
        }
        System.out.println("# of swaps: " + swap + "     # of comparisons: " + comparison);
        return arr;
    }
}
