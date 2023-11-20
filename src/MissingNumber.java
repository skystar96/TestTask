import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr1 = {4, -1, 1, 3, 2};
        int[] arr2 = {7, 9, 10, 11, 12};
        System.out.println(findMissingNum(arr1));
        System.out.println(findMissingNum(arr2));
    }

    public static int findMissingNum(int[] arr) {
        int min  = Arrays.stream(arr).min().getAsInt();
        int max  = Arrays.stream(arr).max().getAsInt();
        int sum = ((min + max) * (max - min + 1)) / 2;

        int curSum = 0;
        for (int num : arr) {
            curSum += num;
        }

        int missingNum = sum - curSum;

        return missingNum;
    }
}
