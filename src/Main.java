public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double average = ArrayUtils.calculateAverage(array);
        System.out.println("Average: " + average);  //  3.0

        // isSquareMatrix
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] nonSquareMatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Is square matrix: " + ArrayUtils.isSquareMatrix(squareMatrix));  // true
        System.out.println("Is square matrix: " + ArrayUtils.isSquareMatrix(nonSquareMatrix));  // false

        //  null
        int[][] emptyMatrix = {};
        int[][] nullMatrix = null;

        System.out.println("Is square matrix: " + ArrayUtils.isSquareMatrix(emptyMatrix));  //  true
        System.out.println("Is square matrix: " + ArrayUtils.isSquareMatrix(nullMatrix));  // false
    }
}
