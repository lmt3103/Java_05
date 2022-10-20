public class SumArray {
    /* 3.	Написать алгоритм SumArray, который возвращает
    сумму всех чисел массива
     */
    public int SumArray(int[] array) {
        if (array.length > 0) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }

            return sum;
        } else {

            return 0;
        }
    }

}
