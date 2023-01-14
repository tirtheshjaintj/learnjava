import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 12, 12, 23, 45, 13, 45, 67, 89, 234, 647, 123354, 4325, 4325, 456457657, 65, 7656,
                7, 432, 234, 123, 42, 3543, 5787, 69, 780, 8, 890, 423, 4, 36, 65875 };
        int tg = 11;
        // int msg = binsearch(arr, tg);
        int msg = ceiling(arr, tg);
        System.out.println(Arrays.toString(arr));
        System.out.println("Found " + tg + " At Index " + msg);
    }

    // Floor Of Array
    static int ceiling(int[] arr, int target) {
        int t;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds
            // the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return arr[end];
    }

    // Function For Binary Search
    static int binsearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int t;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        while (start <= end) {
            // Due To Limit Of Integers
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (arr[start] < arr[end]) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }

        }
        return -1;

    }
}
