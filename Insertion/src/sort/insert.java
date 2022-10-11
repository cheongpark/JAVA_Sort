package sort;

import java.util.Scanner;

public class insert {
    static void insertionSort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            int j, tmp = a[i];
            for(j = i; j > 0 && a[j - 1] > tmp; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int[] data = new int[n];

        for(int i = 0; i < n; i++)
            data[i] = stdin.nextInt();

        insertionSort(data);

        for(int i = 0; i < n; i++)
            System.out.println(data[i]);
    }
}
