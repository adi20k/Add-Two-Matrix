package add;

public class MatrixAdd {

	public static void main(String[] args) {
		int r = 2, c = 3;
        int[][] Matrix1 = { {4, 3, 4}, {7, 2, -8} };
        int[][] Matrix2 = { {6, -2, 3}, {0, 8, 3} };

        
        int[][] sum = new int[r][c];
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] =Matrix1[i][j] + Matrix2[i][j];
            }
        }

        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }

	}

}
