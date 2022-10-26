public class ReverseArray {

    /* 11.	 Написать алгоритм ReverseArray, который принимает на вход
    массив целых чисел, и возвращает “перевернутый” массив.
     */
    public int[] reverseArray(int[] array) {
        int[] arrR = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrR[array.length - 1 - i] = array[i];
        }

        return arrR;
    }
}
