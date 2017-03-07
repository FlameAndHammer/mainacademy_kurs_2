package _nikulin.labs.lab_1_6_3;

public class Main {
    public static void main(String[] args) {
        int sizeArray = 6;
        int[][] arrayTwoInt = new int [sizeArray][sizeArray];

        int number = 1;
        for(int column=0; column<arrayTwoInt[0].length; column++) {
            for (int row = 0; row < arrayTwoInt.length; row++) {
                arrayTwoInt[row][column] = number++;
            }
        }

        for(int row[] : arrayTwoInt) {
            for (int elemRow : row) {
                System.out.print(elemRow + "\t");
            }
            System.out.println();
        }
    }
}
