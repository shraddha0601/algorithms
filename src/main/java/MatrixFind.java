/**
 * Created with IntelliJ IDEA.
 * User: shraddha
 * Date: 3/8/15
 * Time: 7:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class MatrixFind {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,   3,  5,  7},
                { 10, 11, 16, 20},
                { 23, 30, 34, 50},
        };

        System.out.println(findElement(matrix, 23));
    }

    private static boolean findElement(int[][] matrix, int i) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int row = 0;
        int col = colLength - 1;
        while (row < rowLength && col >=0) {
            if (matrix[row][col] == i) {
                System.out.println(": row:" + row + ": col" + col);
                return true;
            }
            if (matrix[row][col] > i) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }
}
