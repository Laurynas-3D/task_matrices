package Version202001;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class MatricesMultiply {

    private int[][] matrixA;
    private int[][] matrixB;

    SecureRandom sRandom = new SecureRandom();
    Random random = new Random();

    public MatricesMultiply() {

        populateMatrixA(10,10,11,99);
        populateMatrixB(10,10,11,99);
        outputArray(matrixA, "Printing Array A");
        outputArray(matrixB, "\nPrinting Array B");
    }

    public int[][] getMatrixA() {
        return matrixA;
    }

    public void setMatrixA(int[][] matrixA) {
        this.matrixA = matrixA;
    }

    public int[][] getMatrixB() {
        return matrixB;
    }

    public void setMatrixB(int[][] matrixB) {
        this.matrixB = matrixB;
    }

    /**
     * @param array to print
     * @param description string for description
     */
    public static void outputArray(int[][] array, String description){

        System.out.println(description);
        // loop through array's rows
        for(int row = 0; row < array.length; row++){
            //loop through columns of current row
            for (int column = 0; column < array[row].length; column++)
                System.out.printf("%d   ", array[row][column]);
            System.out.println();
        }
    }

    public void populateMatrixA(int rows, int columns, int minValue, int maxValue){

        int[][] matrix = new int[rows][columns];
        for(int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++)
                matrix[row] = random.ints(rows, minValue,maxValue).toArray();
        }
        this.matrixA = matrix;
    }

    public void populateMatrixB(int rows, int columns, int minValue, int maxValue){

        int[][] matrix = new int[rows][columns];
        for(int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++)
                matrix[row] = sRandom.ints(rows, minValue,maxValue).toArray();
        }
        this.matrixB = matrix;
    }
}


/*
https://www.mathsisfun.com/algebra/matrix-multiplying.html
https://mkyong.com/java/java-generate-random-integers-in-a-range/
http://www.java2s.com/Tutorials/Java/Java_Lambda/index.htm
https://www.geeksforgeeks.org/arrays-fill-java-examples/
 */