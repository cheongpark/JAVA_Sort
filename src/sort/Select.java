package sort;

import java.util.Scanner;

public class Select {
    public static void main(String[] args) {
        int[] data = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        selectSort(data);

        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void selectSort(int[] data) {
        int size = data.length, min;

        for(int i = 0; i < size - 1; i++) {
            min = i;
            for(int j = min + 1; j < size; j++)
                if(data[min] > data[j])
                    min = j;
            swap(data, min, i);
        }
    }

    public static void swap(int[] data, int x, int y) {
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;
    }
}
