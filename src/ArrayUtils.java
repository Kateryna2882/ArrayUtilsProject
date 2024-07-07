public class ArrayUtils {
public static double calculateAverage(int[] array) {
    if (array.length == 0) {
        throw new IllegalArgumentException("Array cannot be empty");
    }

    double sum = 0;
    for (int num : array) {
        sum += num;
    }
    return sum / array.length;
}
    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null) {
            return false;
        }

        int rows = matrix.length;
        for (int[] row : matrix) {
            if (row.length != rows) {
                return false;
            }
        }
        return true;
    }

}
