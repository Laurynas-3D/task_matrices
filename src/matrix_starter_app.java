public class matrix_starter_app {

    public static void main(String[] args){

       // matrix_simple numbers_grid_1 = new matrix_simple();

        //first parameter - matrix 1 and matrix 2 size in columns
        //second parameter - matrix 1 and matrix 2 size in rows
        //third parameter - minimum number range of matrix 1 value
        //fourth parameter - maximum number range of matrix 1 value
        //fifth parameter - minimum number range of matrix 2 value
        // sixth parameter - maximum number range of matrix 2 value

        matrix_better numbers_grid2 = new matrix_better(10,10,2,9,4,4);

    }
}

/** TASK:
 * The task is to multiply 2D-matrices of square size in Java. You should show your skills of writing efficient
 * parallel code and knowledge of OOP practices.
 *
 * 1) Multiply 2 matrices of the same size. Let the size be in the range [1..10000].
 * 2) Use 0 and 1 as only allowed values in the matrix. Modulo 2 operation should be applied to all internal
 * "add" and "multiply" operations.
 * 3) You can use any of java version.
 * 4) Publish the project to Github git repository and provide us with a link.
 * 5) Prepare a main entry point which reads an unsigned integer number as input from console and executes
 * sequential and parallel versions of the algorithm and prints execution time to console of both of them.
 **/
    /*
    Multiply two matrices, same size

    **Implemented Features**
        - Matrix is 2D Array
        - You can control matrix size with parameters
        - Matrix values are auto generated numbers within given range of your choice
        - You can change matrix values with parameters

    **Details of Project**
        - matrix_simple java class is for testing purposes
        - matrix_better java class where all magic happens
    */