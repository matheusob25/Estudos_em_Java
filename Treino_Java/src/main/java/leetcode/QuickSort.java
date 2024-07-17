package leetcode;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
//    public static int[] quickSort(int[] arr) {
//        if(arr.length < 2){
//            return arr;
//        }
//        int pivot = arr[0];
//        List<Integer> shorters = new ArrayList<>();
//        for(int i = 1; i < arr.length; i++){
//            if(i <= pivot){
//                shorters.add(arr[i]);
//            }
//        }
//        List<Integer> longers = new ArrayList<>();
//        for(int i = 1; i < arr.length; i++){
//            if(i > pivot){
//                shorters.add(arr[i]);
//            }
//        }
//        int[] shortersArr = shorters.stream().mapToInt(i -> i).toArray();
//        int[] longersArr = longers.stream().mapToInt(i -> i).toArray();
//
//        List<Integer> partitions = new ArrayList<>();
//
//        partitions.addAll(quickSort(shortersArr));
//        partitions.add(pivot);
//        partitions.addAll(longers);
//
//
//
//        List<Integer[]> pivots = new ArrayList<>();
//        pivots.add(shortersArr);
//        return quickSort(shortersArr) + pivotArr + quickSort(longersArr);
//
//
//    }
//
//
//    public static void main(String[] args) {
//
//    }

}
