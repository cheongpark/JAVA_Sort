package sort;

public class Shell {
    public static void main(String[] args) {
        int[] data = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        shellSort(data);

        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void shellSort(int[] data) {
        int size = data.length, h, l = 0;

        for(h = size / 2; h > 0; h /= 2, l++) {
            for(int i = h; i < size; i++) {
                int j, temp = data[i];

                for(j = i - h; j >= 0 && data[j] > temp; j -= h)
                    data[j + h] = data[j];

                data[j + h] = temp;
            }
        }
    }
}
