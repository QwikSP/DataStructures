package Sort;

import java.util.ArrayList;

public class BubbleSort extends Sorts {

    private int swap = 0;
    private int comparison = 0;
    ArrayList sorted;
    public BubbleSort(int size) {
        super(size);

    }


    public ArrayList<Integer> sort(ArrayList original) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp = original;
        int n = temp.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (temp.get(j) > temp.get(j+1))
                {
                    comparison++;
                    swap++;
                    // swap arr[j+1] and arr[j]
                    int tempNub = temp.get(j);
                    temp.set(j, temp.get(j+1));
                    temp.set(j+1, tempNub);
                }
//        System.out.print("(");
//        for (Integer p : temp) {
//            System.out.print(p + " ,");
//        }
//        System.out.print(")");
        System.out.println("# of swaps: " + swap + "     # of comparisons: " + comparison);
        return temp;
    }
}
