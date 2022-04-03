//package com.example.sping_portfolio.controllers.LinkedLists2;
//
//import java.util.*;
//import funcMaster;
//
//
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Stack extends stack2 {
//
//    public Stack(String selection) {
//        super.selection = selection;
//    }
//
//    @Override
//    public void run() {
//        //initialize queues
//        List<Integer> list = Arrays.asList(1, 2, 3, 4);
//        Queue<Integer> start = new Queue();
//
//        for(int num : list) {
//            start.push(num);
//        }
//
//        //create stack
//        stack2<Integer> output = new stack2();
//
//        //move queue elements into stack
//        int j = start.length();
//        for(int i = 0; i < j; i++) {
//            output.push(start.peek());
//            start.pop();
//        }
//
//        //put stack into a list
//        ArrayList<Integer> output_list = new ArrayList<Integer>();
//
//        int k = output.length();
//        for(int i = 0; i < k; i++) {
//            output_list.add(output.peek());
//            output.pop();
//        }
//
//        //display output
//        System.out.print("Before: ");
//
//        System.out.println(list
//                .toString()
//                .replaceAll("\\[|\\]", "")
//                .replaceAll(" "," ")
//                .replaceAll(",", " "));
//
//        System.out.print("After: ");
//        System.out.println(output_list
//                .toString()
//                .replaceAll("\\[|\\]", "")
//                .replaceAll(" "," ")
//                .replaceAll(",", " "));
//    }
//}
//
//
