public class CreateArray {

    /* 1.	В голубой папке java создать класс CreateArray,
    написать в этом классе метод createIntArray(),
    который принимает на вход 5 целых чисел,
    и возвращает массив из этих же чисел.
     */
    public int[] createIntArray(int a, int b, int c, int d, int e) {

        return new int[]{a, b, c, d, e};
    }

    /* 2.	Написать метод createDoubleArray(), который принимает на вход
    5 чисел типа double, и возвращает массив из этих же чисел
     */

    public double[] createDoubleArray(double a, double b, double c, double d, double e) {

        return new double[]{a, b, c, d, e};
    }

    /* 3.	Написать метод createStringArray(), который принимает
    на вход 5 слов, и возвращает массив из этих слов
     */

    public String[] createStringArray(String a, String b, String c, String d, String e){

        return new String[]{a, b, c, d, e};
    }




}
