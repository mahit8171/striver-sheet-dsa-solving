package Arrays.Easy;

public class sec_min_N_max{
    public static void main(String[] args) {

        int[] arr = {5, 4, 6, 7, 3, 9, 8, 55, 1, 24, 2, 19};

        QickSort(arr, 0, arr.length - 1);

        System.out.println("second mimmum "+ arr[1]);
        System.out.println("second maximum " +arr[arr.length-2]);
    }

    public static void QickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivot_index = Partition(arr, low, high);

            QickSort(arr, low, pivot_index - 1);
            QickSort(arr, pivot_index + 1, high);
        }
    }

    public static int Partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int pivot_index = low;

        for (int i = low; i < high; i++) {

            if (arr[i] <= pivot) {
                swap(arr, pivot_index, i);
                pivot_index++;
            }
        }

        swap(arr, pivot_index, high);

        return pivot_index;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}