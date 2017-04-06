package slavik.labs.l_2_2;
public class Main {
    public static void main(String[] args) {
        Matrx array = new Matrx();
        int[][] arr1 = {{1, -2, 3, 4}, {2, -3, 5, 6}, {2, 4, -6, 7}, {2, 4, 5, -8}};
        System.out.println("----------------");
        array.view(arr1);
        System.out.println("----------------");
        System.out.println();
        System.out.println("----------------");
        int[][] arr2 = {{2, -2, 6, 3}, {4, 6, 8, 2}, {8, 4, 6, 1}, {-2, 4, 5, 8}};
        array.view(arr2);
        System.out.println("----------------");
        int[][] sum = array.add(arr1, arr2);
        System.out.println();
        System.out.println("----------------");
        array.view(sum);
        System.out.println("----------------");
        int[][] multi = array.multi(arr1, arr2);
        System.out.println();
        System.out.println("----------------");
        array.view(multi);
        System.out.println("----------------");
    }
}