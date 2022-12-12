package sort;

public class Insert {
    public static void main(String[] args) {
        int[] data = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        insertSort(data);

        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void insertSort(int[] data) {
        int size = data.length;

        for(int i = 1; i < size; i++) {
            int j, temp = data[i];
            for(j = i; j > 0 && data[j - 1] > temp; j--)
                data[j] = data[j - 1];
            data[j] = temp;
        }
    }
}
