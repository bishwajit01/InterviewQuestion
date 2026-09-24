package interview.epam;

import java.util.Arrays;

public class Question1 {

    public static void main() {

        int []arr = new int[] {10, 12, 0, 4, 31, 0, 58, 0};

        int j =0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
