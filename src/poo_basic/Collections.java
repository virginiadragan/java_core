package poo_basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Collections {

    public void task1 () {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("task1");
        System.out.println("For: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("ForEach: ");
        for (int elm: arr) {
            System.out.println(elm);
        }
        System.out.println("While: ");
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
        System.out.println("Do...While: ");
        int j = 0;
        do {
            System.out.println(arr[j]);
            j++;
        }
        while (j < arr.length);
    }

    public void task2 (int arr[], int idx) {
        System.out.println("task2");
        System.out.println(arr[idx]);
    }

    public void task3 (Integer val) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(25, 8, 12, 0, -4, 3, 20));
        System.out.println("task3");
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == val) {
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }

    public void task4 (int idx, int val) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(25, 8, 12, 0, -4, 3, 20));
        System.out.println("task4");
        arr.add(idx, val);
        System.out.println(arr);
    }

    public void task5 () {
        int arr[] = new int[]{25, 8, 12, 0, -4, 3, 20};
        int max = arr[0];
        int max_pos = 0;
        int min = arr[0];
        int min_pos = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                max_pos = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                min_pos = i;
            }
        }
        System.out.println("task5");
        System.out.println("max = " + max + ", max_pos = " + max_pos + ", min = " + min + ", min_pos = " + min_pos);
    }

    public void task6 () {
        ArrayList<Integer> inputArr = new ArrayList<Integer>(Arrays.asList(20, 30, 30, 40, 60, 60, 60, 50));
        ArrayList<Integer> outputArr = new ArrayList<Integer>();

        for (Integer elm: inputArr) {
            if (!outputArr.contains(elm)){
                outputArr.add(elm);
            }
        }
        System.out.println("task6");
        System.out.println("Input array: " + inputArr);
        System.out.println("Output array: " + outputArr);
    }

    public void task7 () {

        System.out.println("task7");
    }
}
