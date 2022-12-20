package Arrays;

public class LetterCreator {
    public static void main(String[] args) {
        String[][] list = new String[7][4];

        for (int i = 0; i < list.length; i++) {
            for (int k = 0; k < list[i].length; k++) {
                if (i == 0 || i == 3 || i == 6 || k == 0 || k == 3)
                    list[i][k] = " * ";
                else list[i][k] = "   ";
            }
        }
        //we can not use sout(Arrays.toString list) since it is a matrix
        for (String[] row : list) {
            for (String col :
                    row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

