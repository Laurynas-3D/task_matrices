package Version201912;

import java.util.Arrays;

public class matrix_better extends matrix_simple{

    public matrix_better(int matrixA_first_value,
                         int matrixA_second_value,
                         int matrixA_min_range,
                         int matrixA_max_range,
                         int matrixB_min_range,
                         int matrixB_max_range){

        super(matrixA_first_value, matrixA_second_value,matrixA_min_range,matrixA_max_range,matrixB_min_range,matrixB_max_range);

        matrixA(matrixA_first_value,matrixA_second_value,matrixA_min_range,matrixA_max_range);
        matrixB(matrixA_first_value,matrixA_first_value,matrixB_min_range,matrixB_max_range);
        math_with_matrices(grid3_matrix1,grid4_matrix2);
        print_matrix_in_nested_loop(grid7_math_result,"GRID 7 - VOILA");
//        print_2d_array_utility();
//        print_returned_result();
    }

    /**
     @param num1 defines matrixA array size
     @param num2 defines matrixA array size
     @param num3 defines generated minimum range of matrixA value
     @param num4 defines generated maximum range of matrixA value
     */
    private void matrixA(int num1, int num2,int num3, int num4){

        int[][]numberGrid = new int[num1][num2];

        System.out.println("\n---- MATRIX 1 ----" );
        for(int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid.length; j++) {
                numberGrid[i][j] = single_num_generator(num3, num4);
                System.out.print(" " + numberGrid[i][j] + " ");
            }
            System.out.println();
        }
        this.grid3_matrix1 = numberGrid;
    }

    /**
     @param num1 defines matrixB array size
     @param num2 defines matrixB array size
     @param matrix2_min_range defines generated minimum range of matrixB value
     @param matrix2_max_range defines generated maximum range of matrixB value
     */
    private void matrixB(int num1, int num2, int matrix2_min_range, int matrix2_max_range){

        int[][]numberGrid = new int[num1][num2];

        System.out.println("\n---- MATRIX 2 ----" );
        for(int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid.length; j++) {
                // TODO: implement parameter features here. Done. (2019.12.16)
                // here you can change matrix 2 multiplication values
                numberGrid[i][j] = single_num_generator(matrix2_min_range, matrix2_max_range);
                System.out.print(" " + numberGrid[i][j] + " ");
            }
            System.out.println();
        }
        this.grid4_matrix2 = numberGrid;
    }

    private int[][] math_with_matrices(int[][] matrix1, int[][] matrix2){

        //TODO: can't figure out why this does not work
        //int columns = super.matrix_first_value;
        //int rows = super.matrix_second_value;

        //instead use manual matrix size adoption
        int columns = 10;
        int rows = 10;

        // Multiply Two matrices
        int[][] matrix_math = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix_math[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        this.grid7_math_result = matrix_math;
        return matrix_math;
    }

    @Deprecated
    private void print_2d_array_utility() {
        System.out.println(Arrays.deepToString(grid7_math_result));

    }
}
