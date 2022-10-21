public class OddEvenValuesInArray {

    /* 10.	Написать метод countEvenValuesInArray(),
    который принимает на вход массив целых чисел,
    и возвращает количество четных чисел в этом массиве
     */
    public int countEvenValuesInArray(int[] array){
        int countEv = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEv++;
            }
        }

        return countEv;
    }

    /* 11.	Написать метод countOddValuesInArray(),
    который принимает на вход массив целых чисел,
    и возвращает количество нечетных чисел в этом массиве
     */
    public int countOddValuesInArray(int[] array){
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOdd++;
            }
        }

        return countOdd;
    }


}
