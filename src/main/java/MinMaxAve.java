public class MinMaxAve {

    /* 8.	Написать алгоритм MinMaxAve, который принимает
    массив чисел int[] и 2 значения индексов.
    Алгоритм возвращает массив, который содержит минимальное значение,
    максимальное значение,  и среднее среди всех значений между 2-мя индексами.
     */
    public int[] MinMaxAve(int[] array, int a, int b){
        if (array!= null && array.length > 1 && a >= 0 && b >= 0 && b >= a && b < array.length) {
            int[] arrNew = new int[3];
            int max = array[a];
            int min = array[a];
            int sum = 0;


            for (int i = a; i <= b; i++) {
                if (max >= array[i]) {
                    max = max;
                    min = array[i];
                } else {
                    max = array[i];
                    min = min;
                }
                sum = sum + array[i];

            }


            sum = sum / (b - a + 1);

            arrNew[0] = min;
            arrNew[1] = max;
            arrNew[2] = sum;

            return arrNew;
        }

        return new int[0];

        }

}
