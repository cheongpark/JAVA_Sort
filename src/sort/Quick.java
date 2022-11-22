package sort;

public class Quick {
    public static void main(String[] args) {
        Quick quickSort = new Quick();

        int[] data = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        quickSort.sort(data, 0, data.length - 1);

        for (int i = 0; i < data.length; i++)
            System.out.println("data[" + i + "] : " + data[i]);
    }

    public void sort(int[] data, int left, int right) {
        if (left >= right)
            return;

        int pivot = partition(data, left, right);
        sort(data, left, pivot - 1);
        sort(data, pivot + 1, right);
    }

    public int partition(int[] data, int left, int right) {
        int savedLeft = left;
        int pivot = data[left];
        while (left < right) {
            while (data[right] > pivot && right > left)
                --right;
            while (data[left] <= pivot && right > left)
                ++left;

            swap(data, left, right);
        }
        swap(data, savedLeft, left);
        return left;
    }

    public void swap(int[] data, int x, int y) {
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;
    }

}
