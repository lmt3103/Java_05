package project_utils;

public class Utils {

    // среднее значение чисел из массива
    public int printAverage(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a = a + arr[i];
        }

        return a / arr.length;

    }
    // количество элементов в массиве
    public int countArray(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a++;
        }

        return a;
    }
    // количество нечетных элементов в массиве
    public int countNechetArray(int[] arr) {
        int a = 0;
        for (int i = 1; i < arr.length; i = i + 2) {
            a++;
        }

        return a;
    }

    // количество четных элементов в массиве
    public int countChetArray(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            a++;
        }

        return a;
    }

    // последовательность случайных чисел от n до m, длина последовательности l
    public String randomChisla(int n, int m, int l) {
        String s = "";
        for (int i = 1; i <= l; i++) {
            s = (int) (Math.random() * (m + 1 - n) + n) + ", ";
        }

        return s;
    }
}
