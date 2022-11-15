package top.dl.java.tool.array;

public class arraytools {
    public static int getmax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] sort(int[] arr) {
        int min;
        int temp;
        for (int a = 0; a < arr.length - 1; a++) {
            min = a;
            for (int j = a + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                }
            }
        }

        return arr;
    }
}