public class PeakElement {

    /* 10.	Написать алгоритм PeakElement,  который принимает на вход
    массив целых чисел и возвращает значения
    пиковых элементов (элементы, которые больше своих соседей).
     */
    public int[] peakElement(int[] array) {
        int[] arrayP = new int[array.length];
        int ind = 0;

        // сначала аналогично рассчитать длину массива
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array[i] > array[i + 1]) {
                    arrayP[ind] = array[i];
                    ind++;
                }
            }
            if (i > 0 && i < (array.length - 1)) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    arrayP[ind] = array[i];
                    ind++;
                }
            } else if (i == array.length) {
                if (array[i] > array[i - 1]) {
                    arrayP[ind] = array[i];
                }
            }

        }

        return array;
    }

}
