import java.util.Arrays;

public class MergeSortAlgo {

    static void sort(int[] arr,int l,int r) {
        if (r > l) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l ,r);
        }
    }

    static int[] merge(int[] arr, int l, int r) {
        if (r - l == 1) {
            if (arr[r] > arr[l]) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        } else {
            int m = (l + r)/ 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
        }
        return arr;
    }

    private static int[] mergeSort(int arr[]) {
        int l = 0;
        int r = arr.length - 1;

        sort(arr, l ,r);
//        System.out.println(arr);
        return arr;
    }

    public static void main(String[] args) {
        int[] dataToSort = new int[] {38, 27, 43, 3, 9, 82, 10};
        int[] dataSorted = mergeSort(dataToSort);

        System.out.println(Arrays.toString(dataSorted));
//        dataSorted.toString();
    }
}
