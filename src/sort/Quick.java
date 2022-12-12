package sort;

public class Quick {
    public static void main(String[] args) {
        int[] data = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        quickSort(data, 0, data.length - 1);

        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void quickSort(int[] data, int left, int right) {
        if(left >= right)
            return;

        int pivot = partition(data, left, right);
        quickSort(data, left, pivot - 1);
        quickSort(data, pivot + 1, right);
    }

    public static int partition(int[] data, int left, int right) {
        int savedLeft = left, pivot = data[left];

        while(left < right) {
            while(data[right] > pivot && left < right)
                right--;
            while(data[left] <= pivot && left < right)
                left++;
            swap(data, left, right);
        }
        swap(data, savedLeft, left);
        return left;
    }

    public static void swap(int[] data, int x, int y) {
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;
    }
}
