package Sort;

import java.util.ArrayList;

public class BubbleSort extends Sorts {

    private int swap = 0;
    private int comparison = 0;
    private int high;
    private int low;
    ArrayList sorted;
    public BubbleSort(int size) {
        super(size);

    }


    public ArrayList<Integer> sort(ArrayList original) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp = original;
        low = temp.get(0);
        low = high;
        int n = temp.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++)
                if (temp.get(j) > temp.get(j + 1)) {
                    comparison++;
                    swap++;
                    // swap arr[j+1] and arr[j]
                    int tempNub = temp.get(j);
                    temp.set(j, temp.get(j + 1));
                    temp.set(j + 1, tempNub);
                }
            if (temp.get(i) < low){
                low = temp.get(i);
            }
            if (temp.get(i) > high){
                high = temp.get(i);
            }
        }

        System.out.println("# of swaps: " + swap + "     # of comparisons: " + comparison + "\n" + "High: " + high + "   Low: " + low);
        return temp;
    }
}
