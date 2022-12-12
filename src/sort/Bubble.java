package sort;

import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        int[] data = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        bubbleSort(data);

        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void bubbleSort(int[] data) {
        int size = data.length - 1;

        for(int i = 0; i < size; i++)
            for(int j = 0; j < size - i; j++)
                if(data[j] > data[j + 1])
                    swap(data, j, j + 1);
    }

    public static void swap(int[] data, int x, int y) {
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;
    }
}
