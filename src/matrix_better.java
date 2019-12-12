import java.util.Arrays;

public class matrix_better extends matrix_simple{

    public matrix_better(int matrix_first_value, int matrix_second_value){

        super(matrix_first_value, matrix_second_value);

        matrix_1(matrix_first_value,matrix_second_value);
        matrix_2(matrix_first_value,matrix_second_value);
        math_with_matrices(grid3_matrix1,grid4_matrix2);

//        print_matrix_in_nested_loop(grid5,"GRID 5");
        print_matrix_in_nested_loop(grid7_math_result,"GRID 7 - VOILA");
//        print_2d_array_utility();
//        print_returned_result();
    }



    private void matrix_1(int num1, int num2){

        int[][]numberGrid = new int[num1][num2];

        System.out.println("\n---- MATRIX 1 ----" );
        for(int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid.length; j++) {
                numberGrid[i][j] = single_num_generator(2, 8);
                System.out.print(" " + numberGrid[i][j] + " ");
            }
            System.out.println();
        }
        this.grid3_matrix1 = numberGrid;
    }

    private void matrix_2(int num1, int num2){

        int[][]numberGrid = new int[num1][num2];

        System.out.println("\n---- MATRIX 2 ----" );
        for(int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid.length; j++) {
                numberGrid[i][j] = single_num_generator(2, 2);
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
