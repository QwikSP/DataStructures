package Sort;

import java.util.ArrayList;

public class InsertionSort extends Sorts {


    private int high;
    private int low;
    ArrayList sorted;
    int swap = 0;
    int comparison = 0;
    public InsertionSort(int size) {
        super(size);

    }


    public ArrayList<Integer> sort(ArrayList original) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr = original;
        int n = arr.size();
        low = arr.get(0);
        high = arr.get(0);
        for (int i = 1; i < n; ++i) {
            int key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > key) {
                swap++;
                comparison = comparison + 2;
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1,key);
            swap++;
            if (key < low){
                low = key;
            }
            if (key > high){
                high = key;
            }
        }

        System.out.println("# of swaps: " + swap + "     # of comparisons: " + comparison + "\n" + "High: " + high + "   Low: " + low);
        return arr;
    }
}
