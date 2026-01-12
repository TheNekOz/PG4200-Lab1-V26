package assignment;

import java.util.Arrays;

public class Search {
    int[] arr;
    public Search(int[] x) {
        arr = x;
    }
    public int linearSearch(int x) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public int stepsLinearSearch(int x) {
        int steps = 0;
        int length = arr.length;
        System.out.println("Length: " + length);
        for (int i = 0; i < length; i++) {
            steps++;
            if (arr[i] == x) {
                return steps;
            }
        }
        return steps;
    }
}

