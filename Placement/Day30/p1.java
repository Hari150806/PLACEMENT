package Placement.Day30;

public class p1 { // row with max 1s
    public static int rowWithMax1s(int[][] matrix) {
        int maxRowIndex = -1;
        int maxCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 1, 1, 1},
            {0, 0, 0, 0}
        };

        int result = rowWithMax1s(matrix);
        System.out.println("Row with maximum 1s: " + result);
    }
    
}
