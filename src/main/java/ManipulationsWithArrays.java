import com.sun.jdi.Value;

import java.util.Spliterator;

public class ManipulationsWithArrays {

    /*5.	Написать метод ByNumber(), который принимает на вход
массив целых чисел и число int number.
Метод возвращает массив тех же чисел, умноженных на number
 */
    public int[] ByNumber(int[] array, int number){
        int[] arrayRezult = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayRezult[i] = array[i] * number;
        }

        return arrayRezult;
    }

    /* 6.	Написать метод toDoubleArray(), который принимает на вход
    массив целых чисел,  и возвращает массив типа double[] из тех же чисел
     */
    public double[] toDoubleArray(int[] array) {
        double[] arrD = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            arrD[i] = (double) array[i];
        }

        return arrD;
    }

    /* 7.	Написать метод toIntArray(), который принимает на вход
    массив типа double[],  и возвращает массив типа int[] из тех же чисел
     */
    public int[] toIntArray(double[] array) {
        int[] arrD = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrD[i] = (int) array[i];
        }

        return arrD;
    }

    /* 8.	Написать метод toStringArray(), который принимает на вход
    массив целых чисел,  и возвращает массив типа String[]
    из тех же чисел (желательно не использовать метод .toString(),
    нужно переводить вручную)
     */
    public String[] toStringArray(int[] array) {
        //toStringArray(array);
        String[] arrD = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            arrD[i] = array[i] + "";
        }

        return arrD;
    }

    /* 9.	Перегрузить метод toStringArray() параметром double[].
    Этот метод должен возвращать массив типа String[]
    (желательно не использовать метод .toString(), нужно переводить вручную)
     */
    public String[] toStringArrayFromDouble(double[] array) {
        //toStringArray(array);
        String[] arrD = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            arrD[i] = array[i] + "";
        }

        return arrD;
    }


    /* 12.	В классе ManipulationsWithArrays написать
    метод areValuesGreaterThanNumber(), который принимает на вход
    массив целых чисел и число number.
    Метод возвращает значение true, если все элементы массива больше number,
    иначе возвращает false
     */
    public boolean areValuesGreaterThanNumber(int[] array, int number) {
        int kol = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                kol ++;
            }
        }
        if (kol == array.length) {

            return true;
        } else {

            return false;
        }
    }


}
