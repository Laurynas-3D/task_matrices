package Version202001;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class MatricesMultiply {

    private int[][] matrixA;
    private int[][] matrixB;
    private int[][] matrixEnhanced;
    private int[][] matrixResult;

    SecureRandom sRandom = new SecureRandom();
    Random random = new Random();

    public MatricesMultiply() {

        populateMatrixA(6,6,2);
        populateMatrixB(6,6,2);
        outputArray(matrixA, "Printing Array A");
        outputArray(matrixB, "\nPrinting Array B");
        multiplyMatrices(matrixA, matrixB);
        outputArray(matrixResult, "\nPrinting result: ");

//        System.out.println("\n");
//        populateMatrixEnhanced(8,4,99);
//        outputArray(matrixEnhanced, "matrixEnhanced ========");

      //  outputArray(MatrixEnhanced, "\nPrinting MatrixEnhanced over outputArray() ");
    }

    /**
     * prints 2d array to command line.
     *
     * @param  array
     *         pass an 2d array to print
     *
     * @param description
     *        string for description
     */
    public static void outputArray(int[][] array, String description){

        System.out.println(description);
        for(int[] row: array) {
            for(int value: row)
                System.out.printf("%d ", value);
            System.out.println();
        }
    }

    /**
     * fills MatrixA 2d array with random data.
     *
     * @param  rows
     *         how many rows in 2d array should be
     *
     * @param columns
     *        how many columns in 2d array should be
     *
     * @param maxValue
     *        maximum value of each array element
     *
     */
    public void populateMatrixA(int rows, int columns, int maxValue){

        int[][] matrix = new int[columns][rows];
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                matrix[i][j] = sRandom.nextInt(maxValue);
            }
        }
        this.matrixA = matrix;
    }

    /**
     * fills MatrixB 2d array with random data.
     *
     * @param  rows
     *         how many rows in 2d array should be
     *
     * @param columns
     *        how many columns in 2d array should be
     *
     * @param maxValue
     *        maximum value of each array element
     *
     */
    public void populateMatrixB(int rows, int columns, int maxValue){

        int[][] arr2D  = new int[columns][rows];
        for(int i=0; i < arr2D.length; i++){
            for(int j=0; j < arr2D[i].length; j++){
                arr2D[i][j] = random.nextInt(maxValue);
            }
        }
        this.matrixB = arr2D;
    }

    // TODO: fix this piece
    int[][] populateMatrixEnhanced(int rows, int columns, int maxValue) {

        int[][] grid = new int[3][3];
        for (int[] row : grid) {
            for (int value : row) {
                value = random.nextInt(45);
                System.out.printf("&&& %d ", value);
                System.out.println();
            }
        }
        return this.matrixEnhanced = grid;
    }

    int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] result = new int[firstMatrix.length][secondMatrix[0].length];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
            }
        }

        return this.matrixResult = result;
    }

    int multiplyMatricesCell(int[][] firstMatrix, int[][] secondMatrix, int row, int col) {

        int cell = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }



}


/*
https://www.mathsisfun.com/algebra/matrix-multiplying.html
https://mkyong.com/java/java-generate-random-integers-in-a-range/
http://www.java2s.com/Tutorials/Java/Java_Lambda/index.htm
https://www.geeksforgeeks.org/arrays-fill-java-examples/
 */