package Sort;

import java.util.ArrayList;

public class MergeSort extends Sorts {

    int comparison = 0;

    public ArrayList sorted;
    public MergeSort(int size) {
        super(size);

    }


    public void merge(ArrayList arr, int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged


        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = (int) arr.get(l + i);
        for (int j = 0; j < n2; ++j)
            R[j] = (int) arr.get(m + 1 + j);

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            comparison++;
            if (L[i] <= R[j]) {
                arr.set(k, L[i]);
                i++;
            }
            else {
                arr.set(k, R[j]);
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr.set(k, L[i]);
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr.set(k, R[j]);
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public ArrayList sort(ArrayList arr) {
        int l = 0;
        int r = arr.size()-1;
        if (l < r) {
            comparison++;
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sortS(arr, l, m);
            sortS(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
        System.out.println("# of comparisons: " + comparison);
        return arr;
    }

    public void sortS(ArrayList arr, int l, int r) {
        if (l < r) {
            comparison++;
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sortS(arr, l, m);
            sortS(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }

    }










}
