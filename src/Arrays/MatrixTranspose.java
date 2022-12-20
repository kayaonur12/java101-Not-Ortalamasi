package Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int row = matrix1.length;
        int column = matrix1[0].length;

        System.out.println("Current Matrix");
        for (int[] roww :
                matrix1) {
            for (int coll :
                    roww) {
                System.out.print(coll+"\t");
            }
            System.out.println();
        }
        System.out.println("==========");

        int reverseRow = column;
        int reverseColumn = row;
        int[][] matrix2 = new int[reverseRow][reverseColumn];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix2[j][i] = matrix1[i][j];
            }
        }

        System.out.println("Transposed Matrix");
        for (int[] roww :
                matrix2) {
            for (int coll :
                    roww) {
                System.out.print(coll+"\t");
            }
            System.out.println();
        }
    }
}
