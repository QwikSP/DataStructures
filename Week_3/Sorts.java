package Week_3;// package com.foo.sort;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class Sorts {
    private ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;

    public Sorts(int size) {
        Instant start = Instant.now();  // time capture -- start
        // build an array
        for (int i = 0; i < size; i++) {
            data.add((int)(Math.random() * (size+1)));
        }
        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
        data = sort(data);
        Instant end = Instant.now();    // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }

    public ArrayList sort(ArrayList origianl) {
        return origianl;
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }


    public static void main(String[] args) {
        int sum=0, time=0, TIMES=12, SIZE=5000;

        //Bubble Week_2.Sort

        System.out.println("\n\n" + "Bubble Week_2.Sort" + "\n\n");
        for(int i=0; i< TIMES; i++) {
            BubbleSort s = new BubbleSort(SIZE);
            for(int j = 0; j<s.getData().size(); j++) {
                sum += s.getData().get(j);
            }
            time += s.getTimeElapsed();
        }
        System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);

        //Selection Week_2.Sort
        System.out.println("\n\n" + "Selection Week_2.Sort" + "\n\n");
        sum = 0; time=0;

        for(int i=0; i< TIMES; i++) {
            SelectionSort s = new SelectionSort(SIZE);
            for(int j = 0; j<s.getData().size(); j++) {
                sum += s.getData().get(j);
            }
            time += s.getTimeElapsed();
        }
        System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);

        //Insertion Week_2.Sort
        System.out.println("\n\n" + "Insertion Week_2.Sort" + "\n\n");
        sum = 0; time=0;

        for(int i=0; i< TIMES; i++) {
            InsertionSort s = new InsertionSort(SIZE);
            for(int j = 0; j<s.getData().size(); j++) {
                sum += s.getData().get(j);
            }
            time += s.getTimeElapsed();
        }
        System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);

    //Merge Week_2.Sort
    System.out.println("\n\n" + "Merge Week_2.Sort" + "\n\n");
    sum = 0; time=0;

        for(int i=0; i< TIMES; i++) {
        MergeSort s = new MergeSort(SIZE);
        for(int j = 0; j<s.getData().size(); j++) {
            sum += s.getData().get(j);
        }
        time += s.getTimeElapsed();
    }
        System.out.println("Average random: " + sum / (TIMES*SIZE));
        System.out.println("Total Nanoseconds: " + time );
        System.out.println("Total Seconds: " + time /1000000000.0);
}


}