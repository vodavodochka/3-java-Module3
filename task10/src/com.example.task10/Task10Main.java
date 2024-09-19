package com.example.task10;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        int min = arr[0];
        int min_index = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] <= min)
            {
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }

}