package sort;

import java.util.Scanner;

public class shell {
    static void shellSort(int[] a) {
        for(int h = a.length / 2; h > 0; h /= 2)
            for(int i = h; i < a.length; i++) {
                int j, tmp = a[i];
                for(j = i - h; j >= 0 && a[j] > tmp; j -= h)
                    a[j + h] = a[j];
                a[j + h] = tmp;
            }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int[] data = new int[n];

        for(int i = 0; i < n; i++)
            data[i] = stdin.nextInt();

        shellSort(data);

        for(int i = 0; i < n; i++)
            System.out.println(data[i]);
    }
}
