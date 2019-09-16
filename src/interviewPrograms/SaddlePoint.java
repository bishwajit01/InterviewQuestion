/**
 * 
 */
package interviewPrograms;

/**
 * @author Bishwajit.
 *
 */
public class SaddlePoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		display(matrix);
		int saddlePoint = findSaddlePoint(matrix);
		if (saddlePoint == 0)
			System.out.println("No Saddle Point");
		else
			System.out.println("Saddle Point :: " + saddlePoint);
	}

	private static void display(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static int findSaddlePoint(int[][] matrix) {
		int saddlePoint = 0;
		int max = 0, min = 0;
		for (int i = 0; i < matrix.length; i++) {
			min = minimumInRow(i, matrix);
			for (int j = 0; j < matrix.length; j++) {
				max = maximumInColumn(j, matrix);
				if (min == max) {
					saddlePoint = min;
					break;
				}
			}
		}
		return saddlePoint;
	}

	private static int minimumInRow(int row, int matrix[][]) {
		int min = matrix[row][0];
		for (int i = 0; i < matrix.length; i++) {
			if (min > matrix[row][i]) {
				min = matrix[row][i];
			}
		}
		return min;
	}

	private static int maximumInColumn(int column, int matrix[][]) {
		int max = matrix[column][0];
		for (int i = 0; i < matrix.length; i++) {
			if (max < matrix[i][column]) {
				max = matrix[i][column];
			}
		}
		return max;
	}

}
