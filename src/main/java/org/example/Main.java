package org.example;

public class Main {
    public static void main(String[] args) {

       // Найти сумму элементов главной диагонали в двумерном массиве.
       // Найти сумму элементов побочной диагонали в двумерном массиве.
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
       // ```java public void findMainDiagonalSum(int[][] matrix)
        int[][] in = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        // предположим что матрица будет квадратная
        findMainDiagonalSum(in);
    }

    public static void findMainDiagonalSum(int[][] matrix){
        int[] out1 = new int[matrix.length];
        int[] out2 = new int[matrix[0].length];
        String pref = "%-12s%s%n";
        System.out.printf(pref,"гл.диаг","поб.диаг");
        for (int i = 0; i < matrix.length; i++) {
            out1[i]=matrix[i][i];
            out2[i]=matrix[i][matrix[0].length-1-i];
            System.out.printf(pref,"\t"+out1[i],out2[i]);
        }
    }
}