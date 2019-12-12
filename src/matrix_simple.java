
public class matrix_simple {

    int[][] grid1_test;
    int[] grid2_array;
    int[][] grid3_matrix1;
    int[][] grid4_matrix2;
    int[][] grid5;
    int[][] grid6;
    int[][] grid7_math_result;

    public matrix_simple() {

        simple_matrix();
        matrix_printer_elements(1,1);
        array_test(5);
        print_matrix_in_nested_loop(grid1_test,"GRID 1");

        separator();

    }

    private void simple_matrix() {

        int[][] numberGrid;

        numberGrid = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0, 11, 12}
        };

        this.grid1_test = numberGrid;
    }

    private void matrix_printer_elements(int line, int pos){
        System.out.println("\nSingle Element Print - " + grid1_test[line][pos]);
    }

    private void array_test(int num1){

        int[]numberGrid = new int[num1];

        System.out.print("array test with generator - ");
        System.out.print("[");
        for(int i = 0; i < numberGrid.length ; i++){
            numberGrid[i] = single_num_generator(1,10);
            System.out.print(" "+ numberGrid[i] + " ");
        }
        System.out.println("]");
        this.grid2_array = numberGrid;
    }

     protected int single_num_generator(int min, int max){
        int randomNumber1 = (int) ((Math.random()*((max-min)+1))+min);
        return randomNumber1;
    }

    protected int[][] print_matrix_in_nested_loop(int[][] grid, String print_phrase){

        int[][] numberGrid = grid;
        System.out.println("\n---- MATRIX RESULT = " + print_phrase + " !!! ----");
        for (int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid[i].length; j++) {
                System.out.print(numberGrid[i][j] + " " );
            }
            System.out.println();
        }

        return numberGrid;
    }

    private void separator(){
        System.out.println("###########MATRIX SIMPLE ENDS HERE##############");
    }

}
