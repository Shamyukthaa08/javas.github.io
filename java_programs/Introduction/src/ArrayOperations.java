
    import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] originalArray = {5, 12, 9, 42, 67, 23};

        
        int[] sortedArray = sortArray(originalArray);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));

        
        int digitSum = sumDigitsInArray(originalArray);
        System.out.println("Sum of Digits: " + digitSum);

        
        int[] copiedArray = copyArray(originalArray);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }

   
    public static int[] sortArray(int[] arr) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        return sorted;
    }

   
    public static int sumDigitsInArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += sumOfDigits(num);
        }
        return sum;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }
}

    

