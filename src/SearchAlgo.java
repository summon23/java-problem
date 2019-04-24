public class SearchAlgo {
    private static int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - 1) / 2;

            if (x == arr[m]) return 1;
            if (x == arr[l] || x == arr[r]) return 1;

            if (x > arr[m]) {
                l = m + 1;
            }

            if (x < arr[m]) {
                r = m - 1;
            }

        }

        return -1;
    }


    public static void main(String[] args) {
        int[] collection = {2,5,8,12,16,23,38,56,72,91};
        int result = binarySearch(collection, 99);
        System.out.println(result);
    }
}
