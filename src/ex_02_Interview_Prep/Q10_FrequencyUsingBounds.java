package ex_02_Interview_Prep;

public class Q10_FrequencyUsingBounds {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};

        int x = 2;

        int lb = lowerBound(arr, x);
        int ub = upperBound(arr, x);

        int frequency = ub - lb;

        System.out.println("Frequency of " + x + " is " + frequency);
    }
    static int lowerBound(int[] arr, int x) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
}

static int upperBound(int[] arr, int x) {
    int low = 0;
    int high = arr.length;

    while (low < high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] > x) {
            high = mid;
        } else {
            low = mid + 1;
        }
    }
    return low;
    }
}

