package com.google;

import java.util.Arrays;
import java.util.Random;

/**
 * This is prototype for Lab 4.
 */
public class Lab4Test {

    public static void main(String[] args) {
        System.out.println("Каждия такая ____________________________ линия говорит об окончании задания\nИ после неё будет идти следующее задание в котором надо что-либо вывести!");
        System.out.println("____________________________");
        // PART 1
        // 1.1)
        float[] firstArray = new float[4];
        firstArray[0] = 1.4f;
        firstArray[3] = 4.1f;

        // TODO init it's array by new with size 4.


        // TODO insert some value to start of array and to end of array.


        int[] intArray = {1,4,5,2}; // TODO init and fill it's array with any values. Use {} syntax.

        // 1.2)
        int[] intArrayCopy = {}; // TODO copy "intArray". Use copyOf...
        int[] intArrayCopy2 = Arrays.copyOf(intArrayCopy, intArrayCopy.length);

        // 1.3)
        // TODO sort "intArrayCopy", use Arrays sort.
        Arrays.sort(intArrayCopy);

        // 1.4)
        // TODO print "intArrayCopy", use Arrays toString.

        System.out.println(Arrays.toString(intArrayCopy));
        System.out.println("____________________________");

        // 1.5)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
        if (Arrays.equals(intArrayCopy,intArray)){
            System.out.println("Arrays equals");
        }else{
            System.out.println("Arrays not equals");

        }
        System.out.println("____________________________");
        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value: testArray) {
            System.out.print(value + " ");

        }



        // 2.1)
        // TODO calc sum of all array elements and print result.
        int o = 0;
        for (int i = 0; i < testArray.length; i++) {
            o = o + testArray[i];

        }
        System.out.println("\n" + o);
        System.out.println("____________________________");
        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.
        o = 0;
        for (int i = 0; i < testArray.length; i++) {
            int p = i % 2;
            if (!(p == 0)){
                continue;
            }
            o = o + testArray[i];

        }
        System.out.println("\n" + o);
        System.out.println("____________________________");
        // 2.3)
        // TODO find max value in array.
        Arrays.sort(testArray);
        System.out.println(testArray[(testArray.length - 1)]);

        System.out.println("____________________________");


        // PART 3

        //3.1
        // TODO create two-dimensional array with size [3][4]
        int[][] arrInArr = new int[3][4];

        //3.2
        // TODO fill array with any numbers in cycles.
        int q = 1;
        Random random = new Random();

        for (int i = 0; i < arrInArr.length; i++) {
            for (int j = 0; j < arrInArr[i].length; j++) {
               int r = random.nextInt(9);
               arrInArr[i][j] = r;

            }


        }


//        for (int i = 0; i < arrInArr.length; i++) {
//            for (int j = 0; j < arrInArr.length; j++) {
//                System.out.println(Arrays.toString(arrInArr[i]));
//
//            }
//
//        }

        System.out.println(Arrays.toString(arrInArr[0]));
        System.out.println(Arrays.toString(arrInArr[1]));
        System.out.println(Arrays.toString(arrInArr[2]));
        System.out.println("____________________________");



        //3.3
        // TODO calc sum of all array elements and print result.


        int n = 0;
        for (int i = 0; i < arrInArr.length; i++) {
            for (int j = 0; j < arrInArr[i].length; j++) {
                n = n + arrInArr[i][j];


            }

        }
        System.out.println("Сумма чисел массива arrInArr : " + n);





        // PART 4*

        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row: matrix ) {
            Arrays.fill(row, ++ratio);
        }

        int sum = 0;
        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
//        for (int i = 0; i < matrix.length; i++) {
//
//            System.out.println(Arrays.toString(matrix[i]));
//
//
//        }
        int x = 0;
        int m = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (2 < i && i <= 5){
                    m++;
                    if (m == 3){
                        x++;
                        m = 0;
                    }

                }

            }


        }







        System.out.println("____________________________");
        long id = 0l;
        long l = 1l;
        m = 0;
        long[] arr = new long[x];
        int a = 0;


        for (int i = 0; i < matrix.length; i++) {
            int d = -1;

            for (int j = 0; j < matrix[i].length; j++) {

                //l = matrix[i][j];

                //m++;
                if (2 < i && i <= 5  ){
                    m++;



                    if (m == 3){

                        id = id + matrix[i][j];
                        System.out.print(matrix[i][j]);
                        arr[a] = matrix[i][j];
                        m = 0;
                        if (d == 1){
                            d = 0;
                            System.out.print("\n");
                        }else{
                            d++;
                        }

                        a++;
                    }

                }

            }


        }
        System.out.println(Arrays.toString(arr));



        System.out.println("Сумма всех значений которые подошли под условие :" + id);

        System.out.println("____________________________");



//        int[] ht = new int[array.length];
//        int[] ht2 = new int[array.length];






        Arrays.sort(arr);//Для унивирсальности программы
        long max = arr[arr.length - 1];


        long summ = 0;
        for (int i = 0; i < arr.length; i++) {

            long g = arr[i];
            if (max == g){
                summ = summ + g;
                //System.out.println(g);
            }




        }





        long min = arr[0];



        for (int i = 0; i < arr.length; i++) {

            long g = arr[i];
            if (min == g) {
                summ = summ + g;
                //System.out.println(g);
            }



        }
        System.out.println("Сумма всех минимальных и максимальных значений: " + summ);





    }
}