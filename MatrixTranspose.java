

//💡 **Question 3**
//        Given a 2D integer array matrix, return *the **transpose** of* matrix.
//
//        The **transpose** of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
//
//        **Example 1:**
//
//        Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//
//        Output: [[1,4,7],[2,5,8],[3,6,9]]



package ppt_assignment4;

public class MatrixTranspose {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposeMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] transposedMatrix = transpose(matrix);

        // Print the transposed matrix
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[0].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
