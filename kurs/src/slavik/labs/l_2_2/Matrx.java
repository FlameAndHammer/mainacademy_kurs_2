package slavik.labs.l_2_2;
public class Matrx {
    public int [][] add (int[][]arr1, int[][]arr2){
      int size = arr1.length;
        int [][] sum = new int [size][size];
        for (int i = 0; i < sum.length; i++) {
        for (int j = 0; j < sum[i].length ; j++) {
        sum[i][j] = arr1 [i][j] + arr2 [i][j];
       }
      }
    return sum;
   }


    public int [][] multi (int[][]arr1, int[][]arr2){
        int size = arr1.length;
        int [][] multi = new int [size][size];
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length ; j++) {
                multi[i][j] = arr1 [i][j] * arr2 [i][j];
            }
        }
        return multi;
    }

    public void view (int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}