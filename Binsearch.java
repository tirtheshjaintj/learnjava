public class Binsearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 12 };
        int msg = binsearch(arr, 12);
        System.out.println(msg);
    }

    // Function For Binary Search
    static int binsearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Due To Limit Of Integers
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return arr[mid];

    }
}
