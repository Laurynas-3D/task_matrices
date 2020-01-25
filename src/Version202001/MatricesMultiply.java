package Version202001;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class MatricesMultiply {

    private int[][] matrixA;
    private int[][] matrixB;
    private int[][] MatrixEnhanced;

    SecureRandom sRandom = new SecureRandom();
    Random random = new Random();

    public MatricesMultiply() {

        populateMatrixA(8,8,9);
        populateMatrixB(8,8,9);
        populateMatrixEnhanced(8,4,99);
        outputArray(matrixA, "Printing Array A");
        outputArray(matrixB, "\nPrinting Array B");

        outputArray(MatrixEnhanced, "\nPrinting MatrixEnhanced over outputArray() ");
    }

    /**
     * @param array to print
     * @param description string for description
     */
    public static void outputArray(int[][] array, String description){

        System.out.println(description);
        for(int[] row: array) {
            for(int value: row)
                System.out.printf("%d ", value);
            System.out.println("");
        }
    }

    public void populateMatrixA(int rows, int columns, int maxValue){

        int[][] matrix = new int[columns][rows];
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                matrix[i][j] = sRandom.nextInt(maxValue);
            }
        }
        this.matrixA = matrix;
    }

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
    public void populateMatrixEnhanced(int rows, int columns, int maxValue) {

        int[][] grid = new int[3][3];
        for (int[] row : grid) {
            for (int value : row) {
                value = random.nextInt(45);
                System.out.printf("&&&&&& %d ", value);
                System.out.println();
            }
        }
        this.MatrixEnhanced = grid;
    }



}


/*
https://www.mathsisfun.com/algebra/matrix-multiplying.html
https://mkyong.com/java/java-generate-random-integers-in-a-range/
http://www.java2s.com/Tutorials/Java/Java_Lambda/index.htm
https://www.geeksforgeeks.org/arrays-fill-java-examples/
 */