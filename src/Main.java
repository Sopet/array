import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        // Создаю новый массив на 12 ячеек
        int[] arr = new int[12];
        // Присваиваю первой ячейке (по индексу 0) значение 1
        arr[0] = 1;
        // Присваиваю второй ячейке (по индексу 1) значение 2
        arr[1] = 2;
        // Присваиваю третьей ячейке (по индексу 2) значение 3
        arr[2] = 3;
        // Присваиваю последней ячейке (по индексу 11) значение 1
        arr[11] = 1;
        // Запускаю цикл, который пройдётся по 12 ячейкам массива
        for (int index = 0; index < arr.length; index++) {
            // Вывожу значения элементов массива arr
            System.out.print(arr[index] + " ");
        }
        System.out.println();
        // Создаю новый массив на 12 ячеек
        double[] arrD = {1.57, 7.654, 9.986, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
        // Запускаю цикл, который пройдётся по 12 ячейкам массива
        for (int index = 0; index < arrD.length; index++) {
            // Вывожу значения элементов массива arrD
            System.out.print(arrD[index] + " ");
        }


        System.out.println("\n\n" + "Задание 2");
        // Запускаю цикл, который пройдётся по заполненным ячейкам массива
        for (int index = 0; index < arr.length - 1; index++) {
            // Вывожу до 2-го значения элементов массива по порядку через запятую
            System.out.print(arr[index] + ", ");
        }
        // Вывожу 3-е значение элемента массива
        System.out.println(arr[arr.length - 1]);
        // Запускаю цикл, который пройдётся по заполненным ячейкам массива
        for (int index = 0; index < arrD.length - 1; index++) {
            // Вывожу до 2-го значения элементов массива по порядку через запятую
            System.out.print(arrD[index] + ", ");
        }
        // Вывожу 3-е значение элемента массива
        System.out.println(arrD[arrD.length - 1]);


        System.out.println("\n" + "Задание 3");
        // Запускаю цикл, который пройдётся по заполненным ячейкам массива в обратном порядке
        for (int index = arr.length - 1; index > 0; index--) {
            // Вывожу со 2-го значения элементов массива в обратном порядке через запятую
            System.out.print(arr[index] + ", ");
        }
        // Вывожу 1-е значение элемента массива
        System.out.println(arr[0]);
        for (int index = arrD.length - 1; index > 0; index--) {
            // Вывожу со 2-го значения элементов массива в обратном порядке через запятую
            System.out.print(arrD[index] + ", ");
        }
        // Вывожу 1-е значение элемента массива
        System.out.println(arrD[0]);


        System.out.println("\n" + "Задание 4");
        // Запускаю цикл, который пройдётся по 12 ячейкам массива
        for (int index = 0; index < 12; index++) {
            // Запускаю условный оператор деления с нулевым остатком для выявления нечётного числа
            if (arr[index] % 2 != 0) {
                // к нечётному числу прибавляю 1
                arr[index] ++;
            }
        }
        // Вывожу значения элементов массива arr
        System.out.print(Arrays.toString(arr));
    }
}