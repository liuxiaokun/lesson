package com.fred.lesson.sort;

import java.util.Arrays;

/**
 * Created by fred on 6/4/17.
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {51, 141, 3, 22, 131};
        System.out.println(Arrays.toString(selectionSort(arr)));

    }

    private static int[] selectionSort(int[] ori) {

        int len = ori.length;

        for (int i = 0; i < len - 1; i++) {

            //寻找【ｉ,n）区间的最小值
            int minIndex = i;

            for (int j = i + 1; j < len ; j++) {

                if (ori[minIndex] > ori[j]) {
                    minIndex = j;
                }
            }
            //一次外循环只交换一次
            swap(ori, i, minIndex);
        }
        return ori;
    }


    private static void swap(int[] arr, int m, int n) {

        int val = arr[m];
        arr[m] = arr[n];
        arr[n] = val;
    }
}
