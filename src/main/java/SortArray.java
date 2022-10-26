public class SortArray {

    /* 12.	Написать алгоритм SortArray, который принимает на вход
    массив целых чисел, и сортирует элементы массива в порядке возрастания.
     */
    public int[] sortArray(int[] array) {

        if (array.length > 0) {
            int res;

            for (int j = 0; j < array.length - 1; j++) {
                for (int i = 0; i < array.length - 1 - j; i++) {
                    if (array[i] > array[i + 1]) {
                        res = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = res;
                    }
                }
            }

            return array;
        }

        return new int[0];
    }
}

