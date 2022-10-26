import project_utils.Utils;

import java.lang.reflect.Array;

public class OddIndicess {
    /* 2. Написать алгоритм OddIndices, который принимает массив целых чисел,
и возвращает массив значений нечетных индексов
*/
    public int[] OddIndices(int[] array) {
        if (array.length > 0) {
            // вычисляем длинну массива нечетных элементов
            // можно посчитать длину массива, как длину поделить на 2
            int s = new Utils().countNechetArray(array);
            int[] arrResult = new int[s];
            int count = 0;
            for (int i = 1; i < array.length; i = i + 2) {
                arrResult[count] = array[i];
                count++;
            }

            return arrResult;
        } else {

            return new int[0];
        }


    }
}
